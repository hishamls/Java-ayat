/*
  MY BUTTON
 */
package tools.controls;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import javax.swing.JButton;


public class JMyButton extends JButton {

    public JMyButton() {
                setOpaque(false);   // transperncyشفاف
                setContentAreaFilled(false);
                setForeground(Color.white);
                setCursor(new Cursor(Cursor.HAND_CURSOR));
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(new Color(70,130,180));
        g.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 20, 20);
        super.paintComponent(g); // not understand
    }

    @Override
    protected void paintBorder(Graphics g) {
        g.setColor(Color.blue);
        g.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 20, 20);

    }
}
