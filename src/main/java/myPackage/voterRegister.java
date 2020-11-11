/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myPackage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import utils.DBConnection;



/**
 *
 * @author Shazia
 */
public class voterRegister extends javax.swing.JFrame {

    /**
     * Creates new form voterRegister
     */
    public voterRegister() {
        
        initComponents();
         setSize(500,500);
        setTitle("Election Commision");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jOptionPane1 = new javax.swing.JOptionPane();
        fname = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        dob = new javax.swing.JTextField();
        ward = new javax.swing.JTextField();
        vid = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cancel = new javax.swing.JButton();
        submit = new javax.swing.JButton();
        errorMessage = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        fname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });
        getContentPane().add(fname);
        fname.setBounds(237, 142, 109, 23);

        lname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnameActionPerformed(evt);
            }
        });
        getContentPane().add(lname);
        lname.setBounds(237, 185, 109, 23);

        dob.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(dob);
        dob.setBounds(237, 228, 109, 23);

        ward.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ward.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wardActionPerformed(evt);
            }
        });
        getContentPane().add(ward);
        ward.setBounds(237, 271, 109, 23);

        vid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(vid);
        vid.setBounds(237, 314, 109, 23);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("First Name");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(143, 145, 64, 17);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Last Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(143, 188, 64, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Date of Birth");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(130, 231, 77, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Ward");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(173, 274, 34, 17);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Voter ID");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(156, 317, 51, 17);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("  Voter Registration");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(117, 70, 229, 22);

        cancel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel);
        cancel.setBounds(134, 385, 73, 25);

        submit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        getContentPane().add(submit);
        submit.setBounds(237, 385, 75, 25);

        errorMessage.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(errorMessage);
        errorMessage.setBounds(237, 342, 109, 18);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myPackage/background1.jpg"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 500, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameActionPerformed

    private void lnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnameActionPerformed

    private void wardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wardActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        adminHome ad = new adminHome();
        ad.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_cancelActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
       try {
            DBConnection connect = new DBConnection();
            Connection conn = connect.createConnection();
            Statement stmt = conn.createStatement();
            String Fname = fname.getText();
            String Lname = lname.getText();
            String DOB = dob.getText();
            int vID = Integer.parseInt(vid.getText());
            int wno = Integer.parseInt(ward.getText());
            String sql =  "INSERT INTO `voters` VALUES (?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,Fname);
            ps.setString(2, Lname);
            ps.setInt(3, vID);
            ps.setString(4,DOB);
            ps.setInt(5, wno);
            int r = ps.executeUpdate();
            if(r>0){
                 JOptionPane.showMessageDialog(this,"Succefully registered Voter"); 
                System.out.print("Successful");
                adminHome ah = new adminHome();
                ah.setVisible(true);
                setVisible(false);
            }
           conn.close();
        }
        catch(SQLException e){
            errorMessage.setText("This voter ID already exists.");
            System.out.print(e.getMessage());
            fname.setText("");
            lname.setText("");
            dob.setText("");
            fname.setText("");
            vid.setText("");
            ward.setText("");
        }     
        
       
    }//GEN-LAST:event_submitActionPerformed

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
            java.util.logging.Logger.getLogger(voterRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(voterRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(voterRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(voterRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new voterRegister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JTextField dob;
    private javax.swing.JLabel errorMessage;
    private javax.swing.JTextField fname;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JTextField lname;
    private javax.swing.JButton submit;
    private javax.swing.JTextField vid;
    private javax.swing.JTextField ward;
    // End of variables declaration//GEN-END:variables
}
