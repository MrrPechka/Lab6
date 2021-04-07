package bsu.rfact.java.lab6.entity;

import bsu.rfact.java.lab6.control.Field;

import java.awt.*;

public class BouncingBall implements Runnable{
    private static final int MAX_RADIUS = 40;
    private static final int MIN_RADIUS = 3;
    private static final int MAX_SPEED = 15;
    private Field field;
    private int radius;
    private Color color;
    private double x;
    private double y;
    private int speed;
    private double speedX;
    private double speedY;

    public BouncingBall(Field field){

    }

    public int getRadius() {
        return radius;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setSpeedX(double speedX) {
        this.speedX = speedX;
    }

    public void setSpeedY(double speedY) {
        this.speedY = speedY;
    }

    @Override
    public void run() {

    }
}
