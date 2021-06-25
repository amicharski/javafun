package com.micharski.physics;

import java.awt.*;

public class Object {
    private Coordinate position;
    private int[] velocity;
    private int[] acceleration;
    private int[] size;
    private Color color;

    public Object(Coordinate position, int[] size, int[] velocity, int[] acceleration, Color color){
        this.position = position;
        this.size = size;
        this.velocity = velocity;
        this.acceleration = acceleration;
        this.color = color;
    }

    public Object(Coordinate position, int[] size, int[] velocity, int[] acceleration){
        this.position = position;
        this.size = size;
        this.velocity = velocity;
        this.acceleration = acceleration;
    }

    public Object(Coordinate position, int[] size, Color color){
        this.position = position;
        this.size = size;
        this.color = color;
    }

    public Object(Coordinate position, int[] size){
        this.position = position;
        this.size = size;
    }

    public void setPosition(Coordinate position){ this.position = position; }
    public Coordinate getPosition(){return position;}

    public void setVelocity(int[] velocity){ this.velocity = velocity; }
    public int[] getVelocity(){ return velocity; }

    public void setAcceleration(int[] acceleration){ this.acceleration = acceleration; }
    public int[] getAcceleration(){ return acceleration; }

    public void setSize(int[] size) { this.size = size; }
    public int[] getSize() { return size; }

    public void draw(Graphics g){
        g.setColor(color);
        g.fillRect(position.getX(), position.getY(), size[0], size[1]);
    }

    public void update(){
        position.setX(position.getX() + velocity[0]);
        position.setY(position.getY() + velocity[1]);
        velocity[0] += acceleration[0];
        velocity[1] += acceleration[1];
        acceleration[1] += Driver.World.GRAVITY;
    }
}
