/*
 MY DRAW 192
 */
package ayat;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public  class MyDraw {
    
    private final JFrame form; 
    private final int wForm;
    private final int hForm;
    public int border= 1;
    public Color color = Color.BLACK;

    public MyDraw(JFrame form) {
        this.form = form;
        wForm = form.getWidth();
        hForm = form.getHeight();
    }

   
    public void drawLine(int x1 ,int y1 ,int x2,int y2){
        JPanel pnl = new JPanel(){  // an annonymous class for overriding
        
            @Override
             public void paintComponent(Graphics g){
                Graphics2D g2= (Graphics2D) g;
                g2.setStroke(new BasicStroke(border));
                g2.setColor(color);
                g2.drawLine(x1 , y1 , x2, y2);
                
    }
    };
        form.add(pnl);
        pnl.setBounds(0, 0, wForm, hForm);
    
}
    
    public void drawRec(int x ,int y ,int width,int height){
         JPanel pnl = new JPanel(){
             @Override
             public void paintComponent(Graphics g){
                 Graphics2D g2 = (Graphics2D) g;
                 g2.setStroke(new BasicStroke(border));
                 g2.setColor(color);
                 g2.drawRect(x, y, width, height);
             
             }
         
         };   
            form.add(pnl);
            pnl.setBounds(0, 0, wForm, hForm);
    
    
    }
    
    public void drawOval(int x ,int y ,int width,int height){
         JPanel pnl = new JPanel(){
             @Override
             public void paintComponent(Graphics g){
                 Graphics2D g2 = (Graphics2D) g;
                 g2.setStroke(new BasicStroke(border));
                 g2.setColor(color);
                 g2.drawOval(x, y, width, height);
             
             }
         
         };   
            form.add(pnl);
            pnl.setBounds(0, 0, wForm, hForm);
    
    
    }
    
    public void polygon(int[] xPoints, int[] yPoints,int nPoints){
         JPanel pnl = new JPanel(){
             @Override
             public void paintComponent(Graphics g){
                 Graphics2D g2 = (Graphics2D) g;
                 g2.setStroke(new BasicStroke(border));
                 g2.setColor(color);
                 g2.drawPolygon(xPoints, yPoints, nPoints);
             
             }
         
         };   
            form.add(pnl);
            pnl.setBounds(0, 0, wForm, hForm);
    
    
    }

    public void drawPolyLine(int[] xPoints, int[] yPoints, int nPoints) {
        JPanel pnl = new JPanel() {  // JPanel is a parent class

            @Override   // here is an anonymous child class
            public void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g;
                g2.setColor(color);
                g2.setStroke(new BasicStroke(border));
                g2.drawPolyline(xPoints, yPoints, nPoints);

            }
        };
        form.add(pnl);
        pnl.setBounds(0, 0, wForm, hForm);

    }

    public void drawString(int x, int y, String text, String fontName, int fontSize, Color color) {
        //fontStyle is an int.
        JPanel pnl = new JPanel() { // just Panel not working
            @Override
            public void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g;
                g2.setColor(color);
                Font font = Font.getFont("Tahoma");//this line not in lesson
                font = new Font(fontName, font.BOLD, fontSize);
                g2.setFont(font);
                g2.drawString(text, x, y); //must be like parameters above
            }

        };
        form.add(pnl);
        pnl.setBounds(0, 0, wForm, hForm);// Rectangel r not working
    }

    public void drawImage(int x, int y, String path) {
        JPanel pnl = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g;
                File imgFile = new File(path);
                Image img;
                try {
                    img = ImageIO.read(imgFile);
                    g2.drawImage(img, x, y, form);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }

            }

        };
        form.add(pnl);
        pnl.setBounds(x, y, wForm, hForm);
    }

    public void drawRoundRect(int x, int y, int width, int height, int borderRadius) {
        // Round rect or squar drawing
        JPanel pnl = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g;
                g2.setColor(color);
                g2.setStroke(new BasicStroke(border));
                g2.drawRoundRect(x, y, width, height, borderRadius, borderRadius);

            }

        };
        form.add(pnl);
        pnl.setBounds(x, y, wForm, hForm);
    }
}