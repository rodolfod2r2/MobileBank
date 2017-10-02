/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unipe.mobilebank.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author rodolfo
 */
public class SplashScreen {
    
    private static final int DURATION = 5000;
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
           SplashScreen imagemSplash = new SplashScreen();
        });
    }
    
     public SplashScreen() {
        JFrame tela = new JFrame();
        tela.getContentPane().add(new ImagePanel());
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setUndecorated(true);
        tela.pack();
        tela.setLocationRelativeTo(null);
        tela.setBackground(new Color(0, 0, 0, 0));
        tela.setVisible(true);
        try { 
            Thread.sleep(DURATION);
            tela.setVisible(false);
            FormAcesso acesso = new FormAcesso();
            acesso.setVisible(true);
        } catch (InterruptedException e) {
            e.getMessage();
        }
        
     }

    @SuppressWarnings("serial")
    public class ImagePanel extends JPanel {

        BufferedImage img = null;

        @SuppressWarnings("OverridableMethodCallInConstructor")
        public ImagePanel() {
            setOpaque(false);
            setLayout(new GridBagLayout());
            try {
                img = ImageIO.read(new File("C:\\ambienteJava\\MobileBank\\src\\br\\unipe\\mobilebank\\logo.png"));
            } catch (IOException ex) {
                Logger.getLogger(SplashScreen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
        }

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(681, 667);
        }
    }
    
}
