/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.finalcalorietracker;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 *
 * @author aidentrundy
 */
public class TrackCalories extends javax.swing.JFrame {
     private HomePage winHome;
     String loadMeal;
     String calsEntry;
     
     
     

    /**
     * Creates new form TrackCalories
     */
    public TrackCalories() {
        initComponents();
        //https://www.javatpoint.com/java-get-current-date
       
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yy");
        String currentDate = format.format(date);
        labelDate.setText(currentDate);
    }
    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    public void setHomePage(HomePage myCreator){
        winHome = myCreator;
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        btnSetGoal = new javax.swing.JButton();
        btnResetDay = new javax.swing.JButton();
        btnLoad = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        fieldTCNumCals = new javax.swing.JTextField();
        fieldTCMealName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        labelCalsLeft = new javax.swing.JLabel();
        labelTodayCals = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableToday = new javax.swing.JTable();
        labelGoal = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableTCSavedMeals = new javax.swing.JTable();
        btnHistory = new javax.swing.JButton();
        labelDate = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnSetGoal.setText("Set Goal");
        btnSetGoal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetGoalActionPerformed(evt);
            }
        });

        btnResetDay.setText("Reset Day");
        btnResetDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetDayActionPerformed(evt);
            }
        });

        btnLoad.setText("Load");
        btnLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadActionPerformed(evt);
            }
        });

        btnAdd.setText("Add Selected Meal");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        fieldTCNumCals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldTCNumCalsActionPerformed(evt);
            }
        });

        jLabel1.setText("Meal Name:");

        jLabel2.setText("Amount of Calories:");

        jLabel3.setText("Enter Information:");

        jLabel4.setText("Calorie Goal");

        jLabel5.setText("Calories Left");

        jLabel6.setText("Todays Calories");

        labelCalsLeft.setText("0");

        labelTodayCals.setText("0");

        jLabel7.setText("Your Saved Meals");

        tableToday.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Meal Name", "Calories"
            }
        ));
        jScrollPane2.setViewportView(tableToday);

        labelGoal.setText("0");

        tableTCSavedMeals.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Meal Name", "Calories"
            }
        ));
        jScrollPane3.setViewportView(tableTCSavedMeals);

        btnHistory.setText("History");

        labelDate.setText("jLabel8");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(labelGoal)
                        .addGap(105, 105, 105)
                        .addComponent(labelCalsLeft)
                        .addGap(179, 179, 179)
                        .addComponent(labelTodayCals))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack)
                        .addGap(95, 95, 95)
                        .addComponent(btnSetGoal)))
                .addContainerGap(161, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(btnAdd))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(jLabel7)))
                        .addGap(88, 88, 88)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnLoad)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel3))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fieldTCMealName, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnHistory)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnResetDay))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(fieldTCNumCals))))))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelDate)
                        .addGap(61, 61, 61)
                        .addComponent(jLabel4)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel5)
                        .addGap(106, 106, 106)
                        .addComponent(jLabel6)))
                .addGap(0, 14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4)
                    .addComponent(labelDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAdd)
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBack)
                            .addComponent(btnSetGoal)
                            .addComponent(btnResetDay)
                            .addComponent(btnHistory))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelTodayCals)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(labelCalsLeft)
                                .addComponent(labelGoal)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(fieldTCMealName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(fieldTCNumCals, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnLoad)
                        .addGap(87, 87, 87))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnResetDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetDayActionPerformed
        // Removes data from Todays Calories Table
        DefaultTableModel tableModel = (DefaultTableModel)tableToday.getModel();
        tableModel.setRowCount(0);
        
        //get final total cals number to store for history
        String pastCals = labelTodayCals.getText();
        
        //Reset all tracking labels
        labelTodayCals.setText("0");
        labelGoal.setText("0");
        labelCalsLeft.setText("0");
    }//GEN-LAST:event_btnResetDayActionPerformed

    private void fieldTCNumCalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldTCNumCalsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldTCNumCalsActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.setVisible(false);
        winHome.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSetGoalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetGoalActionPerformed
        String getGoal = JOptionPane.showInputDialog(null, "Enter The Calorie Goal For Today: ", "Calorie Goal",JOptionPane.QUESTION_MESSAGE );
        labelGoal.setText(getGoal);
        labelCalsLeft.setText(getGoal);
    }//GEN-LAST:event_btnSetGoalActionPerformed
    
    private void btnLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadActionPerformed
        //Adding user inputs to Today's Calories List
        //https://docs.oracle.com/javase/tutorial/uiswing/components/table.html
        String data[] = {fieldTCMealName.getText(),fieldTCNumCals.getText()};
        
        DefaultTableModel tableModel = (DefaultTableModel)tableToday.getModel();
        
        tableModel.addRow(data);
        
        //Calculating total calories of table entries
        //https://stackoverflow.com/questions/16395939/getting-values-from-jtable-cell
        int numRows = tableToday.getRowCount();
        
        int totalCals = 0;

        int i;
        for (i = 0; i < numRows; i++){
            int val = Integer.valueOf(tableToday.getValueAt(i, 1).toString());
             totalCals += val; 
        }
        
        labelTodayCals.setText(Integer.toString(totalCals));

        
     //ask question about this code
     //goal is to get current value of labelCalsLeft and subtract entered calories from it
        /*for (i = 0; i < numRows; i++){
            int calsGoal = Integer.parseInt(labelCalsLeft.getText());
            int val = Integer.valueOf(tableToday.getValueAt(i, 1).toString());
            calsGoal -= val;
            labelCalsLeft.setText(Integer.toString(calsGoal));     
        }*/
        
        
        //Updating Cals Left to reach goal
        // fix so the value doesn't go below 0
        //fix so entries are only counted for once  
      //  int tmp = Integer.parseInt(labelCalsLeft.getText());
       // labelCalsLeft.setText(Integer.toString(tmp -= totalCals));
    }//GEN-LAST:event_btnLoadActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        
       DefaultTableModel tableTCModel = (DefaultTableModel)tableTCSavedMeals.getModel();
        
       DefaultTableModel tableModel = (DefaultTableModel)tableToday.getModel();
       
       //getting selected row from saved meal table and addind it to Today's Cals Table
       int index = tableTCSavedMeals.getSelectedRow();
       String mealName = tableTCModel.getValueAt(index, 0).toString();
       String numCals = tableTCModel.getValueAt(index, 1).toString();
       
       String savedData[] = {mealName,numCals};
       
       tableModel.addRow(savedData);
      
       //Updating Today's Calories number to include entries from saved meals when added
        int numRows = tableToday.getRowCount();
        int totalCals = 0;
        int i;
        for (i = 0; i < numRows; i++){
            int val = Integer.valueOf(tableToday.getValueAt(i, 1).toString());
             totalCals += val; 
        }
        labelTodayCals.setText(Integer.toString(totalCals));
        
        
        
    }//GEN-LAST:event_btnAddActionPerformed
    
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
            java.util.logging.Logger.getLogger(TrackCalories.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrackCalories.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrackCalories.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrackCalories.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrackCalories().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnHistory;
    private javax.swing.JButton btnLoad;
    private javax.swing.JButton btnResetDay;
    private javax.swing.JButton btnSetGoal;
    private javax.swing.JTextField fieldTCMealName;
    private javax.swing.JTextField fieldTCNumCals;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelCalsLeft;
    private javax.swing.JLabel labelDate;
    private javax.swing.JLabel labelGoal;
    private javax.swing.JLabel labelTodayCals;
    public static javax.swing.JTable tableTCSavedMeals;
    private javax.swing.JTable tableToday;
    // End of variables declaration//GEN-END:variables
}
