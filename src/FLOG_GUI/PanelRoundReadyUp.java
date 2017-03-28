/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FLOG_GUI;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author DINUKA
 */
public class PanelRoundReadyUp extends javax.swing.JPanel {

    /**
     * Creates new form PanelRoundReadyUp
     */
    private Image bg;
    DataForUI DataForUI;
    public PanelRoundReadyUp() {
        initComponents();
        bg = new ImageIcon(getClass().getResource("/images/bg_roundReadyUp.png")).getImage();
        DataForUI= new DataForUI();
    }
    
    public void setTimer(String tmr)
     {
         this.lblReadyUpTimer.setFont(DataForUI.LCD.deriveFont(Font.PLAIN, 40));       
         this.lblReadyUpTimer.setText(tmr);
     
     }
    
    public void setRound(String round)
    {
        this.lblRound.setText(round);
    }
    
    
    @Override
    protected void paintComponent(Graphics g) {
         g.drawImage(bg, 0, 0, getWidth(), getHeight(), this);
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblReadyUpTimer = new javax.swing.JLabel();
        lblRound = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(900, 619));
        setMinimumSize(new java.awt.Dimension(900, 619));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblReadyUpTimer.setFont(new java.awt.Font("Times New Roman", 0, 40)); // NOI18N
        lblReadyUpTimer.setForeground(new java.awt.Color(255, 255, 255));
        lblReadyUpTimer.setText("  ");
        add(lblReadyUpTimer, new org.netbeans.lib.awtextra.AbsoluteConstraints(577, 140, -1, -1));

        lblRound.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        lblRound.setForeground(new java.awt.Color(255, 255, 255));
        lblRound.setText("1");
        add(lblRound, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 142, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblReadyUpTimer;
    private javax.swing.JLabel lblRound;
    // End of variables declaration//GEN-END:variables
}