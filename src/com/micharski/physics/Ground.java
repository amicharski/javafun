package com.micharski.physics;

import java.awt.*;

public class Ground {
    private Coordinate position;
    private Color color;
    private int[] size;

    public Ground(Coordinate position, int[] size, Color color){
        this.position = position;
        this.color = color;
        this.size = size;
    }

    public Coordinate getPosition() {
        return position;
    }

    public void setPosition(Coordinate position) {
        this.position = position;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void draw(Graphics g){
        g.setColor(color);
        g.fillRect(position.getX(), position.getY(), size[0], size[1]);
    }
}
