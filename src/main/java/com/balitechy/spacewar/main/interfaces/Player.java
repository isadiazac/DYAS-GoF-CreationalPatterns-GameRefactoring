package com.balitechy.spacewar.main.interfaces;

import java.awt.Graphics;


public interface Player {

    public static final int WIDTH = 56;
    public static final int HEIGHT = 28;

    
    void tick();

    
    void render(Graphics g);

    
    void setVelX(double velX);

    
    void setVelY(double velY);

    
    void shoot();

    
    double getX();
    
    
    double getY();
}