package com.pro.register;

import com.pro.components.RippleButton;
import com.pro.components.Search_Textfield;
import com.pro.controller.RegisterFormContoller;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JLabel;

public class Register extends javax.swing.JPanel {

    private RegisterFormContoller regController;
    
    public Register() {
        initComponents();
        setOpaque(false);
        password.setHint("password");
        rePassword.setHint("Re-enter Password");
        txtGmail.setHint("enter gmail");
        userName.setHint("userName");
        clickRegisterButton();
        regController = new RegisterFormContoller();
    }
    public void clickRegisterButton(){
        this.registerButton.addActionListener((ActionEvent e) -> {
            if(password.getText().trim().equals(rePassword.getText().trim())){
                if(!userName.getText().trim().equals("")){
                    if(!txtGmail.getText().trim().equals("")){
                        regController.insertUserDetails(userName.getText(), txtGmail.getText(), password.getText());
                        resetTextfields();
                    }
                    return;
                }
                return;
            }
        });
    }
    
    private void resetTextfields(){
        userName.setText("");
        txtGmail.setText("");
        password.setText("");
        rePassword.setText("");
    }


    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        Shape radius = new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 10, 10);
        g2.fill(radius);
        super.paintComponent(g);
    }


    public RippleButton getRegisterButton() {
        return registerButton;
    }

    public void setRegisterButton(RippleButton registerButton) {
        this.registerButton = registerButton;
    }
    
    

    public JLabel getBack() {
        return back;
    }

    public void setBack(JLabel back) {
        this.back = back;
    }

    public Search_Textfield getPassword() {
        return password;
    }

    public void setPassword(Search_Textfield password) {
        this.password = password;
    }

    public Search_Textfield getRePassword() {
        return rePassword;
    }

    public void setRePassword(Search_Textfield rePassword) {
        this.rePassword = rePassword;
    }

    public RippleButton getRippleButton2() {
        return registerButton;
    }

    public void setRippleButton2(RippleButton rippleButton2) {
        this.registerButton = rippleButton2;
    }

    public Search_Textfield getTxtGmail() {
        return txtGmail;
    }

    public void setTxtGmail(Search_Textfield txtGmail) {
        this.txtGmail = txtGmail;
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
        txtGmail = new com.pro.components.Search_Textfield();
        userName = new com.pro.components.Search_Textfield();
        rePassword = new com.pro.components.Search_Textfield();
        password = new com.pro.components.Search_Textfield();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        registerButton = new com.pro.components.RippleButton();
        back = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Register");

        txtGmail.setBackground(new java.awt.Color(249, 249, 249));
        txtGmail.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        txtGmail.setForeground(new java.awt.Color(172, 172, 172));
        txtGmail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        userName.setBackground(new java.awt.Color(249, 249, 249));
        userName.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        userName.setForeground(new java.awt.Color(172, 172, 172));
        userName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        rePassword.setBackground(new java.awt.Color(249, 249, 249));
        rePassword.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        rePassword.setForeground(new java.awt.Color(172, 172, 172));
        rePassword.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rePasswordActionPerformed(evt);
            }
        });

        password.setBackground(new java.awt.Color(249, 249, 249));
        password.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        password.setForeground(new java.awt.Color(172, 172, 172));
        password.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(135, 135, 135));
        jLabel2.setText("User name");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(135, 135, 135));
        jLabel3.setText("Gmail");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(135, 135, 135));
        jLabel4.setText("Password");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(135, 135, 135));
        jLabel5.setText("Re-enter password");

        registerButton.setBackground(new java.awt.Color(153, 153, 255));
        registerButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        registerButton.setForeground(new java.awt.Color(255, 255, 255));
        registerButton.setText("Register");

        back.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        back.setForeground(new java.awt.Color(178, 178, 178));
        back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back.setText("<<");
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(back)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(rePassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                    .addComponent(password, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                    .addComponent(txtGmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(userName, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                    .addComponent(registerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(back))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtGmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rePassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void rePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rePasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rePasswordActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private com.pro.components.Search_Textfield password;
    private com.pro.components.Search_Textfield rePassword;
    private com.pro.components.RippleButton registerButton;
    private com.pro.components.Search_Textfield txtGmail;
    private com.pro.components.Search_Textfield userName;
    // End of variables declaration//GEN-END:variables
}
