/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javaproject;

import java.awt.Color;
import javax.swing.DefaultListModel;


public class frmShowPrize extends javax.swing.JFrame {
    static frmMain frmMain;
    DefaultListModel model;
    //BaseEmployee[] tempEmployees = frmMain.employeeManager.employees;
    
    /**
     * Creates new form frmShowPrize
     */
    public frmShowPrize(frmMain frmMain) {
        this.frmMain=frmMain;
        model = new DefaultListModel();
        initComponents();
        getContentPane().setBackground(frmMain.getContentPane().getBackground());
        getContentPane().setForeground(frmMain.getContentPane().getForeground());
        getContentPane().setForeground(Color.RED);
        pnlEmployeePrize.setOpaque(false);
        lstEmployee2.setModel(model);
        frmMain.employeeManager.SortofSalary(frmMain.employeeManager.employees);
        for(int i=0;i<frmMain.employeeManager.employees.length;i++){
             model.addElement(frmMain.employeeManager.employees[i].getName()+" "+frmMain.employeeManager.employees[i].getSurname());
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

        lblTitle = new javax.swing.JLabel();
        pnlEmployeePrize = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstEmployee2 = new javax.swing.JList<>();
        lblNameSurname = new javax.swing.JLabel();
        lblSalary = new javax.swing.JLabel();
        lblPosition = new javax.swing.JLabel();
        lblSalesAmount = new javax.swing.JLabel();
        txtSalesAmount = new javax.swing.JTextField();
        lblCalculatedPrize = new javax.swing.JLabel();
        btnShowPrize = new javax.swing.JButton();
        btnSalesAmount = new javax.swing.JButton();
        lblNameSurname2 = new javax.swing.JLabel();
        lblSalary2 = new javax.swing.JLabel();
        lblPosition2 = new javax.swing.JLabel();
        lblCalculatedPrize2 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Prize of Employees");
        setResizable(false);

        lblTitle.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Employee Prize");

        lstEmployee2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lstEmployee2.setSelectionBackground(new java.awt.Color(214, 217, 223));
        lstEmployee2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstEmployee2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lstEmployee2);

        lblNameSurname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNameSurname.setText("Name Surname :");

        lblSalary.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSalary.setText("Salary :");
        lblSalary.setToolTipText("");
        lblSalary.setAutoscrolls(true);

        lblPosition.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPosition.setText("Position :");

        lblSalesAmount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSalesAmount.setText("Sales Amount :");

        txtSalesAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalesAmountActionPerformed(evt);
            }
        });

        lblCalculatedPrize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCalculatedPrize.setText("Calculated Prize :");

        btnShowPrize.setText("Show Employee Prize");
        btnShowPrize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowPrizeActionPerformed(evt);
            }
        });

        btnSalesAmount.setText("Set Sales Amount");
        btnSalesAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalesAmountActionPerformed(evt);
            }
        });

        lblNameSurname2.setBackground(new java.awt.Color(255, 255, 255));
        lblNameSurname2.setText("The Name and Surname of the Employee");
        lblNameSurname2.setOpaque(true);

        lblSalary2.setBackground(new java.awt.Color(255, 255, 255));
        lblSalary2.setText("The Salary of the Employee");
        lblSalary2.setAutoscrolls(true);
        lblSalary2.setOpaque(true);

        lblPosition2.setBackground(new java.awt.Color(255, 255, 255));
        lblPosition2.setText("The Position of the Employee");
        lblPosition2.setOpaque(true);

        lblCalculatedPrize2.setBackground(new java.awt.Color(255, 255, 255));
        lblCalculatedPrize2.setOpaque(true);

        javax.swing.GroupLayout pnlEmployeePrizeLayout = new javax.swing.GroupLayout(pnlEmployeePrize);
        pnlEmployeePrize.setLayout(pnlEmployeePrizeLayout);
        pnlEmployeePrizeLayout.setHorizontalGroup(
            pnlEmployeePrizeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEmployeePrizeLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(pnlEmployeePrizeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlEmployeePrizeLayout.createSequentialGroup()
                        .addComponent(lblSalesAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSalesAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlEmployeePrizeLayout.createSequentialGroup()
                        .addComponent(lblPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblPosition2, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlEmployeePrizeLayout.createSequentialGroup()
                        .addComponent(lblSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblSalary2, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlEmployeePrizeLayout.createSequentialGroup()
                        .addComponent(lblNameSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblNameSurname2, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlEmployeePrizeLayout.createSequentialGroup()
                        .addComponent(lblCalculatedPrize, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlEmployeePrizeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblCalculatedPrize2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEmployeePrizeLayout.createSequentialGroup()
                                .addComponent(btnSalesAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnShowPrize, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(39, 39, 39))
        );
        pnlEmployeePrizeLayout.setVerticalGroup(
            pnlEmployeePrizeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEmployeePrizeLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pnlEmployeePrizeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlEmployeePrizeLayout.createSequentialGroup()
                        .addGroup(pnlEmployeePrizeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNameSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNameSurname2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlEmployeePrizeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSalary)
                            .addComponent(lblSalary2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlEmployeePrizeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPosition2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(pnlEmployeePrizeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSalesAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSalesAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlEmployeePrizeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCalculatedPrize, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCalculatedPrize2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                        .addGroup(pnlEmployeePrizeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnShowPrize, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalesAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        btnBack.setText("Back Main Menu");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlEmployeePrize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlEmployeePrize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        frmMain.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void lstEmployee2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstEmployee2MouseClicked
        // TODO add your handling code here:
        int index = lstEmployee2.getSelectedIndex();
        
        lblNameSurname2.setText(frmMain.employeeManager.employees[index].getName()+" "+frmMain.employeeManager.employees[index].getSurname());
        lblSalary2.setText(Integer.toString(frmMain.employeeManager.employees[index].getSalary()));
        lblPosition2.setText(frmMain.employeeManager.employees[index].getPosition());
        txtSalesAmount.setText(Double.toString(frmMain.employeeManager.employees[index].getPrimAmount()));
        lblCalculatedPrize2.setText(" ");
    }//GEN-LAST:event_lstEmployee2MouseClicked

    private void btnSalesAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalesAmountActionPerformed
        // TODO add your handling code here:
       double prize =Double.parseDouble(txtSalesAmount.getText());
       int index = lstEmployee2.getSelectedIndex();
       frmMain.employeeManager.employees[index].setPrimAmount(prize);
       //frmMain.employeeManager.employees[tempEmployees[index].getId()].setPrimAmount(prize);
    }//GEN-LAST:event_btnSalesAmountActionPerformed

    private void btnShowPrizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowPrizeActionPerformed
        // TODO add your handling code here:
        int index = lstEmployee2.getSelectedIndex();
        double prize =frmMain.employeeManager.employees[index].getPrimAmount();
        lblCalculatedPrize2.setText(Double.toString(frmMain.employeeManager.employees[index].primCalculator(prize)));
    }//GEN-LAST:event_btnShowPrizeActionPerformed

    private void txtSalesAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalesAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalesAmountActionPerformed

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
            java.util.logging.Logger.getLogger(frmShowPrize.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmShowPrize.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmShowPrize.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmShowPrize.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmShowPrize(frmMain).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSalesAmount;
    private javax.swing.JButton btnShowPrize;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCalculatedPrize;
    private javax.swing.JLabel lblCalculatedPrize2;
    private javax.swing.JLabel lblNameSurname;
    private javax.swing.JLabel lblNameSurname2;
    private javax.swing.JLabel lblPosition;
    private javax.swing.JLabel lblPosition2;
    private javax.swing.JLabel lblSalary;
    private javax.swing.JLabel lblSalary2;
    private javax.swing.JLabel lblSalesAmount;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JList<String> lstEmployee2;
    private javax.swing.JPanel pnlEmployeePrize;
    private javax.swing.JTextField txtSalesAmount;
    // End of variables declaration//GEN-END:variables
}