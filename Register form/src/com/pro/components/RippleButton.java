package com.pro.components;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;

public class RippleButton extends JButton{
    
    private volatile int rippleX;
    private volatile int rippleY;
    private volatile int rippleRadius;
    private Thread rippleThread;

    public RippleButton() {
        setOpaque(false);
        setFocusPainted(false);
        setContentAreaFilled(false);
        addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent e) {
                
                rippleThread = new Thread(){
                    @Override
                    public void run() {
                        rippleX = e.getX();
                        rippleY = e.getY();
                        rippleRadius = 0;
                        while(rippleRadius< getWidth()){
                            rippleRadius+= 4;
                            try {
                                Thread.sleep(5);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(RippleButton.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            repaint();
                        }
                    }
                  
                };
                rippleThread.start();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                
                repaint();
                rippleRadius = 0;
            }
            
            
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        if(rippleRadius < getWidth()){
            g2.setColor(new Color(255,255,255,100));
            g2.fillOval(rippleX - rippleRadius, rippleY - rippleRadius, rippleRadius*2, rippleRadius*2);
        }
        super.paintComponent(g); 
    }
    

}
