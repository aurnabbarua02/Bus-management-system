/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication78.pkgfor.project.cse3104;

import java.sql.*;
import javax.swing.JOptionPane;


/**
 *
 * @author User
 */
public class forDelete extends javax.swing.JFrame {

    /**
     * Creates new form forDelete
     */
    String tb_name=null;
    String tb_col=null;
    
    public forDelete() {
        initComponents();
    }
    public forDelete(String tb_name, String tb_col){
        initComponents();        
        
        this.tb_name = tb_name;
        this.tb_col= tb_col;
        setTitle("Bus Management System ("+tb_name+" Table - Delete Row)");
        jLabeltitle.setText("Do you want to delete row from "+tb_name+" table?");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabeltitle = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButtonback = new javax.swing.JButton();
        jButtondelete = new javax.swing.JButton();
        jLabelcomment = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabeltitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabeltitle.setOpaque(true);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Enter ID");

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jButtonback.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonback.setText("BACK");
        jButtonback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonbackActionPerformed(evt);
            }
        });

        jButtondelete.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtondelete.setText("DELETE");
        jButtondelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtondeleteActionPerformed(evt);
            }
        });

        jLabelcomment.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelcomment.setForeground(new java.awt.Color(0, 153, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelcomment, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabeltitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonback, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 319, Short.MAX_VALUE)
                        .addComponent(jButtondelete, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabeltitle, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addComponent(jLabelcomment, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonback, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtondelete, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonbackActionPerformed
        // TODO add your handling code here:
       
        switch(tb_name){
            case "BUS":{
                InsertBus obj = new InsertBus();
                obj.setVisible(true);
                setVisible(false);
                break;
            }
            case "ACCOUNT":{
                InsertAccount obj = new InsertAccount();
                obj.setVisible(true);
                setVisible(false);
                break;
            }
            case "ADMIN":{
                InsertAdmin obj = new InsertAdmin();
                obj.setVisible(true);
                setVisible(false);
                break;
            }
            case "FEEDBACK":{
                InsertFeedback obj = new InsertFeedback();
                obj.setVisible(true);
                setVisible(false);
                break;
            }
            case "TICKET":{
                iNSERTTICKET obj = new iNSERTTICKET();
                obj.setVisible(true);
                setVisible(false);
                break;
            }
            case "PASSENGER":{
                InsertPassenger obj = new InsertPassenger();
                obj.setVisible(true);
                setVisible(false);
                break;
            }
            case "DRIVER":{
                insertDriver obj = new insertDriver();
                obj.setVisible(true);
                setVisible(false);
                break;
            }
        }
        
    }//GEN-LAST:event_jButtonbackActionPerformed

    private void jButtondeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtondeleteActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BUS_MANAGEMENT_SYSTEM;selectMethod=cursor", "sa", "123456");
            //System.out.println("DATABASE NAME IS:" + connection.getMetaData().getDatabaseProductName());
            Statement statement = connection.createStatement();
            statement.executeUpdate("DELETE FROM "+tb_name+" WHERE "+tb_col+"="+jTextField1.getText());
            System.out.println("Data of "+tb_col+" "+jTextField1.getText()+" from "+tb_name+" table is deleted successfully. Click back to Continue...");
            jLabelcomment.setText("Data of "+tb_col+" "+jTextField1.getText()+" from "+tb_name+" table \n is deleted successfully.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_jButtondeleteActionPerformed

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
            java.util.logging.Logger.getLogger(forDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(forDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(forDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(forDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new forDelete().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonback;
    private javax.swing.JButton jButtondelete;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelcomment;
    private javax.swing.JLabel jLabeltitle;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}