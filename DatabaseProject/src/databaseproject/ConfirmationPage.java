/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseproject;

import java.util.ArrayList;

/**
 *
 * @author smart view
 */
public class ConfirmationPage extends javax.swing.JFrame {

    /**
     * Creates new form ConfirmationPage
     */
    public ConfirmationPage() {
        initComponents();
        setResizable(false);
    }
        ArrayList<String> reservationForm = new ArrayList<String>(); 
        public void setReservation(ArrayList<String> Form){
        reservationForm=Form;
        pickupPointField.setText(reservationForm.get(0));
        reserveDateField.setText(reservationForm.get(1));
        StartTimeField.setText(reservationForm.get(2));
        VehiclNameField.setText(reservationForm.get(6)+" "+reservationForm.get(7));
        float x=Integer.parseInt(reservationForm.get(3))*Integer.parseInt(reservationForm.get(4))*Float.parseFloat(reservationForm.get(8));
        CostField.setText(Float.toString(x));
        reservationForm.add(Float.toString(x));

    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ConfirmationPanel = new javax.swing.JPanel();
        StartTimeField = new javax.swing.JTextField();
        VehiclNameField = new javax.swing.JTextField();
        cancelButton = new javax.swing.JButton();
        pickupPointLabel = new javax.swing.JLabel();
        pickupPointField = new javax.swing.JTextField();
        reserveDateLabel = new javax.swing.JLabel();
        reserveDateField = new javax.swing.JTextField();
        reserveHoursLabel = new javax.swing.JLabel();
        CostField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        confirmButton = new javax.swing.JButton();
        bgReservation = new javax.swing.JLabel();
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
        setResizable(false);
        setSize(new java.awt.Dimension(1270, 680));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ConfirmationPanel.setBackground(new java.awt.Color(66, 36, 138));
        ConfirmationPanel.setToolTipText("");
        ConfirmationPanel.setMaximumSize(new java.awt.Dimension(1150, 680));
        ConfirmationPanel.setName(""); // NOI18N
        ConfirmationPanel.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                ConfirmationPanelAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        ConfirmationPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        StartTimeField.setEditable(false);
        StartTimeField.setBackground(new java.awt.Color(255, 204, 204));
        StartTimeField.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        StartTimeField.setMaximumSize(new java.awt.Dimension(290, 50));
        StartTimeField.setMinimumSize(new java.awt.Dimension(290, 50));
        StartTimeField.setPreferredSize(new java.awt.Dimension(290, 50));
        StartTimeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartTimeFieldActionPerformed(evt);
            }
        });
        ConfirmationPanel.add(StartTimeField, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 290, -1, -1));

        VehiclNameField.setEditable(false);
        VehiclNameField.setBackground(new java.awt.Color(255, 204, 204));
        VehiclNameField.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        VehiclNameField.setMaximumSize(new java.awt.Dimension(290, 50));
        VehiclNameField.setMinimumSize(new java.awt.Dimension(290, 50));
        VehiclNameField.setPreferredSize(new java.awt.Dimension(290, 50));
        VehiclNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VehiclNameFieldActionPerformed(evt);
            }
        });
        ConfirmationPanel.add(VehiclNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 360, -1, -1));

        cancelButton.setBackground(new java.awt.Color(51, 0, 51));
        cancelButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cancelButton.setForeground(new java.awt.Color(255, 255, 255));
        cancelButton.setText("Cancel");
        cancelButton.setMaximumSize(new java.awt.Dimension(110, 50));
        cancelButton.setMinimumSize(new java.awt.Dimension(110, 50));
        cancelButton.setPreferredSize(new java.awt.Dimension(110, 50));
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        ConfirmationPanel.add(cancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 550, 110, 50));

        pickupPointLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pickupPointLabel.setForeground(new java.awt.Color(255, 255, 255));
        pickupPointLabel.setText("Pickup Point :");
        ConfirmationPanel.add(pickupPointLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 150, 130, 30));

        pickupPointField.setEditable(false);
        pickupPointField.setBackground(new java.awt.Color(255, 204, 204));
        pickupPointField.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        pickupPointField.setMaximumSize(new java.awt.Dimension(290, 50));
        pickupPointField.setMinimumSize(new java.awt.Dimension(290, 50));
        pickupPointField.setPreferredSize(new java.awt.Dimension(290, 50));
        pickupPointField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pickupPointFieldActionPerformed(evt);
            }
        });
        ConfirmationPanel.add(pickupPointField, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 150, 290, -1));

        reserveDateLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        reserveDateLabel.setForeground(new java.awt.Color(255, 255, 255));
        reserveDateLabel.setText("Reservation Date:");
        ConfirmationPanel.add(reserveDateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, 140, 40));

        reserveDateField.setEditable(false);
        reserveDateField.setBackground(new java.awt.Color(255, 204, 204));
        reserveDateField.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        reserveDateField.setMaximumSize(new java.awt.Dimension(290, 50));
        reserveDateField.setMinimumSize(new java.awt.Dimension(290, 50));
        reserveDateField.setPreferredSize(new java.awt.Dimension(290, 50));
        reserveDateField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reserveDateFieldActionPerformed(evt);
            }
        });
        ConfirmationPanel.add(reserveDateField, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 220, -1, -1));

        reserveHoursLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        reserveHoursLabel.setForeground(new java.awt.Color(255, 255, 255));
        reserveHoursLabel.setText("Vehicle:");
        ConfirmationPanel.add(reserveHoursLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 370, 110, 30));

        CostField.setEditable(false);
        CostField.setBackground(new java.awt.Color(255, 204, 204));
        CostField.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        CostField.setMaximumSize(new java.awt.Dimension(290, 50));
        CostField.setMinimumSize(new java.awt.Dimension(290, 50));
        CostField.setPreferredSize(new java.awt.Dimension(290, 50));
        ConfirmationPanel.add(CostField, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 430, -1, 50));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Starting Time :");
        ConfirmationPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 300, 120, 30));

        jLabel8.setFont(new java.awt.Font("Wide Latin", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 51));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Confirm Reservation");
        ConfirmationPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 900, 70));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Total Cost:");
        ConfirmationPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 440, 120, 30));

        confirmButton.setBackground(new java.awt.Color(0, 51, 0));
        confirmButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        confirmButton.setForeground(new java.awt.Color(255, 255, 255));
        confirmButton.setText("Confirm");
        confirmButton.setMaximumSize(new java.awt.Dimension(110, 50));
        confirmButton.setMinimumSize(new java.awt.Dimension(110, 50));
        confirmButton.setPreferredSize(new java.awt.Dimension(110, 50));
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });
        ConfirmationPanel.add(confirmButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 550, -1, -1));

        bgReservation.setBackground(new java.awt.Color(153, 153, 153));
        bgReservation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/databaseproject/images/bookConfirm.jpg"))); // NOI18N
        bgReservation.setMaximumSize(new java.awt.Dimension(1150, 680));
        bgReservation.setMinimumSize(new java.awt.Dimension(1150, 680));
        bgReservation.setPreferredSize(new java.awt.Dimension(1150, 680));
        ConfirmationPanel.add(bgReservation, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 680));

        getContentPane().add(ConfirmationPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 1150, -1));

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

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        new ReservationPage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
        // TODO add your handling code here:
        //new PaymentPage().setVisible(true);
        this.dispose();
        PaymentPage pp= new PaymentPage();
         // ArrayList<String> reservationForm = new ArrayList<String>();
         pp.setVisible(true);                
         pp.setReservation(reservationForm);
        
        
    }//GEN-LAST:event_confirmButtonActionPerformed

    private void ConfirmationPanelAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_ConfirmationPanelAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_ConfirmationPanelAncestorAdded

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

    private void pickupPointFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pickupPointFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pickupPointFieldActionPerformed

    private void reserveDateFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reserveDateFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reserveDateFieldActionPerformed

    private void StartTimeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartTimeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StartTimeFieldActionPerformed

    private void VehiclNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VehiclNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VehiclNameFieldActionPerformed

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
            java.util.logging.Logger.getLogger(ConfirmationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConfirmationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConfirmationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConfirmationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConfirmationPage().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ConfirmationPanel;
    private javax.swing.JTextField CostField;
    private javax.swing.JPanel NavPanel;
    private javax.swing.JTextField StartTimeField;
    private javax.swing.JTextField VehiclNameField;
    private javax.swing.JLabel bgReservation;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton confirmButton;
    private javax.swing.JLabel copyrightLabel;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton navAboutUs;
    private javax.swing.JButton navFeedback;
    private javax.swing.JButton navHome;
    private javax.swing.JButton navReservation;
    private javax.swing.JButton navSignUp;
    private javax.swing.JButton navUserProfile;
    private javax.swing.JTextField pickupPointField;
    private javax.swing.JLabel pickupPointLabel;
    private javax.swing.JTextField reserveDateField;
    private javax.swing.JLabel reserveDateLabel;
    private javax.swing.JLabel reserveHoursLabel;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
