
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.AffineTransform;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class AnimationLogo extends javax.swing.JPanel implements Runnable{
     Image img;
     
     private int c = 0;
    /**
     * Creates new form AnimationPanel
     */
    

    /**
     * Creates new form AnimationLogo
     */
    public AnimationLogo() {
        initComponents();
        
         img = new ImageIcon("Assets/logo.png").getImage();
        Thread t = new Thread(this);
        t.start();
    }
    
     protected void paintComponent(Graphics g){ 
        // ini artinya lakuin method paint Component
        // punta superclassnya
        super.paintComponent(g);
        //typecast g2d dari g
         Graphics2D g2d = (Graphics2D) g;
        // gambar image ke panelS
        
         AffineTransform at = new AffineTransform(
                AffineTransform.getTranslateInstance(500,30)
        );
        
        at.rotate(Math.toRadians(c++), img.getWidth(this)/2, img.getHeight(this)/2) ;
        
        g2d.drawImage(img, at, null);
        
     }
     
     @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(25);
            } catch (Exception e) {
                
            }
            
                repaint();
            
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

        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(147, 22, 33));
        setPreferredSize(new java.awt.Dimension(400, 180));
        setLayout(new java.awt.GridLayout(1, 0));

        jLabel1.setBackground(new java.awt.Color(147, 22, 33));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 205, 0));
        jLabel1.setText("Welcome to LongNugget");
        jLabel1.setPreferredSize(new java.awt.Dimension(1000, 1000));
        add(jLabel1);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
