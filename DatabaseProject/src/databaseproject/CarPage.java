/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseproject;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author smart view
 */
public class CarPage extends javax.swing.JFrame {

    /**
     * Creates new form carPage
     */
    String search;
    String vehicleNo;
    String cBrand;
    String cModel;
    String cRegNo;
    String cColor;
    String cCC;
    String cFuel;
    String cCostHr;
    ConnectMSSQL cnObj = new ConnectMSSQL();
    Statement statement;
    public CarPage() {
        initComponents();
        setResizable(false);
        /*searchMenu.add(searchPanel);*/
        /*searchButton.addActionListener(New ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                
            }
        });*/
        cnObj.connectDB();
        
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

        searchPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        searchList = new javax.swing.JList<>();
        searchMenu = new javax.swing.JPopupMenu();
        CarPanel = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        VehicleNoField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        CarBrandField = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        CarModelField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        CarColorField = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        CarCCField = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        CarFuelField = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        CarCostHr = new javax.swing.JTextField();
        BookButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        CarRegField = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        searchField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        bgCar = new javax.swing.JLabel();
        NavPanel = new javax.swing.JPanel();
        navReservation = new javax.swing.JButton();
        navUserProfile = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();
        copyrightLabel = new javax.swing.JLabel();
        navHome = new javax.swing.JButton();
        navAboutUs = new javax.swing.JButton();
        navSignUp = new javax.swing.JButton();
        navFeedback = new javax.swing.JButton();

        searchPanel.setMaximumSize(new java.awt.Dimension(220, 40));
        searchPanel.setMinimumSize(new java.awt.Dimension(220, 40));
        searchPanel.setName(""); // NOI18N
        searchPanel.setPreferredSize(new java.awt.Dimension(220, 40));
        searchPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        searchList.setFont(new java.awt.Font("MS PGothic", 0, 16)); // NOI18N
        jScrollPane1.setViewportView(searchList);

        searchPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 220));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 1270, 680));
        setLocation(new java.awt.Point(0, 0));
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 1270, 680));
        setMaximumSize(new java.awt.Dimension(1270, 680));
        setMinimumSize(new java.awt.Dimension(1270, 680));
        setResizable(false);
        setSize(new java.awt.Dimension(1270, 680));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CarPanel.setBackground(new java.awt.Color(204, 204, 204));
        CarPanel.setMaximumSize(new java.awt.Dimension(1150, 680));
        CarPanel.setMinimumSize(new java.awt.Dimension(1150, 680));
        CarPanel.setPreferredSize(new java.awt.Dimension(1150, 680));
        CarPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Brand Name :");
        jPanel10.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 100, 20));

        VehicleNoField.setEditable(false);
        VehicleNoField.setBackground(new java.awt.Color(204, 187, 187));
        VehicleNoField.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        VehicleNoField.setMaximumSize(new java.awt.Dimension(210, 40));
        VehicleNoField.setMinimumSize(new java.awt.Dimension(210, 40));
        VehicleNoField.setPreferredSize(new java.awt.Dimension(210, 40));
        VehicleNoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VehicleNoFieldActionPerformed(evt);
            }
        });
        jPanel10.add(VehicleNoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 210, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Model Name :");
        jPanel10.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 100, 30));

        CarBrandField.setEditable(false);
        CarBrandField.setBackground(new java.awt.Color(204, 187, 187));
        CarBrandField.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        CarBrandField.setMaximumSize(new java.awt.Dimension(210, 40));
        CarBrandField.setMinimumSize(new java.awt.Dimension(210, 40));
        CarBrandField.setPreferredSize(new java.awt.Dimension(210, 40));
        CarBrandField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CarBrandFieldActionPerformed(evt);
            }
        });
        jPanel10.add(CarBrandField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 210, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Fuel");
        jPanel10.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 50, 30));

        CarModelField.setEditable(false);
        CarModelField.setBackground(new java.awt.Color(204, 187, 187));
        CarModelField.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        CarModelField.setMaximumSize(new java.awt.Dimension(210, 40));
        CarModelField.setMinimumSize(new java.awt.Dimension(210, 40));
        CarModelField.setPreferredSize(new java.awt.Dimension(210, 40));
        CarModelField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CarModelFieldActionPerformed(evt);
            }
        });
        jPanel10.add(CarModelField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 210, 30));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("CC :");
        jPanel10.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 50, 20));

        CarColorField.setEditable(false);
        CarColorField.setBackground(new java.awt.Color(204, 187, 187));
        CarColorField.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        CarColorField.setMaximumSize(new java.awt.Dimension(210, 40));
        CarColorField.setMinimumSize(new java.awt.Dimension(210, 40));
        CarColorField.setPreferredSize(new java.awt.Dimension(210, 40));
        CarColorField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CarColorFieldActionPerformed(evt);
            }
        });
        jPanel10.add(CarColorField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 210, 30));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Color :");
        jPanel10.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, 20));

        CarCCField.setEditable(false);
        CarCCField.setBackground(new java.awt.Color(204, 187, 187));
        CarCCField.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        CarCCField.setMaximumSize(new java.awt.Dimension(210, 40));
        CarCCField.setMinimumSize(new java.awt.Dimension(210, 40));
        CarCCField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CarCCFieldActionPerformed(evt);
            }
        });
        jPanel10.add(CarCCField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 210, 30));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Cost/hr :");
        jPanel10.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 70, 20));

        CarFuelField.setEditable(false);
        CarFuelField.setBackground(new java.awt.Color(204, 187, 187));
        CarFuelField.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        CarFuelField.setMaximumSize(new java.awt.Dimension(210, 40));
        CarFuelField.setMinimumSize(new java.awt.Dimension(210, 40));
        CarFuelField.setPreferredSize(new java.awt.Dimension(210, 40));
        CarFuelField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CarFuelFieldActionPerformed(evt);
            }
        });
        jPanel10.add(CarFuelField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 210, 30));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("Vehicle No :");
        jPanel10.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 100, 20));

        CarCostHr.setEditable(false);
        CarCostHr.setBackground(new java.awt.Color(204, 187, 187));
        CarCostHr.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        CarCostHr.setMaximumSize(new java.awt.Dimension(210, 40));
        CarCostHr.setMinimumSize(new java.awt.Dimension(210, 40));
        CarCostHr.setPreferredSize(new java.awt.Dimension(210, 40));
        CarCostHr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CarCostHrActionPerformed(evt);
            }
        });
        jPanel10.add(CarCostHr, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 210, 30));

        BookButton.setBackground(new java.awt.Color(0, 153, 153));
        BookButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BookButton.setText("Book");
        BookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookButtonActionPerformed(evt);
            }
        });
        jPanel10.add(BookButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 450, 80, 40));

        BackButton.setBackground(new java.awt.Color(153, 0, 153));
        BackButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        jPanel10.add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, 90, 40));

        jPanel11.setBackground(new java.awt.Color(51, 0, 51));
        jPanel11.setForeground(new java.awt.Color(51, 0, 51));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Details");
        jPanel11.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        jPanel10.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 70));

        CarRegField.setEditable(false);
        CarRegField.setBackground(new java.awt.Color(204, 187, 187));
        CarRegField.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        CarRegField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CarRegFieldActionPerformed(evt);
            }
        });
        jPanel10.add(CarRegField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 210, 30));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText("Registration No :");
        jPanel10.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, 20));

        CarPanel.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 120, 400, 520));

        jLabel11.setFont(new java.awt.Font("Wide Latin", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Car Reservation");
        CarPanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 530, 50));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        searchField.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });
        searchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchFieldKeyReleased(evt);
            }
        });
        jPanel2.add(searchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 220, 40));

        searchButton.setBackground(new java.awt.Color(255, 204, 204));
        searchButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        searchButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchButtonKeyReleased(evt);
            }
        });
        jPanel2.add(searchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 90, 40));

        jPanel6.setLayout(null);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/databaseproject/images/carInfo.jpg"))); // NOI18N
        jPanel6.add(jLabel9);
        jLabel9.setBounds(0, 0, 400, 340);

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 400, 340));

        jPanel4.setBackground(new java.awt.Color(51, 0, 51));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Car");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(154, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 70));

        CarPanel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 400, 520));

        bgCar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/databaseproject/images/bg1.jpg"))); // NOI18N
        bgCar.setMaximumSize(new java.awt.Dimension(1150, 680));
        bgCar.setMinimumSize(new java.awt.Dimension(1150, 680));
        CarPanel.add(bgCar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 680));

        getContentPane().add(CarPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, -1, -1));

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

    private void searchFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyReleased
        // TODO add your handling code here:
        /*String search=searchField.getText().trim();
        if(!search.equals("")){
            System.out.println("search");
        }
        searchMenu.setVisible(true);
        searchMenu.show(searchField,0,searchField.getHeight());*/
    }//GEN-LAST:event_searchFieldKeyReleased

    private void searchButtonKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchButtonKeyReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_searchButtonKeyReleased

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_searchFieldActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        search=searchField.getText();

        if(search.equals(""))
        {
            JOptionPane.showMessageDialog(this, "This car is not available.");    
        }
        else
        { 
        try {
            statement = cnObj.connection.createStatement(); 
            ResultSet resultSet= statement.executeQuery("SELECT CAR.VehicleId, BrandName, ModelName, RegistrationNo, Color, CarCC, FuelType, CostPerHour FROM CAR JOIN VEHICLE ON CAR.VehicleId = VEHICLE.VehicleId AND ModelName ='"+search+"'");
            
             if (resultSet.next()) {
                VehicleNoField.setText(resultSet.getString("VehicleId"));
                CarBrandField.setText(resultSet.getString("BrandName"));
                CarModelField.setText(resultSet.getString("ModelName"));
                CarRegField.setText(resultSet.getString("RegistrationNo"));
                CarColorField.setText(resultSet.getString("Color"));
                CarCCField.setText(resultSet.getString("CarCC"));
                CarFuelField.setText(resultSet.getString("FuelType"));
                CarCostHr.setText(resultSet.getString("CostPerHour"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(CarPage.class.getName()).log(Level.SEVERE, null, ex);
        }   
        }  
    }//GEN-LAST:event_searchButtonActionPerformed

    private void CarFuelFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CarFuelFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CarFuelFieldActionPerformed

    private void BookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookButtonActionPerformed
        // TODO add your handling code here:
        //new ConfirmationPage().setVisible(true);
        this.dispose();
        ConfirmationPage cfp= new ConfirmationPage();
        //ArrayList<String> reservationForm = new ArrayList<String>();
        cfp.setVisible(true);       
        reservationForm.add(VehicleNoField.getText());
        reservationForm.add(CarBrandField.getText());
        reservationForm.add(CarModelField.getText());
        reservationForm.add(CarCostHr.getText()); 
        cfp.setReservation(reservationForm); 
    }//GEN-LAST:event_BookButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
        new VehiclePage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

    private void VehicleNoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VehicleNoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VehicleNoFieldActionPerformed

    private void CarBrandFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CarBrandFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CarBrandFieldActionPerformed

    private void CarModelFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CarModelFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CarModelFieldActionPerformed

    private void CarRegFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CarRegFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CarRegFieldActionPerformed

    private void CarColorFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CarColorFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CarColorFieldActionPerformed

    private void CarCCFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CarCCFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CarCCFieldActionPerformed

    private void CarCostHrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CarCostHrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CarCostHrActionPerformed

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
            java.util.logging.Logger.getLogger(CarPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CarPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CarPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CarPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CarPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton BookButton;
    private javax.swing.JTextField CarBrandField;
    private javax.swing.JTextField CarCCField;
    private javax.swing.JTextField CarColorField;
    private javax.swing.JTextField CarCostHr;
    private javax.swing.JTextField CarFuelField;
    private javax.swing.JTextField CarModelField;
    private javax.swing.JPanel CarPanel;
    private javax.swing.JTextField CarRegField;
    private javax.swing.JPanel NavPanel;
    private javax.swing.JTextField VehicleNoField;
    private javax.swing.JLabel bgCar;
    private javax.swing.JLabel copyrightLabel;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton navAboutUs;
    private javax.swing.JButton navFeedback;
    private javax.swing.JButton navHome;
    private javax.swing.JButton navReservation;
    private javax.swing.JButton navSignUp;
    private javax.swing.JButton navUserProfile;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchField;
    private javax.swing.JList<String> searchList;
    private javax.swing.JPopupMenu searchMenu;
    private javax.swing.JPanel searchPanel;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}