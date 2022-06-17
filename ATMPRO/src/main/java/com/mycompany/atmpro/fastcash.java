/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.atmpro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class fastcash extends javax.swing.JFrame {

    /**
     * Creates new form fastcash
     */
    public fastcash() {
        initComponents();
    }

      int MyAccNum;
    public fastcash(int AccNum) {
        initComponents();
        MyAccNum =AccNum;
       // AccountLbl.setText(""+AccNum);
        GetBalance();
    }
    Connection Con=null;
    PreparedStatement pst=null,pst1=null;
    ResultSet Rs= null,Rs1 =null;
    Statement St=null,St1=null;
    int OldBalance;
   private void GetBalance(){
   String Query ="select * from account_table where accNum='"+MyAccNum+"'";
        try{
         Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/atm_database","root","");
         St1=(Statement) Con.createStatement();
         Rs1=St1.executeQuery(Query);
         if(Rs1.next()){
        OldBalance = Rs1.getInt(8);
        balbl.setText("Rs"+OldBalance);
         }else{
         // JOptionPane.showMessageDialog(this, "Wrong Account or PIN number");
         }
        }catch(SQLException e){
        JOptionPane.showMessageDialog(this, e);
        }
   }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        DepositTbn = new javax.swing.JButton();
        WithdrowTbn = new javax.swing.JButton();
        DepositTbn1 = new javax.swing.JButton();
        WithdrowTbn1 = new javax.swing.JButton();
        DepositTbn2 = new javax.swing.JButton();
        WithdrowTbn2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        balbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Prime Bank Booth");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Select Your Transaction");

        jLabel5.setBackground(new java.awt.Color(255, 51, 51));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 51));
        jLabel5.setText("X");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(213, 213, 213)
                        .addComponent(jLabel5)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(213, 213, 213))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 204, 255));
        jLabel6.setText("FastCash");

        DepositTbn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DepositTbn.setText("Tk 100");
        DepositTbn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DepositTbnMouseClicked(evt);
            }
        });

        WithdrowTbn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        WithdrowTbn.setText("Tk 500");
        WithdrowTbn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                WithdrowTbnMouseClicked(evt);
            }
        });

        DepositTbn1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DepositTbn1.setText("Tk 1000");
        DepositTbn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DepositTbn1MouseClicked(evt);
            }
        });

        WithdrowTbn1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        WithdrowTbn1.setText("Tk 2000");
        WithdrowTbn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                WithdrowTbn1MouseClicked(evt);
            }
        });

        DepositTbn2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DepositTbn2.setText("Tk 5000");
        DepositTbn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DepositTbn2MouseClicked(evt);
            }
        });

        WithdrowTbn2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        WithdrowTbn2.setText("Tk 10000");
        WithdrowTbn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                WithdrowTbn2MouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("ASK Bank Booth");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 51, 51));
        jLabel8.setText("Logout");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        balbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        balbl.setForeground(new java.awt.Color(102, 204, 255));
        balbl.setText("Balance ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(312, 312, 312)
                        .addComponent(jLabel6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DepositTbn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DepositTbn2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DepositTbn1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(98, 98, 98)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(WithdrowTbn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(balbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(WithdrowTbn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(WithdrowTbn1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(126, 126, 126))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DepositTbn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(WithdrowTbn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DepositTbn1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(WithdrowTbn1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(balbl))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(WithdrowTbn2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DepositTbn2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void DepositTbnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DepositTbnMouseClicked
       if(OldBalance<100)
       {
            JOptionPane.showMessageDialog(this, "Not Enough Balance.");
       }else
       {
           try{
           String Query="Update account_table set balance=? where accNum=?";
           Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/atm_database","root","");
           PreparedStatement ps = Con.prepareStatement(Query);
           ps.setInt(1,OldBalance-100);
           ps.setInt(2, MyAccNum);
           if(ps.executeUpdate()==1){
           JOptionPane.showMessageDialog(this, "Balance updated.");
            new mainmenu().setVisible(true);
    this.dispose();
           }else{
             JOptionPane.showMessageDialog(this, "Missing Information.");  
           }
           }catch(Exception e){
           JOptionPane.showMessageDialog(this, e);
           }
       }
    }//GEN-LAST:event_DepositTbnMouseClicked

    private void WithdrowTbnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WithdrowTbnMouseClicked
     if(OldBalance<500)
       {
            JOptionPane.showMessageDialog(this, "Not Enough Balance.");
       }else
       {
           try{
           String Query="Update account_table set balance=? where accNum=?";
           Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/atm_database","root","");
           PreparedStatement ps = Con.prepareStatement(Query);
           ps.setInt(1,OldBalance-500);
           ps.setInt(2, MyAccNum);
           if(ps.executeUpdate()==1){
           JOptionPane.showMessageDialog(this, "Balance updated.");
            new mainmenu().setVisible(true);
    this.dispose();
           }else{
             JOptionPane.showMessageDialog(this, "Missing Information.");  
           }
           }catch(Exception e){
           JOptionPane.showMessageDialog(this, e);
           }
       }
    }//GEN-LAST:event_WithdrowTbnMouseClicked

    private void DepositTbn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DepositTbn1MouseClicked
   if(OldBalance<1000)
       {
            JOptionPane.showMessageDialog(this, "Not Enough Balance.");
       }else
       {
           try{
           String Query="Update account_table set balance=? where accNum=?";
           Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/atm_database","root","");
           PreparedStatement ps = Con.prepareStatement(Query);
           ps.setInt(1,OldBalance-1000);
           ps.setInt(2, MyAccNum);
           if(ps.executeUpdate()==1){
           JOptionPane.showMessageDialog(this, "Balance updated.");
            new mainmenu().setVisible(true);
    this.dispose();
           }else{
             JOptionPane.showMessageDialog(this, "Missing Information.");  
           }
           }catch(Exception e){
           JOptionPane.showMessageDialog(this, e);
           }
       }
    }//GEN-LAST:event_DepositTbn1MouseClicked

    private void WithdrowTbn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WithdrowTbn1MouseClicked
if(OldBalance<2000)
       {
            JOptionPane.showMessageDialog(this, "Not Enough Balance.");
       }else
       {
           try{
           String Query="Update account_table set balance=? where accNum=?";
           Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/atm_database","root","");
           PreparedStatement ps = Con.prepareStatement(Query);
           ps.setInt(1,OldBalance-2000);
           ps.setInt(2, MyAccNum);
           if(ps.executeUpdate()==1){
           JOptionPane.showMessageDialog(this, "Balance updated.");
            new mainmenu().setVisible(true);
    this.dispose();
           }else{
             JOptionPane.showMessageDialog(this, "Missing Information.");  
           }
           }catch(Exception e){
           JOptionPane.showMessageDialog(this, e);
           }
       }
    }//GEN-LAST:event_WithdrowTbn1MouseClicked

    private void DepositTbn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DepositTbn2MouseClicked
        if(OldBalance<5000)
       {
            JOptionPane.showMessageDialog(this, "Not Enough Balance.");
       }else
       {
           try{
           String Query="Update account_table set balance=? where accNum=?";
           Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/atm_database","root","");
           PreparedStatement ps = Con.prepareStatement(Query);
           ps.setInt(1,OldBalance-5000);
           ps.setInt(2, MyAccNum);
           if(ps.executeUpdate()==1){
           JOptionPane.showMessageDialog(this, "Balance updated.");
            new mainmenu().setVisible(true);
    this.dispose();
           }else{
             JOptionPane.showMessageDialog(this, "Missing Information.");  
           }
           }catch(Exception e){
           JOptionPane.showMessageDialog(this, e);
           }
       }
    }//GEN-LAST:event_DepositTbn2MouseClicked

    private void WithdrowTbn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WithdrowTbn2MouseClicked
    if(OldBalance<10000)
       {
            JOptionPane.showMessageDialog(this, "Not Enough Balance.");
       }else
       {
           try{
           String Query="Update account_table set balance=? where accNum=?";
           Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/atm_database","root","");
           PreparedStatement ps = Con.prepareStatement(Query);
           ps.setInt(1,OldBalance-10000);
           ps.setInt(2, MyAccNum);
           if(ps.executeUpdate()==1){
           JOptionPane.showMessageDialog(this, "Balance updated.");
            new mainmenu().setVisible(true);
    this.dispose();
           }else{
             JOptionPane.showMessageDialog(this, "Missing Information.");  
           }
           }catch(Exception e){
           JOptionPane.showMessageDialog(this, e);
           }
       }
    }//GEN-LAST:event_WithdrowTbn2MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
         new login().setVisible(true);
    this.dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

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
            java.util.logging.Logger.getLogger(fastcash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fastcash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fastcash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fastcash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fastcash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DepositTbn;
    private javax.swing.JButton DepositTbn1;
    private javax.swing.JButton DepositTbn2;
    private javax.swing.JButton WithdrowTbn;
    private javax.swing.JButton WithdrowTbn1;
    private javax.swing.JButton WithdrowTbn2;
    private javax.swing.JLabel balbl;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
