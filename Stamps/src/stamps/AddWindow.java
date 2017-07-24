/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stamps;

import java.awt.Image;
import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Magda
 */

public class AddWindow extends javax.swing.JFrame{
    
    private MainWindow mainWindow;
    
    public AddWindow(MainWindow main) throws SQLException, FileNotFoundException {
        Image icon = new ImageIcon(this.getClass().getResource("add.png")).getImage();
        this.setTitle("Add new record");
        this.setIconImage(icon);
        mainWindow = main;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_Nr = new javax.swing.JLabel();
        jTextField_Nr = new javax.swing.JTextField();
        jLabel_PhotoPath = new javax.swing.JLabel();
        jTextField_PhotoPath = new javax.swing.JTextField();
        jLabel_Name = new javax.swing.JLabel();
        jTextField_Name = new javax.swing.JTextField();
        jLabel_Unit = new javax.swing.JLabel();
        jTextField_Unit = new javax.swing.JTextField();
        jLabel_ReleaseDate = new javax.swing.JLabel();
        jLabel6_Production = new javax.swing.JLabel();
        jTextField_Production = new javax.swing.JTextField();
        jLabel_inCollection = new javax.swing.JLabel();
        jLabel_IsStamped = new javax.swing.JLabel();
        jButton_ChoosePhoto = new javax.swing.JButton();
        jCheckBox_InCollection = new javax.swing.JCheckBox();
        jCheckBox_IsStamped = new javax.swing.JCheckBox();
        jButton_AddNewRecord = new javax.swing.JButton();
        jTextField_Year = new javax.swing.JTextField();
        jComboBox_Month = new javax.swing.JComboBox();
        jComboBox_Day = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel_Nr.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel_Nr.setText("Catalog number:");

        jLabel_PhotoPath.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel_PhotoPath.setText("Photo path:");

        jLabel_Name.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel_Name.setText("Name:");

        jLabel_Unit.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel_Unit.setText("Unit:");

        jLabel_ReleaseDate.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel_ReleaseDate.setText("Release date:");

        jLabel6_Production.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel6_Production.setText("Production:");

        jLabel_inCollection.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel_inCollection.setText("Have you got this stamp in collection?");

        jLabel_IsStamped.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel_IsStamped.setText("Is stamped?");

        jButton_ChoosePhoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stamps/folderIcon.png"))); // NOI18N
        jButton_ChoosePhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ChoosePhotoActionPerformed(evt);
            }
        });

        jCheckBox_InCollection.setText("Yes");
        jCheckBox_InCollection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_InCollectionActionPerformed(evt);
            }
        });

        jCheckBox_IsStamped.setText("Yes");

        jButton_AddNewRecord.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stamps/addIcon.png"))); // NOI18N
        jButton_AddNewRecord.setText("ADD");
        jButton_AddNewRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AddNewRecordActionPerformed(evt);
            }
        });

        jTextField_Year.setToolTipText("year, e.g.: 1982");

        jComboBox_Month.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        jComboBox_Month.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_MonthActionPerformed(evt);
            }
        });

        jComboBox_Day.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));
        jComboBox_Day.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_AddNewRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel_Nr, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_Nr, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel_PhotoPath, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_PhotoPath, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_ChoosePhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel_Unit, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_Unit, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel_ReleaseDate, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(5, 5, 5)
                            .addComponent(jComboBox_Month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jComboBox_Day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField_Year))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel_IsStamped, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCheckBox_IsStamped))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel_inCollection, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCheckBox_InCollection))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel6_Production, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField_Production, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Nr)
                    .addComponent(jTextField_Nr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_PhotoPath)
                    .addComponent(jTextField_PhotoPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_ChoosePhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Name)
                    .addComponent(jTextField_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Unit)
                    .addComponent(jTextField_Unit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_ReleaseDate)
                    .addComponent(jTextField_Year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_Month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_Day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6_Production)
                    .addComponent(jTextField_Production, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_inCollection)
                    .addComponent(jCheckBox_InCollection))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_IsStamped)
                    .addComponent(jCheckBox_IsStamped))
                .addGap(18, 18, 18)
                .addComponent(jButton_AddNewRecord, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox_InCollectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_InCollectionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_InCollectionActionPerformed

    private void jButton_AddNewRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AddNewRecordActionPerformed
        try {
            addNewRecord();
        }       
        catch (Exception ex) {
            ex.printStackTrace();
        } 
    }
        
    private void addNewRecord() throws SQLException, FileNotFoundException{ 
        Stamp stamp = new Stamp();
        
        try {
            File image = new File(jTextField_PhotoPath.getText());
            stamp.setPhotoFile(image);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        int day = jComboBox_Day.getSelectedIndex()+1;
        int month = jComboBox_Month.getSelectedIndex()+1;
        int year = Integer.parseInt(jTextField_Year.getText());
                
        stamp.setCatalogNr(Integer.parseInt(jTextField_Nr.getText()));
        stamp.setName(jTextField_Name.getText());
        stamp.setUnit(jTextField_Unit.getText());
        stamp.setReleaseDate(day, month, year);     
        stamp.setProduction(Long.parseLong(jTextField_Production.getText()));
        stamp.setInCollection(jCheckBox_InCollection.isSelected());
        stamp.setStamped(jCheckBox_IsStamped.isSelected());
                            
        try {
            int s = Database.addRecord(stamp);
            if(s>0) {
                JOptionPane.showMessageDialog(null, "Inserted data successfully!");          
            }
            else if (s==-2) 
                JOptionPane.showMessageDialog(null, "Stamp with catalog number = " + stamp.getCatalogNr() + " already exists in database.");
            else {
                JOptionPane.showMessageDialog(null, "Unsucessfull to insert data to database.");
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();   
        }      
        mainWindow.refreshJTable();
    }//GEN-LAST:event_jButton_AddNewRecordActionPerformed

    
    private void jButton_ChoosePhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ChoosePhotoActionPerformed
        JFileChooser fc = new JFileChooser();
        int rVal = fc.showOpenDialog(AddWindow.this);
        
        if (rVal == JFileChooser.APPROVE_OPTION) {
            jTextField_PhotoPath.setText(fc.getCurrentDirectory().toString()+"\\"+fc.getSelectedFile().getName());
        }
    }//GEN-LAST:event_jButton_ChoosePhotoActionPerformed

    private void jComboBox_MonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_MonthActionPerformed
        int[] months31Days = {0, 2, 4, 6, 7, 9, 11};
        int[] months30Days = {3, 5, 8, 10};
        
        jComboBox_Day.setEnabled(rootPaneCheckingEnabled);
        
        if (jComboBox_Month.getSelectedIndex() == 1) {  //to do: set 29day to February for proper years
            if (jComboBox_Day.getItemCount() == 30) {
                jComboBox_Day.removeItemAt(jComboBox_Day.getItemCount()-1);
                jComboBox_Day.removeItemAt(jComboBox_Day.getItemCount()-1);
            }
            if (jComboBox_Day.getItemCount() == 31) {
                jComboBox_Day.removeItemAt(jComboBox_Day.getItemCount()-1);
                jComboBox_Day.removeItemAt(jComboBox_Day.getItemCount()-1);
                jComboBox_Day.removeItemAt(jComboBox_Day.getItemCount()-1);
            }
        }
        else {
            for (int element : months31Days) {
                if (jComboBox_Month.getSelectedIndex() == element) {
                    if (jComboBox_Day.getItemCount()==30)
                        jComboBox_Day.addItem(31);    
                    if (jComboBox_Day.getItemCount()==28) {
                        jComboBox_Day.addItem(29);
                        jComboBox_Day.addItem(30);
                        jComboBox_Day.addItem(31);
                    }
                }    
            }               
            for (int element2: months30Days) {
                if (jComboBox_Month.getSelectedIndex() == element2) {
                    if (jComboBox_Day.getItemCount() == 31)
                        jComboBox_Day.removeItemAt(jComboBox_Day.getItemCount()-1);    
                    if (jComboBox_Day.getItemCount() == 28) {
                        jComboBox_Day.addItem(29);
                        jComboBox_Day.addItem(30);
                    }
                }
            }
        }
    }//GEN-LAST:event_jComboBox_MonthActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_AddNewRecord;
    private javax.swing.JButton jButton_ChoosePhoto;
    private javax.swing.JCheckBox jCheckBox_InCollection;
    private javax.swing.JCheckBox jCheckBox_IsStamped;
    private javax.swing.JComboBox jComboBox_Day;
    private javax.swing.JComboBox jComboBox_Month;
    private javax.swing.JLabel jLabel6_Production;
    private javax.swing.JLabel jLabel_IsStamped;
    private javax.swing.JLabel jLabel_Name;
    private javax.swing.JLabel jLabel_Nr;
    private javax.swing.JLabel jLabel_PhotoPath;
    private javax.swing.JLabel jLabel_ReleaseDate;
    private javax.swing.JLabel jLabel_Unit;
    private javax.swing.JLabel jLabel_inCollection;
    private javax.swing.JTextField jTextField_Name;
    private javax.swing.JTextField jTextField_Nr;
    private javax.swing.JTextField jTextField_PhotoPath;
    private javax.swing.JTextField jTextField_Production;
    private javax.swing.JTextField jTextField_Unit;
    private javax.swing.JTextField jTextField_Year;
    // End of variables declaration//GEN-END:variables
}
