package com.balitechy.spacewar.main.colorful;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import com.balitechy.spacewar.main.interfaces.Bullet;


public class ColorfulBullet implements Bullet {

    private double x;
    private double y;
    private Color color;
    private static final Random rand = new Random();

    public ColorfulBullet(double x, double y){
        this.x = x;
        this.y = y;
        float r = rand.nextFloat() / 2f + 0.5f;
        float g = rand.nextFloat() / 2f + 0.5f;
        float b = rand.nextFloat() / 2f + 0.5f;
        this.color = new Color(r, g, b);
    }
    
    @Override
    public void tick() {
        y -= 5;
    }
    
    @Override
    public void render(Graphics g) {
        g.setColor(this.color);
        g.drawOval((int) x, (int) y, Bullet.WIDTH, Bullet.HEIGHT);
    }
    
    @Override
    public double getY() {
        return y;
    }
}