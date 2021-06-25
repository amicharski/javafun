package com.micharski.physics;

import javax.swing.*;
import java.awt.*;

public class Driver {
    public Driver(){
        JFrame jf = new JFrame("Physics");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel jp = new Driver.World();
        jf.add(jp);
        jf.pack();
        jf.setResizable(false);
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);
    }
    public static void main(String[] args){
        EventQueue.invokeLater(Driver::new);
    }
    class World extends JPanel{
        public static final double GRAVITY = 9.8;
        private static final long serialVersionUID = 1L;
        Object object = new Object(new Coordinate(100, 100, this.getPreferredSize()), new int[]{50, 50}, new int[]{0, 0}, new int[]{0, 0}, Color.RED);
        Ground ground = new Ground(new Coordinate(0, 100, this.getPreferredSize()), new int[]{500, 100}, Color.BLACK);
        public World() {
            super();
            setBackground(new Color(100, 100, 255));
            new javax.swing.Timer(1000 / 20,
                    e -> {
                        object.update();
                        repaint();
                    }
            ).start();
        }
        public Dimension getPreferredSize(){
            return new Dimension(1000, 700);
        }
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            object.draw(g);
            ground.draw(g);
            g.dispose();
            Toolkit.getDefaultToolkit().sync();
        }
    }
}
