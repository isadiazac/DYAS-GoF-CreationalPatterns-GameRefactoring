package com.balitechy.spacewar.main.vectorial;

import java.awt.Color;
import java.awt.Graphics;

import com.balitechy.spacewar.main.interfaces.Bullet;


public class VectorialBullet implements Bullet {

    private double x;
    private double y;

    public VectorialBullet(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    @Override
    public void tick() {
        y -= 5;
    }
    
    @Override
    public void render(Graphics g) {
        g.setColor(Color.black);
        // Dibuja una elipse (o círculo) para representar la bala
        g.drawLine((int) x, (int) y, (int) x, (int) y + Bullet.HEIGHT);
    }
    
    @Override
    public double getY() {
        return y;
    }
}