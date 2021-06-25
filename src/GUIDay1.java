import javax.swing.*;
import java.awt.*;

public class GUIDay1 extends JPanel {
    GUIDay1(){
        setBorder(BorderFactory.createLineBorder(Color.RED));
    }
    public Dimension getPreferredSize(){
        return new Dimension(250, 200);
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
//        // Table
//        for(int i = 0; i <= 1000; i += 100){
//            g.drawLine(10+i, 10, 10+i, 1010);
//            g.drawLine(10, 10+i, 1010, 10+i);
//        }
//        // Challenge: Make a sudoku grid

//        // Smiley Face
//        g.setColor(Color.ORANGE);
//        g.fillOval(100, 100, 500, 500);
//        g.setColor(Color.BLACK);
//        g.fillOval(250, 200, 50, 50);
//        g.fillOval(400, 200, 50, 50);
//        g.drawArc(200, 250, 300, 300, -180, 180);
//        // Challenge: Make a dog

//        //Show polygon
//        g.drawPolygon(new int[]{100, 250, 300, 150}, new int[]{120, 150, 280, 400}, 4);
//        // Challenge: Add a nose to the face

//        //Introducing Graphics2D with strokes
//        Graphics2D g2 = (Graphics2D) g;
//        //https://docs.oracle.com/javase/tutorial/2d/geometry/strokeandfill.html
//        g2.setStroke(new BasicStroke(3.0f,
//                BasicStroke.CAP_ROUND,
//                BasicStroke.JOIN_ROUND));
//        g.drawPolygon(new int[]{100, 250, 300, 150}, new int[]{120, 150, 280, 400}, 4);
//        // Challenge: Add a mustache to the face

        //HW: Work on drawFace()
    }
    private static void drawFace(Graphics g, Color color, int size, int centerX, int centerY){
        g.setColor(color);
        g.fillOval(100, 100, size, size);
        g.setColor(Color.BLACK);
        g.fillOval(250, 200, 50, 50);
        g.fillOval(400, 200, 50, 50);
        g.drawArc(200, 250, 300, 300, -180, 180);

//        g.setColor(Color.ORANGE);
//        g.fillOval(100, 100, 500, 500);
//        g.setColor(Color.BLACK);
//        g.fillOval(250, 200, 50, 50);
//        g.fillOval(400, 200, 50, 50);
//        g.drawArc(200, 250, 300, 300, -180, 180);
    }
    private static void DoIt(){
        JFrame f = new JFrame("Drawing Demo");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new GUIDay1());
        f.pack();
        f.setVisible(true);
    }
    public static void main(String[] args){
        DoIt();
    }
}