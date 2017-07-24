/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stamps;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Magda
 */

public class Database {
 
    final static String connectionURL = "jdbc:mysql://localhost:3306/stampspl?autoRecconect=true&useSSL=false";
    final static String login = "root";
    final static String password = "root27"; 
    static Connection connection = null;
    final static String[] columnNames = {"Catalog nr", "Image", "Name", "Unit", "Release date", "Production", "In collection", "Stamped"};
    static int selected = -1;
    static TheModel model;
    
    public static void getConnection() throws SQLException, FileNotFoundException {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            connection = DriverManager.getConnection(connectionURL, login, password);
        }       
        catch (Exception ex) {
            ex.printStackTrace();
        }   
    }
    
    public static void setSelected(int row) {
        selected = row;
    }
    
    public static int getSelected() {
        return selected;
    }
    
    public static void setModel(TheModel m) {
        model = m;
    }
    
    public static TheModel getModel() {
        return model;
    }
    
    public static Stamp getSelectedStampValues() {
        String selectedNr = model.getValueAt(selected, 0).toString();
        String query = "SELECT NR, PHOTO, NAME, UNIT, RELEASE_DATE, PRODUCTION, IN_COLLECTION, STAMPED FROM stampspl WHERE NR = " + selectedNr;
        Statement st;
        ResultSet rs;
        Stamp stamp = null;
        try {
            st = connection.createStatement();
            rs = st.executeQuery(query);
            while (rs.next()) {
                stamp = new Stamp(rs.getInt("NR"), 
                        rs.getBytes("PHOTO"), 
                        rs.getString("NAME"), 
                        rs.getString("UNIT"), 
                        rs.getDate("RELEASE_DATE"), 
                        rs.getLong("PRODUCTION"), 
                        rs.getBoolean("IN_COLLECTION"), 
                        rs.getBoolean("STAMPED"));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        return stamp;
    }
    

    public static ArrayList<Stamp> getStampsFromDB() {       
        ArrayList<Stamp> stampsList = new ArrayList<Stamp>();
        String query = "SELECT NR, PHOTO, NAME, UNIT, RELEASE_DATE, PRODUCTION, IN_COLLECTION, STAMPED FROM stampspl";
        Statement st;
        ResultSet rs;
        
        try {
            st = connection.createStatement();
            rs = st.executeQuery(query);
            Stamp stamp;
            while (rs.next()) {
                stamp = new Stamp(rs.getInt("NR"), 
                        rs.getBytes("PHOTO"), 
                        rs.getString("NAME"), 
                        rs.getString("UNIT"), 
                        rs.getDate("RELEASE_DATE"), 
                        rs.getLong("PRODUCTION"), 
                        rs.getBoolean("IN_COLLECTION"), 
                        rs.getBoolean("STAMPED"));
                stampsList.add(stamp);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        return stampsList;
    }
       
    
    public static java.sql.Date convertDate(java.util.Date date) {
        java.sql.Date sqlDate = new java.sql.Date(date.getTime());
        return sqlDate;
    }
        
    
    public static int addRecord(Stamp st) throws SQLException, FileNotFoundException {  
        PreparedStatement psmnt;
        FileInputStream fis = null;
        int s;

        //add new row: information about stamp and photo
        psmnt = connection.prepareStatement("insert into stampspl(NR, PHOTO, NAME, UNIT, RELEASE_DATE, PRODUCTION, IN_COLLECTION, STAMPED) " + "values(?,?,?,?,?,?,?,?)");
        psmnt.setInt(1,st.getCatalogNr());
        
        try {
            File image = st.getPhotoFile();
            fis = new FileInputStream(image);
            psmnt.setBinaryStream(2, (InputStream)fis, (int)(image.length()));
        } catch (Exception ex) {
            psmnt.setBinaryStream(2, null);
        }
        
        psmnt.setString(3, st.getName());
        psmnt.setString(4, st.getUnit());
        psmnt.setDate(5, convertDate(st.getReleaseDate()));
        psmnt.setLong(6, st.getProduction());
        
        if (st.getInCollection()==true)
            psmnt.setInt(7, 1);
        else
            psmnt.setInt(7, 0);
        if (st.getStamped()==true)
            psmnt.setInt(8, 1);
        else
            psmnt.setInt(8, 0);
        
        try {
            s = psmnt.executeUpdate();
        }
        catch (Exception e) {
            String doubleNr = "Duplicate entry '" + st.getCatalogNr() + "' for key 'PRIMARY'";
            if (e.getMessage().equals(doubleNr))
                s = -2;
            else
                s = 0;
        }
        return s;
    }
    
    
    public static int updateRecord(Stamp stampBefore, Stamp stampAfter) throws FileNotFoundException, SQLException {
        File image = null;
        FileInputStream fis = null;
        PreparedStatement psmnt;
        String query;
        int s;
        int n = 8;
        
        if (stampAfter.getPhotoFile() != null) {
            image = stampAfter.getPhotoFile();
            fis = new FileInputStream(image);
            query = "update stampspl SET NR=?, NAME=?, UNIT=?, RELEASE_DATE=?, PRODUCTION=?, IN_COLLECTION=?, STAMPED=?, PHOTO=? WHERE NR = ?";
            n = 9;
        } else {
            query = "update stampspl SET NR=?, NAME=?, UNIT=?, RELEASE_DATE=?, PRODUCTION=?, IN_COLLECTION=?, STAMPED=? WHERE NR = ?";
        }

        //update the row 
        psmnt = connection.prepareStatement(query);
        psmnt.setInt(1,stampAfter.getCatalogNr());
        psmnt.setString(2, stampAfter.getName());
        psmnt.setString(3, stampAfter.getUnit());
        psmnt.setDate(4, convertDate(stampAfter.getReleaseDate()));
        psmnt.setLong(5, stampAfter.getProduction());
        psmnt.setInt(n, stampBefore.getCatalogNr());
        if (n == 9)
            psmnt.setBinaryStream(8, (InputStream)fis, (int)(image.length()));
        
        if (stampAfter.getInCollection()==true)
            psmnt.setInt(6, 1);
        else
            psmnt.setInt(6, 0);
        if (stampAfter.getStamped()==true)
            psmnt.setInt(7, 1);
        else
            psmnt.setInt(7, 0);
        
        try {
            s = psmnt.executeUpdate();
        }
        catch (Exception e) {
            String doubleNr = "Duplicate entry '" + stampAfter.getCatalogNr() + "' for key 'PRIMARY'";
            if (e.getMessage().equals(doubleNr))
                s = -2;
            else
                s = 0;
        }
        return s;    
    }

    
    public static String removeRecord(int row, TheModel model) throws SQLException, FileNotFoundException {
        String selectedNr = model.getValueAt(row, 0).toString();
        String query = "DELETE FROM stampspl WHERE NR = " + selectedNr;
        String info;
        Database.getConnection();
        try {
            Statement st = connection.prepareStatement(query);
            st.executeUpdate(query);
            info = "deleted";
        } catch (SQLException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
            info = "not deleted";
        }
        return info;
    }    
    
    
    static void closeConnection() {
        try {
            connection.close();
        } 
        catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
