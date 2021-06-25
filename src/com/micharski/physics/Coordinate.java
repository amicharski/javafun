package com.micharski.physics;

import java.awt.*;

public class Coordinate {
    private int x;
    private int y;
    private Dimension dimension;

    public Coordinate(int x, int y, Dimension dimension){
        this.dimension = dimension;
        this.x = x;
        this.y = dimension.height - y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }
}
