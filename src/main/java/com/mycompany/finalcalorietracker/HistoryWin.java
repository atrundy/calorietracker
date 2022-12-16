/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 *
 * Name: Aiden Trundy
 * Class: Visual Programming I
 * File Name: HistoryWin.java
 */
package com.mycompany.finalcalorietracker;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

/**
 *
 * @author aidentrundy
 */
public class HistoryWin extends javax.swing.JFrame {
    private HomePageWin winHome;

    /**
     * Creates new form HistoryWin
     */
    public HistoryWin() {
        initComponents();
        DefaultListModel historyModel = new DefaultListModel();
        listHistory.setModel(historyModel);
        
        //reads history file read from Today Cals Table 
        try{

        File f = new File("history.json");
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        String jsonHistory = br.readLine();
        
        //converts json file into array of objects following meal class
        if (jsonHistory != null){ 
            Gson gson = new Gson();
            
            Meal[] history  = gson.fromJson(jsonHistory, Meal[].class);
           
           //if index is 0, read date before line, for other indexes read in name and num cals 
           //this is being read into a JList 
           for (int i = 0; i < history.length; i++){   
               if (i== 0){
                historyModel.addElement(TrackCaloriesWin.labelDate.getText());
                historyModel.addElement(history[i].getName() + ", " + history[i].getNumCals());
               }
           else{
                historyModel.addElement(history[i].getName() + ", " + history[i].getNumCals());
               }
   
        
              
            
           }
        }else {
           System.out.println("Empty");
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

        btnBack = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listHistory = new javax.swing.JList<>();
        btnUpdate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("History");

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(listHistory);

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(113, 113, 113)
                        .addComponent(btnUpdate)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnUpdate))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        winHome.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

            /* performs the same thing as code above but updates table to contain
            most recent info, if user wants to get history without closing the program */
            
            DefaultListModel historyModel = new DefaultListModel();
            listHistory.setModel(historyModel);
            
            try{
            
                File f = new File("history.json");
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                String jsonHistory = br.readLine();


                if (jsonHistory != null){
                    Gson gson = new Gson();

                    Meal[] history  = gson.fromJson(jsonHistory, Meal[].class);


                for (int i = 0; i < history.length; i++){
                    if (i== 0){
                     historyModel.addElement(TrackCaloriesWin.labelDate.getText());
                     historyModel.addElement(history[i].getName() + ", " + history[i].getNumCals());
                }
                else{
                    historyModel.addElement(history[i].getName() + ", " + history[i].getNumCals());
                }
                    
                }
                
                }
                else {
                    System.out.println("Empty");
                }
            
            }catch(IOException e){
            
            }
       /* try {
            FileWriter fw = new FileWriter("history.json",true);
             BufferedWriter bw = new BufferedWriter(fw);
             for (int i = 0; i < listHistory.getModel().getSize(); i++){
                bw.write(listHistory.getModel().getElementAt(i) + "\n");
            }
             bw.close();
        } catch (IOException ex) {
            Logger.getLogger(HistoryWin.class.getName()).log(Level.SEVERE, null, ex);
        } */
    }//GEN-LAST:event_btnUpdateActionPerformed
   
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
            java.util.logging.Logger.getLogger(HistoryWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HistoryWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HistoryWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HistoryWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HistoryWin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listHistory;
    // End of variables declaration//GEN-END:variables
}
