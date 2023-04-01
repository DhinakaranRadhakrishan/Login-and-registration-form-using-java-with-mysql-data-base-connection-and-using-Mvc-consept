package com.pro.login;

import com.pro.components.RippleButton;
import com.pro.components.Search_Textfield;
import com.pro.controller.LoginController;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Dine
 */
public class Login extends javax.swing.JPanel {

    private JFrame frame;
    private LoginController controller;

    public Login() {
        initComponents();
        setOpaque(false);
        closewindow();
        checkUser();
        controller = new LoginController();
    }

    public void checkUser() {
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (!userName.getText().equals("")) {
                    if (!password.getText().equals("")) {
                        boolean confirmUser = controller.checkUserProfile(userName.getText(), password.getText());
                        System.out.println(confirmUser);
                        resetInputValues();
                    }
                }
            }
        });
    }

    public void resetInputValues() {
        userName.setText("");
        password.setText("");
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        Shape radius = new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 10, 10);
        g2.fill(radius);
        super.paintComponent(g);
    }

    public void closewindow() {
        closeButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                closeLoginForm(frame);
            }

        });
    }

    public void closeLoginForm(JFrame frame) {
        frame.dispose();
    }

    public void connectMainframe(JFrame frame) {
        this.frame = frame;
    }

    public JLabel getCreateAccound() {
        return createAccound;
    }

    public void setCreateAccound(JLabel createAccound) {
        this.createAccound = createAccound;
    }

    public RippleButton getLoginButton() {
        return loginButton;
    }

    public void setLoginButton(RippleButton loginButton) {
        this.loginButton = loginButton;
    }

    public Search_Textfield getPassword() {
        return password;
    }

    public void setPassword(Search_Textfield password) {
        this.password = password;
    }

    public Search_Textfield getUserName() {
        return userName;
    }

    public void setUserName(Search_Textfield userName) {
        this.userName = userName;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        userName = new com.pro.components.Search_Textfield();
        jLabel2 = new javax.swing.JLabel();
        password = new com.pro.components.Search_Textfield();
        jLabel3 = new javax.swing.JLabel();
        loginButton = new com.pro.components.RippleButton();
        createAccound = new javax.swing.JLabel();
        closeButton = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 255, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Login");

        userName.setBackground(new java.awt.Color(249, 249, 249));
        userName.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        userName.setForeground(new java.awt.Color(172, 172, 172));
        userName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        userName.setHint("user name or gmail");

        jLabel2.setForeground(new java.awt.Color(135, 135, 135));
        jLabel2.setText("User Name or Gmail");

        password.setBackground(new java.awt.Color(249, 249, 249));
        password.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        password.setForeground(new java.awt.Color(172, 172, 172));
        password.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        password.setHint("password");

        jLabel3.setForeground(new java.awt.Color(135, 135, 135));
        jLabel3.setText("Password");

        loginButton.setBackground(new java.awt.Color(102, 255, 102));
        loginButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("Login");
        loginButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        createAccound.setForeground(new java.awt.Color(153, 153, 255));
        createAccound.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        createAccound.setText("Create Accound");
        createAccound.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        closeButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        closeButton.setForeground(new java.awt.Color(255, 153, 153));
        closeButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closeButton.setText("X");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(createAccound, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(loginButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(userName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(password, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(0, 0, Short.MAX_VALUE))))
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(createAccound)
                .addContainerGap(107, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel closeButton;
    private javax.swing.JLabel createAccound;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private com.pro.components.RippleButton loginButton;
    private com.pro.components.Search_Textfield password;
    private com.pro.components.Search_Textfield userName;
    // End of variables declaration//GEN-END:variables
}
