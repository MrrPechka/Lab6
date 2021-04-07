package bsu.rfact.java.lab6.control;

import bsu.rfact.java.lab6.entity.BouncingBall;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;

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
}
