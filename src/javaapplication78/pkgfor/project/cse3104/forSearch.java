/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication78.pkgfor.project.cse3104;

/**
 *
 * @author User
 */
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class forSearch extends javax.swing.JFrame {

    /**
     * Creates new form forSearch
     */
    String tb_name ="";
    String col1 = "";
    String col2 = "";
    String col3 = "";
    String col4 = "";
    String col5 = "";
    String col6 = "";
    String col7 = "";
    String col8 = "";
    String col9 = "";
    String col10 = "";
    String col11 = "";
    String col12 = "";


    DefaultTableModel tabm;

    public forSearch() {
        initComponents();
    }
    public forSearch(String tb_name, String col1, String col2, String col3, String col4, String col5, String col6, String col7, String col8, String col9, String col10, String col11, String col12) {
        initComponents();

        this.tb_name = tb_name;
        this.col1 = col1;
        this.col2 = col2;
        this.col3 = col3;
        this.col4 = col4;
        this.col5 = col5;
        this.col6 = col6;
        this.col7 = col7;
        this.col8 = col8;
        this.col9 = col9;
        this.col10 = col10;
        this.col11 = col11;
        this.col12 = col12;

        setTitle("Bus Management System ("+tb_name+" Table - Search Row)");
        jLabeltitle.setText("Do you want to search from " + tb_name + " table?");
        //jComboBox1.addItem(col1);
        jComboBox1.addItem(col2);
        jComboBox1.addItem(col3);
        jComboBox1.addItem(col4);
        jComboBox1.addItem(col5);
        jComboBox1.addItem(col6);
        jComboBox1.addItem(col7);
        jComboBox1.addItem(col8);
        jComboBox1.addItem(col9);
        jComboBox1.addItem(col10);
        jComboBox1.addItem(col11);
        jComboBox1.addItem(col12);

        tabm = (DefaultTableModel) jTable1.getModel();
        tabm.addColumn(col1);
        tabm.addColumn(col2);
        tabm.addColumn(col3);
        tabm.addColumn(col4);
        tabm.addColumn(col5);
        tabm.addColumn(col6);
        tabm.addColumn(col7);
        tabm.addColumn(col8);
        tabm.addColumn(col9);
        tabm.addColumn(col10);
        tabm.addColumn(col11);
        tabm.addColumn(col12);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonsearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldinput = new javax.swing.JTextField();
        jButtoncancel = new javax.swing.JButton();
        jLabeltitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonsearch.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonsearch.setText("SEARCH");
        jButtonsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonsearchActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Search by -");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Enter");

        jTextFieldinput.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jButtoncancel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtoncancel.setText("Cancel");
        jButtoncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoncancelActionPerformed(evt);
            }
        });

        jLabeltitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabeltitle.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 607, Short.MAX_VALUE)
                    .addComponent(jLabeltitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldinput))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtoncancel, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabeltitle, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldinput))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtoncancel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonsearchActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BUS_MANAGEMENT_SYSTEM;selectMethod=cursor", "sa", "123456");
            System.out.println("DATABASE NAME IS:" + connection.getMetaData().getDatabaseProductName());
            Statement statement = connection.createStatement();
            ResultSet resultSet;
            
            resultSet = statement.executeQuery("SELECT * FROM " + tb_name + " WHERE " + jComboBox1.getSelectedItem().toString() + " = '" + jTextFieldinput.getText() + "'");
            
            
            tabm.setRowCount(0);
            System.out.println("Data have been searched from "+tb_name+" table.");
            while (resultSet.next()) {
                // System.out.println("Customer NAME:" + resultSet.getString("NAME"));
                switch (tb_name) {
                    case "BUS":
                    case "TICKET":{
                        String data[] = {resultSet.getString(col1), resultSet.getString(col2), resultSet.getString(col3), resultSet.getString(col4), resultSet.getString(col5), resultSet.getString(col6), resultSet.getString(col7), resultSet.getString(col8), resultSet.getString(col9), resultSet.getString(col10), resultSet.getString(col11), resultSet.getString(col12)};
                        tabm.addRow(data);
                        break;
                    }
                    case "DRIVER":
                    case "ADMIN":
                    case "ACCOUNT":{
                        String data[] = {resultSet.getString(col1), resultSet.getString(col2), resultSet.getString(col3), resultSet.getString(col4)};
                        tabm.addRow(data);
                        break;
                    }
                    case "PASSENGER":{
                        String data[] = {resultSet.getString(col1), resultSet.getString(col2), resultSet.getString(col3), resultSet.getString(col4), resultSet.getString(col5), resultSet.getString(col6)};
                        tabm.addRow(data);
                        break;
                    }
                    case "FEEDBACK":{
                        String data[] = {resultSet.getString(col1), resultSet.getString(col2), resultSet.getString(col3), resultSet.getString(col4), resultSet.getString(col5)};
                        tabm.addRow(data);
                        break;
                    }                    
                    
                }

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);

        }
    }//GEN-LAST:event_jButtonsearchActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:

        //        JComboBox<String> combo = new JComboBox<>(new String[] { "One","Two", "Three","Four","Five", "Six" });
        //        add(combo);
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButtoncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoncancelActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButtoncancelActionPerformed

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
            java.util.logging.Logger.getLogger(forSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(forSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(forSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(forSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new forSearch().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtoncancel;
    private javax.swing.JButton jButtonsearch;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabeltitle;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldinput;
    // End of variables declaration//GEN-END:variables
}
