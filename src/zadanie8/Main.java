package zadanie8;
import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] Args) {
        JFrame frame = new JFrame("Паладка");
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(new DrawПаладка());
    }

    public static class DrawПаладка extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            g2d.setColor(Color.black);
            g2d.fillOval(30, 50, 50, 120);
            g2d.fillOval(350, 50, 100, 120);
            g2d.drawRect(390, 150, 10, 100);
            g2d.fillRect(390,150,10,100);
            g2d.drawRect(50, 150, 10, 100);
            g2d.fillRect(50,150,10,100);
            int[] xPoints = {150, 100, 200};
            int[] yPoints = {50, 150, 150};
            g.fillPolygon(xPoints, yPoints, 3);

            g.fillRect(100, 150, 100, 50);

            g.setColor(Color.black);
            g.fillPolygon(xPoints, yPoints, 3);
        }


    }
}
