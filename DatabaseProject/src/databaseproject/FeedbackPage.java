/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author smart view
 */
public class FeedbackPage extends javax.swing.JFrame {

    /**
     * Creates new form feedbackPage
     */
    public Connection con;
    public PreparedStatement pst;
    String phn;
    String msg;
    public FeedbackPage() {
        initComponents();
        setResizable(false);
    
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        P = new javax.swing.JLabel();
        phoneField = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        msgField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        NavPanel = new javax.swing.JPanel();
        navReservation = new javax.swing.JButton();
        navUserProfile = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();
        copyrightLabel = new javax.swing.JLabel();
        navHome = new javax.swing.JButton();
        navAboutUs = new javax.swing.JButton();
        navSignUp = new javax.swing.JButton();
        navFeedback = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 1270, 680));
        setLocation(new java.awt.Point(0, 0));
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 1270, 680));
        setMaximumSize(new java.awt.Dimension(1270, 680));
        setMinimumSize(new java.awt.Dimension(1270, 680));
        setPreferredSize(new java.awt.Dimension(1270, 680));
        setResizable(false);
        setSize(new java.awt.Dimension(1270, 680));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        P.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        P.setText("Phone :");
        jPanel2.add(P, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 80, 30));
        jPanel2.add(phoneField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 200, 40));

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));
        jPanel4.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Info");
        jPanel4.add(jLabel1);
        jLabel1.setBounds(100, 20, 100, 30);

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 80));

        jPanel5.setLayout(null);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/databaseproject/images/Feedback.jpg"))); // NOI18N
        jPanel5.add(jLabel3);
        jLabel3.setBounds(0, 0, 330, 240);

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 330, 240));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 330, 460));

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(msgField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 300, 190));

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("SEND");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 403, 73, 30));

        jPanel6.setBackground(new java.awt.Color(0, 102, 102));
        jPanel6.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Message");
        jPanel6.add(jLabel4);
        jLabel4.setBounds(70, 10, 200, 50);

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 70));

        jPanel8.setLayout(null);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/databaseproject/images/Rating.jpg"))); // NOI18N
        jPanel8.add(jLabel7);
        jLabel7.setBounds(0, 0, 320, 90);

        jPanel3.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 320, 90));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 120, 320, 460));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/databaseproject/images/bgFeedback.jpg"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, 1270, 680));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 0, 1150, -1));

        NavPanel.setBackground(new java.awt.Color(51, 51, 51));
        NavPanel.setMaximumSize(new java.awt.Dimension(120, 680));
        NavPanel.setMinimumSize(new java.awt.Dimension(120, 680));
        NavPanel.setPreferredSize(new java.awt.Dimension(120, 680));
        NavPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        navReservation.setBackground(new java.awt.Color(51, 51, 51));
        navReservation.setForeground(new java.awt.Color(255, 255, 255));
        navReservation.setText("RESERVATION");
        navReservation.setToolTipText("");
        navReservation.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        navReservation.setMargin(new java.awt.Insets(0, 14, 0, 14));
        navReservation.setMaximumSize(new java.awt.Dimension(77, 30));
        navReservation.setMinimumSize(new java.awt.Dimension(77, 30));
        navReservation.setPreferredSize(new java.awt.Dimension(77, 30));
        navReservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                navReservationActionPerformed(evt);
            }
        });
        NavPanel.add(navReservation, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 120, 45));

        navUserProfile.setBackground(new java.awt.Color(51, 51, 51));
        navUserProfile.setForeground(new java.awt.Color(255, 255, 255));
        navUserProfile.setText("USER PROFILE");
        navUserProfile.setToolTipText("");
        navUserProfile.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        navUserProfile.setMargin(new java.awt.Insets(0, 14, 0, 14));
        navUserProfile.setMaximumSize(new java.awt.Dimension(77, 30));
        navUserProfile.setMinimumSize(new java.awt.Dimension(77, 30));
        navUserProfile.setPreferredSize(new java.awt.Dimension(77, 30));
        navUserProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                navUserProfileActionPerformed(evt);
            }
        });
        NavPanel.add(navUserProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 120, 45));

        titleLabel.setBackground(new java.awt.Color(153, 153, 153));
        titleLabel.setFont(new java.awt.Font("Wide Latin", 3, 14)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(204, 0, 0));
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        titleLabel.setText("RentAll");
        NavPanel.add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 10, 110, 64));

        copyrightLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 2, 16)); // NOI18N
        copyrightLabel.setForeground(new java.awt.Color(255, 255, 255));
        copyrightLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        copyrightLabel.setText("<html><body>Copyright<br>&copy;RentAll</body></html>");
        NavPanel.add(copyrightLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, 100, 38));

        navHome.setBackground(new java.awt.Color(51, 51, 51));
        navHome.setForeground(new java.awt.Color(255, 255, 255));
        navHome.setText("HOME");
        navHome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        navHome.setMargin(new java.awt.Insets(0, 14, 0, 14));
        navHome.setMaximumSize(new java.awt.Dimension(77, 30));
        navHome.setMinimumSize(new java.awt.Dimension(77, 30));
        navHome.setName(""); // NOI18N
        navHome.setPreferredSize(new java.awt.Dimension(77, 30));
        navHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                navHomeActionPerformed(evt);
            }
        });
        NavPanel.add(navHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 120, 45));

        navAboutUs.setBackground(new java.awt.Color(51, 51, 51));
        navAboutUs.setForeground(new java.awt.Color(255, 255, 255));
        navAboutUs.setText("ABOUT US");
        navAboutUs.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        navAboutUs.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        navAboutUs.setMargin(new java.awt.Insets(0, 14, 0, 14));
        navAboutUs.setMaximumSize(new java.awt.Dimension(77, 30));
        navAboutUs.setMinimumSize(new java.awt.Dimension(77, 30));
        navAboutUs.setName(""); // NOI18N
        navAboutUs.setPreferredSize(new java.awt.Dimension(77, 30));
        navAboutUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                navAboutUsActionPerformed(evt);
            }
        });
        NavPanel.add(navAboutUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 120, 45));

        navSignUp.setBackground(new java.awt.Color(51, 51, 51));
        navSignUp.setForeground(new java.awt.Color(255, 255, 255));
        navSignUp.setText("SIGN UP");
        navSignUp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        navSignUp.setMargin(new java.awt.Insets(0, 14, 0, 14));
        navSignUp.setMaximumSize(new java.awt.Dimension(77, 30));
        navSignUp.setMinimumSize(new java.awt.Dimension(77, 30));
        navSignUp.setName(""); // NOI18N
        navSignUp.setPreferredSize(new java.awt.Dimension(77, 30));
        navSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                navSignUpActionPerformed(evt);
            }
        });
        NavPanel.add(navSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 120, 45));

        navFeedback.setBackground(new java.awt.Color(51, 51, 51));
        navFeedback.setForeground(new java.awt.Color(255, 255, 255));
        navFeedback.setText("FEEDBACK");
        navFeedback.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        navFeedback.setMargin(new java.awt.Insets(0, 14, 0, 14));
        navFeedback.setMaximumSize(new java.awt.Dimension(120, 45));
        navFeedback.setMinimumSize(new java.awt.Dimension(120, 45));
        navFeedback.setName(""); // NOI18N
        navFeedback.setPreferredSize(new java.awt.Dimension(120, 45));
        navFeedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                navFeedbackActionPerformed(evt);
            }
        });
        NavPanel.add(navFeedback, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 120, 45));

        getContentPane().add(NavPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 680));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void navReservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_navReservationActionPerformed
        // TODO add your handling code here:
        new ReservationPage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_navReservationActionPerformed

    private void navUserProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_navUserProfileActionPerformed
        // TODO add your handling code here:
        new UserProfilePage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_navUserProfileActionPerformed

    private void navHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_navHomeActionPerformed
        // TODO add your handling code here:
        new HomePage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_navHomeActionPerformed

    private void navAboutUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_navAboutUsActionPerformed
        // TODO add your handling code here:
        new AboutUsPage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_navAboutUsActionPerformed

    private void navSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_navSignUpActionPerformed
        // TODO add your handling code here:
        new SignUpPage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_navSignUpActionPerformed

    private void navFeedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_navFeedbackActionPerformed
        // TODO add your handling code here:
        new FeedbackPage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_navFeedbackActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        phn = phoneField.getText();
        msg = msgField.getText();
        if(phn.equals("") || msg.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Please insert required information.");   
        }
        else
        {
            try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           
            con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Rental;selectMethod=cursor", "sa", "123456");
           
            System.out.println("DATABASE NAME IS:" + con.getMetaData().getDatabaseProductName());
           
            //connectDB();
            pst = con.prepareStatement("INSERT INTO FEEDBACK (CustomerId, Message)\n" + "VALUES ((Select CustomerId from CUSTOMER where Phone='?'),'?')");

            pst.setString(1, phn);
            pst.setString(2, msg);
           
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Thank you for your feedback!");
           
            phoneField.setText("");
            msgField.setText("");

           //con.close();
           new UserProfilePage().setVisible(true);
           this.dispose();
           
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SignUpPage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SignUpPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
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
            java.util.logging.Logger.getLogger(FeedbackPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FeedbackPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FeedbackPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FeedbackPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FeedbackPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel NavPanel;
    private javax.swing.JLabel P;
    private javax.swing.JLabel copyrightLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTextField msgField;
    private javax.swing.JButton navAboutUs;
    private javax.swing.JButton navFeedback;
    private javax.swing.JButton navHome;
    private javax.swing.JButton navReservation;
    private javax.swing.JButton navSignUp;
    private javax.swing.JButton navUserProfile;
    private javax.swing.JTextField phoneField;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}