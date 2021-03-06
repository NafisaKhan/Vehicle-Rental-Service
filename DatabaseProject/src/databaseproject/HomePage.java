/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseproject;

/**
 *
 * @author EUNA
 */
public class HomePage extends javax.swing.JFrame {

    /**
     * Creates new form HomePage
     */
    public HomePage() {
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

        ZNavPanel = new javax.swing.JPanel();
        navFeedback = new javax.swing.JButton();
        navReservation = new javax.swing.JButton();
        navUserProfile = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();
        copyrightLabel = new javax.swing.JLabel();
        navHome = new javax.swing.JButton();
        navAboutUs = new javax.swing.JButton();
        navSignUp = new javax.swing.JButton();
        LoginPanel = new javax.swing.JPanel();
        goButton = new javax.swing.JButton();
        bgHome = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 1270, 680));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(0, 0));
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 1270, 680));
        setMaximumSize(new java.awt.Dimension(1270, 680));
        setResizable(false);
        setSize(new java.awt.Dimension(1270, 680));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ZNavPanel.setBackground(new java.awt.Color(51, 51, 51));
        ZNavPanel.setMaximumSize(new java.awt.Dimension(120, 680));
        ZNavPanel.setMinimumSize(new java.awt.Dimension(120, 680));
        ZNavPanel.setPreferredSize(new java.awt.Dimension(120, 680));
        ZNavPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        ZNavPanel.add(navFeedback, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 120, 45));

        navReservation.setBackground(new java.awt.Color(51, 51, 51));
        navReservation.setForeground(new java.awt.Color(255, 255, 255));
        navReservation.setText("RESERVATION");
        navReservation.setToolTipText("");
        navReservation.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        navReservation.setMargin(new java.awt.Insets(0, 14, 0, 14));
        navReservation.setMaximumSize(new java.awt.Dimension(120, 45));
        navReservation.setMinimumSize(new java.awt.Dimension(120, 45));
        navReservation.setPreferredSize(new java.awt.Dimension(120, 45));
        navReservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                navReservationActionPerformed(evt);
            }
        });
        ZNavPanel.add(navReservation, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 120, 45));

        navUserProfile.setBackground(new java.awt.Color(51, 51, 51));
        navUserProfile.setForeground(new java.awt.Color(255, 255, 255));
        navUserProfile.setText("USER PROFILE");
        navUserProfile.setToolTipText("");
        navUserProfile.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        navUserProfile.setMargin(new java.awt.Insets(0, 14, 0, 14));
        navUserProfile.setMaximumSize(new java.awt.Dimension(120, 45));
        navUserProfile.setMinimumSize(new java.awt.Dimension(120, 45));
        navUserProfile.setPreferredSize(new java.awt.Dimension(120, 45));
        navUserProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                navUserProfileActionPerformed(evt);
            }
        });
        ZNavPanel.add(navUserProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 120, 45));

        titleLabel.setBackground(new java.awt.Color(153, 153, 153));
        titleLabel.setFont(new java.awt.Font("Wide Latin", 3, 14)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(204, 0, 0));
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        titleLabel.setText("RentAll");
        ZNavPanel.add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 10, 110, 64));

        copyrightLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 2, 16)); // NOI18N
        copyrightLabel.setForeground(new java.awt.Color(255, 255, 255));
        copyrightLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        copyrightLabel.setText("<html><body>Copyright<br>&copy;RentAll</body></html>");
        ZNavPanel.add(copyrightLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, 100, 38));

        navHome.setBackground(new java.awt.Color(51, 51, 51));
        navHome.setForeground(new java.awt.Color(255, 255, 255));
        navHome.setText("HOME");
        navHome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        navHome.setMargin(new java.awt.Insets(0, 14, 0, 14));
        navHome.setMaximumSize(new java.awt.Dimension(120, 45));
        navHome.setMinimumSize(new java.awt.Dimension(120, 45));
        navHome.setName(""); // NOI18N
        navHome.setPreferredSize(new java.awt.Dimension(120, 45));
        navHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                navHomeActionPerformed(evt);
            }
        });
        ZNavPanel.add(navHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 120, 45));

        navAboutUs.setBackground(new java.awt.Color(51, 51, 51));
        navAboutUs.setForeground(new java.awt.Color(255, 255, 255));
        navAboutUs.setText("ABOUT US");
        navAboutUs.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        navAboutUs.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        navAboutUs.setMargin(new java.awt.Insets(0, 14, 0, 14));
        navAboutUs.setMaximumSize(new java.awt.Dimension(120, 45));
        navAboutUs.setMinimumSize(new java.awt.Dimension(120, 45));
        navAboutUs.setName(""); // NOI18N
        navAboutUs.setPreferredSize(new java.awt.Dimension(77, 30));
        navAboutUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                navAboutUsActionPerformed(evt);
            }
        });
        ZNavPanel.add(navAboutUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 120, 45));

        navSignUp.setBackground(new java.awt.Color(51, 51, 51));
        navSignUp.setForeground(new java.awt.Color(255, 255, 255));
        navSignUp.setText("SIGN UP");
        navSignUp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        navSignUp.setMargin(new java.awt.Insets(0, 14, 0, 14));
        navSignUp.setMaximumSize(new java.awt.Dimension(120, 45));
        navSignUp.setMinimumSize(new java.awt.Dimension(120, 45));
        navSignUp.setName(""); // NOI18N
        navSignUp.setPreferredSize(new java.awt.Dimension(120, 45));
        navSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                navSignUpActionPerformed(evt);
            }
        });
        ZNavPanel.add(navSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 120, 45));

        getContentPane().add(ZNavPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 680));

        LoginPanel.setBackground(new java.awt.Color(255, 255, 255));
        LoginPanel.setInheritsPopupMenu(true);
        LoginPanel.setMaximumSize(new java.awt.Dimension(1150, 680));
        LoginPanel.setName("LoginPanel"); // NOI18N
        LoginPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        goButton.setBackground(new java.awt.Color(204, 153, 0));
        goButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        goButton.setText("Go to");
        goButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goButtonActionPerformed(evt);
            }
        });
        LoginPanel.add(goButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 380, 110, 40));

        bgHome.setBackground(new java.awt.Color(51, 0, 51));
        bgHome.setForeground(new java.awt.Color(255, 255, 255));
        bgHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/databaseproject/images/Welcome.jpg"))); // NOI18N
        bgHome.setToolTipText("");
        bgHome.setMaximumSize(new java.awt.Dimension(1150, 680));
        bgHome.setMinimumSize(new java.awt.Dimension(1150, 680));
        bgHome.setName("bgHome"); // NOI18N
        bgHome.setPreferredSize(new java.awt.Dimension(1150, 680));
        LoginPanel.add(bgHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 680));

        getContentPane().add(LoginPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 1150, 680));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void navFeedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_navFeedbackActionPerformed
        // TODO add your handling code here:
        new FeedbackPage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_navFeedbackActionPerformed

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

    private void goButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goButtonActionPerformed
        // TODO add your handling code here:
        new LoginPage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_goButtonActionPerformed

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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LoginPanel;
    private javax.swing.JPanel ZNavPanel;
    private javax.swing.JLabel bgHome;
    private javax.swing.JLabel copyrightLabel;
    private javax.swing.JButton goButton;
    private javax.swing.JButton navAboutUs;
    private javax.swing.JButton navFeedback;
    private javax.swing.JButton navHome;
    private javax.swing.JButton navReservation;
    private javax.swing.JButton navSignUp;
    private javax.swing.JButton navUserProfile;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
