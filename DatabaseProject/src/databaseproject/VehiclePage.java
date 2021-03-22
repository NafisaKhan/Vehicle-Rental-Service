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
public class VehiclePage extends javax.swing.JFrame {

    /**
     * Creates new form chooseVehicle
     */
    public VehiclePage() {
        initComponents();
        setResizable(false);
    }
    
    ArrayList<String> reservationForm = new ArrayList<String>(); 
    public void setReservation(ArrayList<String> Form){
    reservationForm=Form;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        VehiclePanel = new javax.swing.JPanel();
        BackButton = new javax.swing.JButton();
        CarPanel = new javax.swing.JPanel();
        cardCar = new javax.swing.JLabel();
        CarButton = new javax.swing.JButton();
        BikePanel = new javax.swing.JPanel();
        BikeButton = new javax.swing.JButton();
        cardBike = new javax.swing.JLabel();
        BicyclePanel = new javax.swing.JPanel();
        BicycleButton = new javax.swing.JButton();
        cardBicycle = new javax.swing.JLabel();
        ColorPanel = new javax.swing.JPanel();
        headingLabel = new javax.swing.JLabel();
        NavPanel = new javax.swing.JPanel();
        navFeedback = new javax.swing.JButton();
        navReservation = new javax.swing.JButton();
        navUserProfile = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();
        copyrightLabel = new javax.swing.JLabel();
        navHome = new javax.swing.JButton();
        navAboutUs = new javax.swing.JButton();
        navSignUp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 1270, 680));
        setLocation(new java.awt.Point(0, 0));
        setLocationByPlatform(true);
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 1270, 680));
        setMaximumSize(new java.awt.Dimension(1270, 680));
        setMinimumSize(new java.awt.Dimension(1270, 680));
        setResizable(false);
        setSize(new java.awt.Dimension(1270, 680));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        VehiclePanel.setBackground(new java.awt.Color(240, 240, 196));
        VehiclePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BackButton.setBackground(new java.awt.Color(0, 102, 153));
        BackButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BackButton.setForeground(new java.awt.Color(255, 255, 255));
        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        VehiclePanel.add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 580, 90, 40));

        CarPanel.setBackground(new java.awt.Color(210, 50, 90));
        CarPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cardCar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/databaseproject/images/cardCar.jpg"))); // NOI18N
        CarPanel.add(cardCar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 240));

        CarButton.setBackground(new java.awt.Color(255, 255, 204));
        CarButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        CarButton.setText("Car");
        CarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CarButtonActionPerformed(evt);
            }
        });
        CarPanel.add(CarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 120, 40));

        VehiclePanel.add(CarPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 260, 320));

        BikePanel.setBackground(new java.awt.Color(0, 0, 0));
        BikePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BikeButton.setBackground(new java.awt.Color(255, 255, 204));
        BikeButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BikeButton.setText("Bike");
        BikeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BikeButtonActionPerformed(evt);
            }
        });
        BikePanel.add(BikeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 130, 40));

        cardBike.setIcon(new javax.swing.ImageIcon(getClass().getResource("/databaseproject/images/cardBike.jpg"))); // NOI18N
        BikePanel.add(cardBike, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 240));

        VehiclePanel.add(BikePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 260, 320));

        BicyclePanel.setBackground(new java.awt.Color(210, 50, 90));
        BicyclePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BicycleButton.setBackground(new java.awt.Color(255, 255, 204));
        BicycleButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BicycleButton.setText("Bicycle");
        BicycleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BicycleButtonActionPerformed(evt);
            }
        });
        BicyclePanel.add(BicycleButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 110, 40));

        cardBicycle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/databaseproject/images/cardBicycle.jpg"))); // NOI18N
        BicyclePanel.add(cardBicycle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 240));

        VehiclePanel.add(BicyclePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 220, 260, 320));

        ColorPanel.setBackground(new java.awt.Color(51, 0, 51));
        ColorPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        headingLabel.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        headingLabel.setForeground(new java.awt.Color(255, 255, 255));
        headingLabel.setText("Choose Your Vehicle");
        ColorPanel.add(headingLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 390, 50));

        VehiclePanel.add(ColorPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 70));

        getContentPane().add(VehiclePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 1150, 680));

        NavPanel.setBackground(new java.awt.Color(51, 51, 51));
        NavPanel.setMaximumSize(new java.awt.Dimension(120, 680));
        NavPanel.setMinimumSize(new java.awt.Dimension(120, 680));
        NavPanel.setPreferredSize(new java.awt.Dimension(120, 680));
        NavPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        NavPanel.add(navReservation, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 120, 45));

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
        navHome.setMaximumSize(new java.awt.Dimension(120, 45));
        navHome.setMinimumSize(new java.awt.Dimension(120, 45));
        navHome.setName(""); // NOI18N
        navHome.setPreferredSize(new java.awt.Dimension(120, 45));
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
        navAboutUs.setMaximumSize(new java.awt.Dimension(120, 45));
        navAboutUs.setMinimumSize(new java.awt.Dimension(120, 45));
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
        navSignUp.setMaximumSize(new java.awt.Dimension(120, 45));
        navSignUp.setMinimumSize(new java.awt.Dimension(120, 45));
        navSignUp.setName(""); // NOI18N
        navSignUp.setPreferredSize(new java.awt.Dimension(120, 45));
        navSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                navSignUpActionPerformed(evt);
            }
        });
        NavPanel.add(navSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 120, 45));

        getContentPane().add(NavPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 680));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CarButtonActionPerformed
        // TODO add your handling code here:
        //new CarPage().setVisible(true);
        this.dispose();
        CarPage crp= new CarPage();
        crp.setVisible(true);       
        crp.setReservation(reservationForm);
    }//GEN-LAST:event_CarButtonActionPerformed

    private void BikeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BikeButtonActionPerformed
        // TODO add your handling code here:
        //new BikePage().setVisible(true); 
        this.dispose();
        BikePage bp= new BikePage();
        bp.setVisible(true);       
        bp.setReservation(reservationForm);
    }//GEN-LAST:event_BikeButtonActionPerformed

    private void BicycleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BicycleButtonActionPerformed
        // TODO add your handling code here:
        //new BicyclePage().setVisible(true);
        this.dispose();
        BicyclePage bcp= new BicyclePage();
        bcp.setVisible(true);       
        bcp.setReservation(reservationForm);
    }//GEN-LAST:event_BicycleButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
        new ReservationPage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

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
            java.util.logging.Logger.getLogger(VehiclePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VehiclePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VehiclePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VehiclePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VehiclePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton BicycleButton;
    private javax.swing.JPanel BicyclePanel;
    private javax.swing.JButton BikeButton;
    private javax.swing.JPanel BikePanel;
    private javax.swing.JButton CarButton;
    private javax.swing.JPanel CarPanel;
    private javax.swing.JPanel ColorPanel;
    private javax.swing.JPanel NavPanel;
    private javax.swing.JPanel VehiclePanel;
    private javax.swing.JLabel cardBicycle;
    private javax.swing.JLabel cardBike;
    private javax.swing.JLabel cardCar;
    private javax.swing.JLabel copyrightLabel;
    private javax.swing.JLabel headingLabel;
    private javax.swing.JButton navAboutUs;
    private javax.swing.JButton navFeedback;
    private javax.swing.JButton navHome;
    private javax.swing.JButton navReservation;
    private javax.swing.JButton navSignUp;
    private javax.swing.JButton navUserProfile;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
