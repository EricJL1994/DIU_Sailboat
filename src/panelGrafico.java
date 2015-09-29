
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class panelGrafico extends JPanel {

    public Double anguloVela = 0.0, anguloTimon = 0.0;
    public boolean focusVela = false, focusTimon = false;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int width = this.getBounds().width;
        int height = this.getBounds().height;

        Graphics2D g2 = (Graphics2D) g;

        g2.setStroke(new BasicStroke(3.0f));
        g2.drawOval(width / 3, height / 5, width / 3, height / 2);

        int x1 = width / 2;
        int y1 = height * 3 / 10;
        int x2 = x1 + (int) (height / 5 * Math.sin(anguloVela));
        int y2 = y1 + (int) (height / 5 * Math.cos(anguloVela));
        if (focusVela) {
            g2.setColor(Color.RED);
            g2.drawLine(x1, y1, x2, y2);
            g2.setColor(Color.BLACK);
        } else {
            g2.drawLine(x1, y1, x2, y2);
        }

        y1 = height * 7 / 10;
        x2 = x1 + (int) (height / 10 * Math.sin(anguloTimon));
        y2 = y1 + (int) (height / 10 * Math.cos(anguloTimon));
        if (focusTimon) {
            g2.setColor(Color.RED);
            g2.drawLine(x1, y1, x2, y2);
            g2.setColor(Color.BLACK);
        } else {
            g2.drawLine(x1, y1, x2, y2);
        }
    }

}
