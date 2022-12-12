/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.finalcalorietracker;

import com.google.gson.Gson;
import static com.mycompany.finalcalorietracker.TrackCaloriesWin.tableTCSavedMeals;
import java.awt.event.KeyAdapter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author aidentrundy
 */
public class SaveMealsWin extends javax.swing.JFrame {
    private HomePageWin winHome;
    public int numSavedMeals;
    String saveMeal;
    ArrayList<Meal> savedMeals = new ArrayList<Meal>();
    
    
    

    /**
     * Creates new form SaveMeals
     */
    public SaveMealsWin() {
        initComponents();
        numSavedMeals = 0;
        
        
        try{

        File f = new File("savedMeals.json");
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        String tmp = br.readLine();
        
        
        if (tmp != null){ 
            Gson gson = new Gson();
            
            Meal[] savedMeals  = gson.fromJson(tmp, Meal[].class);
           
           for (int i = 0; i < savedMeals.length; i++){    
               
              String Meal[] = {savedMeals[i].name,String.valueOf(savedMeals[i].numCals)};
   
        
              DefaultTableModel tableModel = (DefaultTableModel)tableSavedMeals.getModel();
              tableModel.addRow(Meal);
       
              DefaultTableModel TCtableModel = (DefaultTableModel)tableTCSavedMeals.getModel();
              TCtableModel.addRow(Meal);
            
           }
        }

        }catch(IOException e){
            
        }
 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        fieldMealName = new javax.swing.JTextField();
        fieldNumCals = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableSavedMeals = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        fieldNumCals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNumCalsActionPerformed(evt);
            }
        });
        fieldNumCals.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fieldNumCalsKeyPressed(evt);
            }
        });

        jLabel1.setText("Saved Meals");

        jLabel2.setText("Save a Meal");

        jLabel3.setText("(Enter Information Below)");

        jLabel4.setText("Meal Name:");

        jLabel5.setText("Amount of Calories:");

        tableSavedMeals.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Meal Name", "Calories"
            }
        ));
        jScrollPane3.setViewportView(tableSavedMeals);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(80, 80, 80))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(btnSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRemove))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fieldNumCals, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fieldMealName, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(fieldMealName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(fieldNumCals, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnRemove))
                .addGap(29, 29, 29)
                .addComponent(btnBack)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.setVisible(false);
        winHome.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        int numRows = tableSavedMeals.getRowCount();
        
        for (int i = 0; i < numRows; i++){
            String pastName = tableSavedMeals.getValueAt(i, 0).toString();
            int pastCals =   Integer.parseInt((String) tableSavedMeals.getValueAt(i, 1));
            
            Meal p = new Meal(pastName, pastCals);
            savedMeals.add(p);
         }
        
        String name = fieldMealName.getText();
        int numCals = Integer.parseInt(fieldNumCals.getText());
        
        Meal m = new Meal(name, numCals);
        
        savedMeals.add(m);
        

 
        Gson gson = new Gson();
        String userJson = gson.toJson(savedMeals);
        
       try{ 
            File f = new File("savedMeals.json");
            FileWriter fw = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(fw); 
            bw.write(userJson);
            bw.close();
            
       } catch (IOException ex){
           
       }
        
        String Meal[] = {m.name,String.valueOf(m.numCals)};
   
        
        DefaultTableModel tableModel = (DefaultTableModel)tableSavedMeals.getModel();
        tableModel.addRow(Meal);
       
        DefaultTableModel TCtableModel = (DefaultTableModel)tableTCSavedMeals.getModel();
        TCtableModel.addRow(Meal);
       
        /*try{
            File f = new File("savedMeals.txt");
            FileWriter fw = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(fieldMealName.getText());
            bw.close(); 
           
        }catch (IOException ex){
            JOptionPane.showMessageDialog(this, "Couldn't Write To File", "ERROR", JOptionPane.ERROR_MESSAGE);
        }*/
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        
        //get index of selected row on Saved Meals Table
        int selectedRow = tableSavedMeals.getSelectedRow();
        
        
        //Removing user selected row from Jtable
        DefaultTableModel tableModel = (DefaultTableModel)tableSavedMeals.getModel();
        tableModel.removeRow(selectedRow);
        
        
        
        //remove the same index from Saved Meals Table on Track Calories Window
        DefaultTableModel TCtableModel = (DefaultTableModel)TrackCaloriesWin.tableTCSavedMeals.getModel();
        TCtableModel.removeRow(selectedRow);
        
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void fieldNumCalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNumCalsActionPerformed
        // TODO add your handling code here
           
    }//GEN-LAST:event_fieldNumCalsActionPerformed

    private void fieldNumCalsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldNumCalsKeyPressed
        // TODO add your handling code here:
        // https://docs.oracle.com/javase/7/docs/api/java/awt/event/KeyEvent.html
        // used this article to learn about KeyPressed and getKeyChar
        //https://docs.oracle.com/javase/7/docs/api/java/lang/Character.html
        //used this article to figure out that Character.isDigit was available which was perfect for the situation
        
        
        //gets key character that user presses
        char entry = evt.getKeyChar();
        
        /* if user enters a letter character or a negative sign, pop up telling user to enter a number appears
        also textfield text is erased */
        
         if(Character.isDigit(entry)){
                  
         } 
         else {
            
          JOptionPane.showMessageDialog(null,"Please Enter A Positive Number", "Error", JOptionPane.WARNING_MESSAGE);
          
          fieldNumCals.setText(""); 
         }
        
    }//GEN-LAST:event_fieldNumCalsKeyPressed
    public void setHomePage(HomePageWin myCreator){
        winHome = myCreator;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SaveMealsWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SaveMealsWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SaveMealsWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SaveMealsWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SaveMealsWin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSave;
    public static javax.swing.JTextField fieldMealName;
    public static javax.swing.JTextField fieldNumCals;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    public static javax.swing.JTable tableSavedMeals;
    // End of variables declaration//GEN-END:variables
}
