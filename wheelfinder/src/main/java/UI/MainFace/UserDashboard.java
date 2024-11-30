/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main.java.UI.MainFace;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

/**
 *
 * @author admin
 */
public class UserDashboard extends javax.swing.JFrame {

    /**
     * Creates new form AdminDashboard
     */
    public UserDashboard() {
        initComponents();
    }
    
    class jPanelGradient extends JPanel {
        protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        Color color1 = new Color(100,57,255);
        Color color2 = new Color(124,245,255);
        int width = getWidth();
        int height = getHeight();
        GradientPaint gradientPaint = new GradientPaint(0, 0, color1, 0 , height, color2);
        g2d.setPaint(gradientPaint);
        g2d.fillRect(0, 0, width, height);
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

        bigContainer = new jPanelGradient();
        sideBar = new javax.swing.JPanel();
        sideBarLogo = new javax.swing.JLabel();
        menuSideBarPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        carLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        logoutLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        card = new javax.swing.JPanel();
        CarUserPanel = new jPanelGradient();
        mainContentPanel = new jPanelGradient();
        jScrollPane1 = new javax.swing.JScrollPane();
        viewCarTable = new javax.swing.JTable();
        deleteCarButton = new javax.swing.JButton();
        MyBuyUserPanel = new jPanelGradient();
        mainContentPanel1 = new jPanelGradient();
        jScrollPane3 = new javax.swing.JScrollPane();
        BuyUserTable = new javax.swing.JTable();
        PassUserPanel = new jPanelGradient();
        jPanel8 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        oldPassChangeTextField = new javax.swing.JTextField();
        newPassChangeTextField = new javax.swing.JPasswordField();
        changPassButton = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        retypeNewPassChangeTextField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Wheel Finder User");
        setResizable(false);

        sideBar.setBackground(new java.awt.Color(54, 171, 239));
        sideBar.setAlignmentX(0.0F);
        sideBar.setAlignmentY(0.0F);

        sideBarLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/java/UI/logo/logoandtext100.png"))); // NOI18N

        menuSideBarPanel.setBackground(new java.awt.Color(54, 171, 239));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/java/UI/logo/2logo40.png"))); // NOI18N

        carLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        carLabel.setForeground(new java.awt.Color(255, 255, 255));
        carLabel.setText("Car");
        carLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                carLabelMouseClicked(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/java/UI/logo/userLogo30.png"))); // NOI18N

        userLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        userLabel.setForeground(new java.awt.Color(255, 255, 255));
        userLabel.setText("My Buy");
        userLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userLabelMouseClicked(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/java/UI/logo/changepassLogo30.png"))); // NOI18N

        passwordLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(255, 255, 255));
        passwordLabel.setText("Password");
        passwordLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordLabelMouseClicked(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/java/UI/logo/logoutLogo35.png"))); // NOI18N

        logoutLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        logoutLabel.setForeground(new java.awt.Color(255, 255, 255));
        logoutLabel.setText("Log Out");

        javax.swing.GroupLayout menuSideBarPanelLayout = new javax.swing.GroupLayout(menuSideBarPanel);
        menuSideBarPanel.setLayout(menuSideBarPanelLayout);
        menuSideBarPanelLayout.setHorizontalGroup(
            menuSideBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuSideBarPanelLayout.createSequentialGroup()
                .addGap(0, 14, Short.MAX_VALUE)
                .addGroup(menuSideBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuSideBarPanelLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(carLabel))
                    .addGroup(menuSideBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(menuSideBarPanelLayout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(userLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuSideBarPanelLayout.createSequentialGroup()
                            .addGroup(menuSideBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(18, 18, 18)
                            .addGroup(menuSideBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(logoutLabel)
                                .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menuSideBarPanelLayout.setVerticalGroup(
            menuSideBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuSideBarPanelLayout.createSequentialGroup()
                .addGroup(menuSideBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuSideBarPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(carLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(menuSideBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(menuSideBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuSideBarPanelLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(menuSideBarPanelLayout.createSequentialGroup()
                        .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logoutLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("nocopyright @ CLC04");

        javax.swing.GroupLayout sideBarLayout = new javax.swing.GroupLayout(sideBar);
        sideBar.setLayout(sideBarLayout);
        sideBarLayout.setHorizontalGroup(
            sideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuSideBarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(sideBarLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(sideBarLogo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(sideBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        sideBarLayout.setVerticalGroup(
            sideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sideBarLogo)
                .addGap(18, 18, 18)
                .addComponent(menuSideBarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        card.setBackground(new java.awt.Color(255, 255, 255));
        card.setLayout(new java.awt.CardLayout());

        CarUserPanel.setBackground(new java.awt.Color(255, 255, 255));

        mainContentPanel.setBackground(new java.awt.Color(255, 255, 255));

        viewCarTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Brand", "Model", "Colour", "Year of manufacture", "Price", "Current Number"
            }
        ));
        jScrollPane1.setViewportView(viewCarTable);
        if (viewCarTable.getColumnModel().getColumnCount() > 0) {
            viewCarTable.getColumnModel().getColumn(6).setResizable(false);
        }

        javax.swing.GroupLayout mainContentPanelLayout = new javax.swing.GroupLayout(mainContentPanel);
        mainContentPanel.setLayout(mainContentPanelLayout);
        mainContentPanelLayout.setHorizontalGroup(
            mainContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainContentPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 965, Short.MAX_VALUE)
                .addContainerGap())
        );
        mainContentPanelLayout.setVerticalGroup(
            mainContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 646, Short.MAX_VALUE)
        );

        deleteCarButton.setBackground(new java.awt.Color(54, 171, 239));
        deleteCarButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        deleteCarButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteCarButton.setText("Buy Car");
        deleteCarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteCarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CarUserPanelLayout = new javax.swing.GroupLayout(CarUserPanel);
        CarUserPanel.setLayout(CarUserPanelLayout);
        CarUserPanelLayout.setHorizontalGroup(
            CarUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainContentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(CarUserPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(deleteCarButton)
                .addGap(62, 62, 62))
        );
        CarUserPanelLayout.setVerticalGroup(
            CarUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CarUserPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(deleteCarButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mainContentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        card.add(CarUserPanel, "CarAdmin");

        MyBuyUserPanel.setBackground(new java.awt.Color(255, 255, 255));

        mainContentPanel1.setBackground(new java.awt.Color(255, 255, 255));

        BuyUserTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Car", "Time", "Total Fee"
            }
        ));
        jScrollPane3.setViewportView(BuyUserTable);

        javax.swing.GroupLayout mainContentPanel1Layout = new javax.swing.GroupLayout(mainContentPanel1);
        mainContentPanel1.setLayout(mainContentPanel1Layout);
        mainContentPanel1Layout.setHorizontalGroup(
            mainContentPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainContentPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 965, Short.MAX_VALUE)
                .addContainerGap())
        );
        mainContentPanel1Layout.setVerticalGroup(
            mainContentPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainContentPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout MyBuyUserPanelLayout = new javax.swing.GroupLayout(MyBuyUserPanel);
        MyBuyUserPanel.setLayout(MyBuyUserPanelLayout);
        MyBuyUserPanelLayout.setHorizontalGroup(
            MyBuyUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainContentPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        MyBuyUserPanelLayout.setVerticalGroup(
            MyBuyUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainContentPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        card.add(MyBuyUserPanel, "UserAdmin");

        PassUserPanel.setBackground(new java.awt.Color(255, 255, 255));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(54, 171, 239));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("CHANGE PASSWORD");

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel27.setText("Old Password");

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel28.setText("New Password");

        oldPassChangeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oldPassChangeTextFieldActionPerformed(evt);
            }
        });

        changPassButton.setBackground(new java.awt.Color(54, 171, 239));
        changPassButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        changPassButton.setForeground(new java.awt.Color(255, 255, 255));
        changPassButton.setText("Change Password");

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel30.setText("Retype New Password");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(jLabel26))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(333, 333, 333)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel30)
                            .addComponent(jLabel27)
                            .addComponent(oldPassChangeTextField)
                            .addComponent(jLabel28)
                            .addComponent(newPassChangeTextField)
                            .addComponent(retypeNewPassChangeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(403, 403, 403)
                        .addComponent(changPassButton)))
                .addContainerGap(233, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel26)
                .addGap(86, 86, 86)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(oldPassChangeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(newPassChangeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(retypeNewPassChangeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(changPassButton)
                .addContainerGap(240, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PassUserPanelLayout = new javax.swing.GroupLayout(PassUserPanel);
        PassUserPanel.setLayout(PassUserPanelLayout);
        PassUserPanelLayout.setHorizontalGroup(
            PassUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PassUserPanelLayout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        PassUserPanelLayout.setVerticalGroup(
            PassUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PassUserPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        card.add(PassUserPanel, "PassAdmin");

        javax.swing.GroupLayout bigContainerLayout = new javax.swing.GroupLayout(bigContainer);
        bigContainer.setLayout(bigContainerLayout);
        bigContainerLayout.setHorizontalGroup(
            bigContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bigContainerLayout.createSequentialGroup()
                .addComponent(sideBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(card, javax.swing.GroupLayout.PREFERRED_SIZE, 971, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        bigContainerLayout.setVerticalGroup(
            bigContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sideBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(card, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bigContainer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bigContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1134, 707));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void carLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carLabelMouseClicked
        // TODO add your handling code here:
        CarUserPanel.setVisible(true);
        MyBuyUserPanel.setVisible(false);
        PassUserPanel.setVisible(false);
        
    }//GEN-LAST:event_carLabelMouseClicked

    private void oldPassChangeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oldPassChangeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_oldPassChangeTextFieldActionPerformed

    private void userLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userLabelMouseClicked
        // TODO add your handling code here:
        CarUserPanel.setVisible(false);
        MyBuyUserPanel.setVisible(true);
        PassUserPanel.setVisible(false);
    }//GEN-LAST:event_userLabelMouseClicked

    private void passwordLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordLabelMouseClicked
        // TODO add your handling code here:
        CarUserPanel.setVisible(false);
        MyBuyUserPanel.setVisible(false);
        PassUserPanel.setVisible(true);
    }//GEN-LAST:event_passwordLabelMouseClicked

    private void deleteCarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteCarButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteCarButtonActionPerformed

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
            java.util.logging.Logger.getLogger(UserDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable BuyUserTable;
    private javax.swing.JPanel CarUserPanel;
    private javax.swing.JPanel MyBuyUserPanel;
    private javax.swing.JPanel PassUserPanel;
    private javax.swing.JPanel bigContainer;
    private javax.swing.JLabel carLabel;
    private javax.swing.JPanel card;
    private javax.swing.JButton changPassButton;
    private javax.swing.JButton deleteCarButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel logoutLabel;
    private javax.swing.JPanel mainContentPanel;
    private javax.swing.JPanel mainContentPanel1;
    private javax.swing.JPanel menuSideBarPanel;
    private javax.swing.JPasswordField newPassChangeTextField;
    private javax.swing.JTextField oldPassChangeTextField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPasswordField retypeNewPassChangeTextField;
    private javax.swing.JPanel sideBar;
    private javax.swing.JLabel sideBarLogo;
    private javax.swing.JLabel userLabel;
    private javax.swing.JTable viewCarTable;
    // End of variables declaration//GEN-END:variables
}
