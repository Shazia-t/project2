/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myPackage;

/**
 *
 * @author Shazia
 */
public class adminHome extends javax.swing.JFrame {

    /**
     * Creates new form adminHome
     */
    public adminHome() {
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

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        logOut = new javax.swing.JButton();
        regv = new javax.swing.JButton();
        regc = new javax.swing.JButton();
        deregv = new javax.swing.JButton();
        deregc = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(329, 102, 0, 0);

        logOut.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        logOut.setText("Log Out");
        logOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutActionPerformed(evt);
            }
        });
        getContentPane().add(logOut);
        logOut.setBounds(170, 350, 109, 25);

        regv.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        regv.setText("Register Voter");
        regv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regvActionPerformed(evt);
            }
        });
        getContentPane().add(regv);
        regv.setBounds(140, 140, 159, 23);

        regc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        regc.setText("Register Candidate");
        regc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regcActionPerformed(evt);
            }
        });
        getContentPane().add(regc);
        regc.setBounds(140, 240, 159, 25);

        deregv.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        deregv.setText("Deregister Voter");
        deregv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deregvActionPerformed(evt);
            }
        });
        getContentPane().add(deregv);
        deregv.setBounds(140, 190, 159, 25);

        deregc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        deregc.setText("Deregister Candidate");
        deregc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deregcActionPerformed(evt);
            }
        });
        getContentPane().add(deregc);
        deregc.setBounds(140, 290, 159, 25);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Admin Home");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(110, 80, 220, 22);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myPackage/background1.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 500, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutActionPerformed
         adminLogin al = new adminLogin();
         al.setVisible(true);
         setVisible(false);
    }//GEN-LAST:event_logOutActionPerformed

    private void deregvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deregvActionPerformed
        deregisterVoter dv = new deregisterVoter();
        dv.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_deregvActionPerformed

    private void regvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regvActionPerformed
        voterRegister vr = new voterRegister();
        vr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_regvActionPerformed

    private void regcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regcActionPerformed
       
        
        registerCandidate rc = new registerCandidate();
        rc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_regcActionPerformed

    private void deregcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deregcActionPerformed
         deregisterCandidate dc = new deregisterCandidate();
        dc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_deregcActionPerformed

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
            java.util.logging.Logger.getLogger(adminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deregc;
    private javax.swing.JButton deregv;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton logOut;
    private javax.swing.JButton regc;
    private javax.swing.JButton regv;
    // End of variables declaration//GEN-END:variables
}
