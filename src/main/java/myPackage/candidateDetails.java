/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myPackage;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import models.User;
import utils.DBConnection;

/**
 *
 * @author Shaurya Magar
 */
public class candidateDetails extends javax.swing.JFrame {

    /**
     * Creates new form candidateDetails
     */
    int i=0;
    static User user;
    int [] canArray = new int[4];
    public candidateDetails() {
        initComponents();
        int wardNo = user.getWardno();
        jLabel2.setText("Ward No "+wardNo);
        try {
            DBConnection connect = new DBConnection();
            Connection conn = connect.createConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from candidates where ward like "+wardNo);
            
            while(rs.next()){
                canArray[i]= rs.getInt("cid");
                i++;
            }
        }
        catch (SQLException e) {
            System.err.println(e);
        }
        for(int j=0;j<i;j++){
            try {
            DBConnection connect = new DBConnection();
            Connection conn = connect.createConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from candidates where cid like "+canArray[j]);
                while(rs.next()){
                    if(j==0){
                        int num=j+1;
                        can1Label.setText("Candidate "+num);
                        can1Name.setText(rs.getString("fname")+" "+rs.getString("lname"));
                        can1Party.setText(rs.getString("party"));
                        can1DOB.setText(rs.getString("dob"));
                        can1ID.setText(""+rs.getString("cid"));
                    }else if(j==1){
                        int num=j+1;
                         can2Label.setText("Candidate "+num);

                        can2Name.setText(rs.getString("fname")+" "+rs.getString("lname"));
                        can2Party.setText(rs.getString("party"));
                        can2DOB.setText(rs.getString("dob"));
                        can2ID.setText(""+rs.getString("cid"));
                    }else if(j==2){
                         int num=j+1;
                                                can3Label.setText("Candidate "+num);

                        can3Name.setText(rs.getString("fname")+" "+rs.getString("lname"));
                        can3Party.setText(rs.getString("party"));
                        can3DOB.setText(rs.getString("dob"));
                        can3ID.setText(""+rs.getString("cid"));
                    }else if(j==3){
                         int num=j+1;
                                                can4Label.setText("Candidate "+num);

                        can4Name.setText(rs.getString("fname")+" "+rs.getString("lname"));
                        can4Party.setText(rs.getString("party"));
                        can4DOB.setText(rs.getString("dob"));
                        can4ID.setText(""+rs.getString("cid"));
                    }
                }
            
            }
            catch(SQLException e){
                System.err.println(e);
            }
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        can1Label = new javax.swing.JLabel();
        can2Label = new javax.swing.JLabel();
        can1Name = new javax.swing.JLabel();
        can1ID = new javax.swing.JLabel();
        can1DOB = new javax.swing.JLabel();
        can1Party = new javax.swing.JLabel();
        can2Name = new javax.swing.JLabel();
        can3Name = new javax.swing.JLabel();
        can4Name = new javax.swing.JLabel();
        can2ID = new javax.swing.JLabel();
        can2DOB = new javax.swing.JLabel();
        can2Party = new javax.swing.JLabel();
        can3Label = new javax.swing.JLabel();
        can3ID = new javax.swing.JLabel();
        can3DOB = new javax.swing.JLabel();
        can3Party = new javax.swing.JLabel();
        can4Label = new javax.swing.JLabel();
        can4ID = new javax.swing.JLabel();
        can4Party = new javax.swing.JLabel();
        can4DOB = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Candidate details");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Ward number: ");

        can1Label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        can1Label.setText("Candidate 1");

        can2Label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        can1Name.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        can1Name.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        can1Name.setText("Name");

        can1ID.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        can1ID.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        can1ID.setText("Candidate Id");

        can1DOB.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        can1DOB.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        can1DOB.setText("DOB");

        can1Party.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        can1Party.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        can1Party.setText("Party");

        can2Name.setText("a");

        can3Name.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        can3Name.setText("a");

        can4Name.setText("a");

        can2ID.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        can2ID.setText("sss");

        can2DOB.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        can2DOB.setText("df");

        can2Party.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        can2Party.setText("sf");

        can3Label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        can3Label.setText("c");

        can3ID.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        can3ID.setText("b");

        can3DOB.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        can3DOB.setText("c");

        can3Party.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        can3Party.setText("d");

        can4Label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        can4Label.setText("c");

        can4ID.setText("a");

        can4Party.setText("a");

        can4DOB.setText("a");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(can3Name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(can3ID, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                            .addComponent(can3DOB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(can3Party, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(can3Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(can4Name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                            .addComponent(can4ID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                            .addComponent(can4DOB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                            .addComponent(can4Party, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                            .addComponent(can4Label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(102, 102, 102))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(19, 19, 19)
                                    .addComponent(can1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(can2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(can1Name, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(can1ID, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(140, 140, 140)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(can2ID, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(can2Name, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(can1DOB, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                            .addComponent(can1Party, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(140, 140, 140)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(can2DOB, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(can2Party, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 92, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(can1Label)
                    .addComponent(can2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(can1Name)
                    .addComponent(can2Name, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(can1ID)
                    .addComponent(can2ID, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(can1DOB)
                    .addComponent(can2DOB, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(can2Party, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(can1Party))
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(can3Label, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(can4Label))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(can4Name)
                        .addGap(10, 10, 10)
                        .addComponent(can4ID, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(can4DOB, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(can4Party, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(can3Name)
                        .addGap(10, 10, 10)
                        .addComponent(can3ID, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(can3DOB, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(can3Party, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        voterDetails vd = new voterDetails();
        setVisible(false);
        vd.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(candidateDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(candidateDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(candidateDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(candidateDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new candidateDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel can1DOB;
    private javax.swing.JLabel can1ID;
    private javax.swing.JLabel can1Label;
    private javax.swing.JLabel can1Name;
    private javax.swing.JLabel can1Party;
    private javax.swing.JLabel can2DOB;
    private javax.swing.JLabel can2ID;
    private javax.swing.JLabel can2Label;
    private javax.swing.JLabel can2Name;
    private javax.swing.JLabel can2Party;
    private javax.swing.JLabel can3DOB;
    private javax.swing.JLabel can3ID;
    private javax.swing.JLabel can3Label;
    private javax.swing.JLabel can3Name;
    private javax.swing.JLabel can3Party;
    private javax.swing.JLabel can4DOB;
    private javax.swing.JLabel can4ID;
    private javax.swing.JLabel can4Label;
    private javax.swing.JLabel can4Name;
    private javax.swing.JLabel can4Party;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
