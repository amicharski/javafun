import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.Toolkit;
import java.awt.geom.AffineTransform;
import java.awt.geom.GeneralPath;
import java.awt.geom.Path2D;
import java.awt.geom.CubicCurve2D;
import java.awt.geom.Arc2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class HelloHeart {
    public HelloHeart() {
        JFrame jf = new JFrame("HelloHeart");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel jp = new MyJPanel();
        jf.add(jp);
        jf.pack();
        jf.setResizable(false);
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);
    }
    public static void main(String[] args) {
        EventQueue.invokeLater(HelloHeart::new);
    }
    class MyJPanel extends JPanel {
        private static final long serialVersionUID = 1L;
        private int sizemultiplier = 1;
        private double size = 30.0;
        private int tm = 15;
        private int tick = 0;
        public MyJPanel() {
            super();
            setPreferredSize(new Dimension(800, 600));
            setBackground(new Color(200, 200, 255));
            new javax.swing.Timer(1000 / 15,
                    e -> {
                        tick += 1;
                        if (tick % 10 == 1 || tick % 10 == 2 || tick % 10 == 4 || tick % 10 == 5) {
                            sizemultiplier *= -1;
                            size = 1.5 + -10*sizemultiplier;

                        }else {
                            //sizemultiplier *= -1;
                            //size = 1.5 - -15*sizemultiplier;
                        }
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
            double x1 = 175.0;
            double y1 = 175.0;
            double x2 = 120.0;
            double y2 = 270.0;
            double x3 = 0.0;
            double y3 = 170.0;

            p2d.moveTo(0, 0-size);
            p2d.curveTo(x1+size, y1+size, x2+size, y2+size, x3, y3+size);
            p2d.curveTo(-x2-size, y2+size, -x1-size, y1+size, 0, 0-size);
            AffineTransform at = new AffineTransform();
            //at.rotate(Math.toRadians(rotation));
            Shape s = at.createTransformedShape(p2d);
            g2d.setPaint(Color.RED);
            g2d.fill(s);
            g2d.setStroke(new BasicStroke(3.0f));
            g2d.setPaint(Color.BLACK);
            g2d.draw(s);
            g2d.dispose();
            Toolkit.getDefaultToolkit().sync();
        }
    }
}
