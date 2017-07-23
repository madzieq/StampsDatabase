/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stamps;

import java.awt.Image;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Magda
 */

// Polish Stamps' DB (only several stamps): example of CRUD implementation


public class MainWindow extends javax.swing.JFrame {

    //Creates new form GUI
    public MainWindow() throws SQLException, FileNotFoundException {
        Image icon = new ImageIcon(this.getClass().getResource("stamp.png")).getImage();
        this.setTitle("Polish stamps database");
        this.setIconImage(icon);
        initComponents();
        populateJTable();
    }
    
    
    //Display the SQL query
    public void executeSQLQuery(String message) throws SQLException, FileNotFoundException {
        JOptionPane.showMessageDialog(null, "Data " + message + " successfully.");
        refreshJTable();
    }
    
    
    //Refresh JTable data
    public void refreshJTable() throws SQLException, FileNotFoundException {
        populateJTable();
    }
 
    
    //Input data from database to Jtable
    public TheModel populateJTable() throws SQLException, FileNotFoundException {
        Database.getConnection();
        Database db = new Database();
        ArrayList<Stamp> list = db.getStampsFromDB();  
        Object[][] rows = new Object[list.size()][8];
        
        //Input stamps' images to Jtable
        for(int i=0; i<list.size(); i++) {
            rows[i][0] = list.get(i).getCatalogNr();
            
            if (list.get(i).getImage() != null) {
                ImageIcon image = new ImageIcon(new ImageIcon(list.get(i).getImage()).getImage());
                rows[i][2] = image;
            }
            else {
                rows[i][2] = null;
            }
            
            //Input stamps' information to Jtable
            rows[i][1] = list.get(i).getName();
            rows[i][3] = list.get(i).getUnit();
            rows[i][4] = list.get(i).getReleaseDate();
            rows[i][5] = list.get(i).getProduction();
            rows[i][6] = list.get(i).getInCollection();
            rows[i][7] = list.get(i).getStamped();           
        }
        
        TheModel model = new TheModel(rows, Database.columnNames);
        jTable_Stamps.setModel(model);
        jTable_Stamps.setRowHeight(80);
        jTable_Stamps.getColumnModel().getColumn(4).setPreferredWidth(50);
        jTable_Stamps.setRowMargin(4);
        
        return model;
    }
    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Stamps = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jButton_Add = new javax.swing.JButton();
        jButton_Edit = new javax.swing.JButton();
        jButton_Delete = new javax.swing.JButton();
        jButton_RefreshView = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel1.setText("Polish Stamps Database");

        jTable_Stamps.setAutoCreateRowSorter(true);
        jTable_Stamps.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable_Stamps.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTable_Stamps.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Catalog nr", "Name", "Photo", "Unit", "Release date", "Production", "In collection", "Stamped"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Boolean.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable_Stamps.setAlignmentX(1.0F);
        jTable_Stamps.setAlignmentY(1.0F);
        jTable_Stamps.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane1.setViewportView(jTable_Stamps);

        jButton_Add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stamps/addIcon.png"))); // NOI18N
        jButton_Add.setText(" ADD");
        jButton_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AddActionPerformed(evt);
            }
        });

        jButton_Edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stamps/updateIcon.png"))); // NOI18N
        jButton_Edit.setText("  EDIT");
        jButton_Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EditActionPerformed(evt);
            }
        });

        jButton_Delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stamps/removeIcon.png"))); // NOI18N
        jButton_Delete.setText("  DELETE");
        jButton_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(231, Short.MAX_VALUE)
                .addComponent(jButton_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(221, 221, 221))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton_Delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_Edit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_Add))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton_RefreshView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stamps/updateIcon.png"))); // NOI18N
        jButton_RefreshView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RefreshViewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(282, 282, 282)
                        .addComponent(jButton_RefreshView, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jButton_RefreshView))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AddActionPerformed
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {                
                try {
                    //Create new window for adding new record to database
                    new AddWindow().setVisible(true);  
                } catch (Exception ex) {
                    System.out.println(ex);
                }
            }    
        }) ;
    }//GEN-LAST:event_jButton_AddActionPerformed

    private void jButton_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DeleteActionPerformed
        int[] selection = jTable_Stamps.getSelectedRows();
        TheModel model = null;
        
        for (int i = 0; i < selection.length; i++) {
            selection[i] = jTable_Stamps.convertRowIndexToModel(selection[i]);
        }
        int row = selection[0];

        try { 
            model = populateJTable();
            String info = Database.removeRecord(row, model);
            executeSQLQuery(info);
        } catch (SQLException | FileNotFoundException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_DeleteActionPerformed

    private void jButton_RefreshViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RefreshViewActionPerformed
        try {
            refreshJTable();
        } catch (SQLException | FileNotFoundException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_RefreshViewActionPerformed

    private void jButton_EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EditActionPerformed
        int[] selection = jTable_Stamps.getSelectedRows();
        TheModel model = null;
        
        for (int i = 0; i < selection.length; i++) {
            selection[i] = jTable_Stamps.convertRowIndexToModel(selection[i]);
        }
        int row = selection[0];
        
        try {
            model = populateJTable();
            Database.setModel(model);
            Database.setSelected(row);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Please select row to update.");
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {                
                try {
                    //Create new window for adding new record to database
                    new UpdateWindow().setVisible(true);  
                } catch (Exception ex) {
                    System.out.println(ex);
                }
            }    
        }) ;
    }//GEN-LAST:event_jButton_EditActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Add;
    private javax.swing.JButton jButton_Delete;
    private javax.swing.JButton jButton_Edit;
    private javax.swing.JButton jButton_RefreshView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Stamps;
    // End of variables declaration//GEN-END:variables
}
