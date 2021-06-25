import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.Toolkit;
import java.awt.geom.AffineTransform;
import java.awt.geom.Path2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class HelloStar {
    public HelloStar() {
        JFrame jf = new JFrame("HelloSwing");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel jp = new MyJPanel();
        jf.add(jp);
        jf.pack();
        jf.setResizable(false);
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);
    }
    public static void main(String[] args) {
        EventQueue.invokeLater(HelloStar::new);
    }
    class MyJPanel extends JPanel {
        private static final long serialVersionUID = 1L;
        private double rotation = 0.0;
        public MyJPanel() {
            super();
            setPreferredSize(new Dimension(800, 600));
            setBackground(new Color(200, 200, 255));
            new javax.swing.Timer(
                    1000 / 25,
                    e -> {
                        rotation += 3.0;
                        repaint();
                    }
            ).start();
        }
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g.create();
            AffineTransform gat = new AffineTransform();
            gat.scale(1.0, -1.0);
            gat.translate(getWidth() / 2.0, -getHeight() / 2.0);
            g2d.transform(gat);
            Path2D p2d = new Path2D.Double();
            int size = 250;
            double dX = 0.0;
            double dY = Math.sin((72 * Math.PI)/180)*size;
            double x = 0.0;
            double y = dY / 2;
            p2d.moveTo(x, y);
            dX = Math.cos((72 * Math.PI)/180)*size;
            p2d.lineTo(x + dX, y - dY);
            x = x + dX;
            y = y - dY;
            dX = Math.cos((36 * Math.PI)/180)*-size;
            dY = Math.sin((36 * Math.PI)/180)*size;
            p2d.lineTo(x + dX, y + dY);
            x = x + dX;
            y = y + dY;
            dX = size;
            p2d.lineTo(x + dX, y);
            x = x + dX;
            dX = Math.cos((36 * Math.PI)/180)*-size;
            dY = Math.sin((36 * Math.PI)/180)*-size;
            p2d.lineTo(x + dX, y + dY);
            x = x + dX;
            y = y + dY;
            p2d.closePath();
            AffineTransform at = new AffineTransform();
            at.rotate(Math.toRadians(rotation));
            Shape s = at.createTransformedShape(p2d);
            g2d.setPaint(Color.WHITE);
            g2d.fill(s);
            g2d.setStroke(new BasicStroke(3.0f));
            g2d.setPaint(Color.BLACK);
            g2d.draw(s);
            g2d.dispose();
            Toolkit.getDefaultToolkit().sync();
        }
    }
}