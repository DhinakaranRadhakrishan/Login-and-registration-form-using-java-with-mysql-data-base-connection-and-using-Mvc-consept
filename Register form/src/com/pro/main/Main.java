package com.pro.main;

import com.pro.register.Register;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;

public class Main extends javax.swing.JFrame {

    private static Register registerForm;

    public Main() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        contentPanel.setBackground(new Color(0, 0, 0, 0));
        registerForm = new Register();
        createLoginEventLisner();
        createRegisterEventLisner();
        loginForm.connectMainframe(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentPanel = new javax.swing.JPanel();
        loginForm = new com.pro.login.Login();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        contentPanel.setLayout(new javax.swing.BoxLayout(contentPanel, javax.swing.BoxLayout.LINE_AXIS));

        loginForm.setBackground(new java.awt.Color(255, 255, 255));
        contentPanel.add(loginForm);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Main().setVisible(true);
        });
    }

    public void createLoginEventLisner() {
        loginForm.getCreateAccound().addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (SwingUtilities.isLeftMouseButton(e)) {
                    addNewPanel(registerForm);
                }
            }
        });
    }

    public void createRegisterEventLisner() {
        registerForm.getBack().addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (SwingUtilities.isLeftMouseButton(e)) {
                    addNewPanel(loginForm);
                }
            }
        });
    }

    public void addNewPanel(Component component) {
        contentPanel.removeAll();
        contentPanel.add(component);
        contentPanel.repaint();
        contentPanel.revalidate();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contentPanel;
    private com.pro.login.Login loginForm;
    // End of variables declaration//GEN-END:variables
}
