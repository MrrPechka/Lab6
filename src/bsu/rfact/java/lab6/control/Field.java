package bsu.rfact.java.lab6.control;

import bsu.rfact.java.lab6.entity.BouncingBall;

import javax.swing.plaf.basic.BasicTabbedPaneUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;

import static com.sun.java.accessibility.util.AWTEventMonitor.addMouseListener;

public class Field {
    private boolean paused;
    private boolean selectBall;
    private double startTime;
    private double endTime;
    private double startX;
    private double endX;
    private double startY;
    private double endY;
    private static double time;
    private BouncingBall initBall = null;
    private List<BouncingBall> balls = new ArrayList<>(10);
    
    public Field() {
        setBackground(Color.WHITE);
        addMouseListener(new BasicTabbedPaneUI.MouseHandler());
        addMouseMotionListener(new MouseMotionHandler());
        repaintTimer.start();
        selectBall = false;
    }

    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        Graphics2D canvas = (Graphics2D) graphics;
        for (BouncingBall ball : balls) {
            ball.paint(canvas);
        }
    }

    private void setBackground(Color white) {
    }

    public void addBall() {
        balls.add(new BouncingBall(this));
    }

    public synchronized void pause() {
        paused = true;
    }

    public synchronized void resume() {
        paused = false;
        notifyAll();
    }

    public synchronized void canMove(BouncingBall bouncingBall) throws InterruptedException {
        if (paused) {
            wait();
        }
    }
}
