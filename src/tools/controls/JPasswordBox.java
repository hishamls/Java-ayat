/*
  MY PASSWORD BOX
 */
package tools.controls;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPasswordField;


public class JPasswordBox extends JPasswordField {

    public JPasswordBox(int size) {
        super(size); // super X this
        setOpaque(false);   // transperncyشفاف

    }

    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(getBackground());
        g.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 20, 20);
        super.paintComponent(g); // not understand
    }

    @Override
    protected void paintBorder(Graphics g) {
        g.setColor(Color.BLUE);
        g.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 20, 20);

    }
}
