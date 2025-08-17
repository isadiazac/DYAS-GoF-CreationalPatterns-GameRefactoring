package com.balitechy.spacewar.main.sprites;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import com.balitechy.spacewar.main.interfaces.Bullet;

public class SpriteBullet implements Bullet {

    private double x;
    private double y;
    
    
    private BufferedImage image;

    public SpriteBullet(double x, double y, SpritesImageLoader spritesLoader) {
        this.x = x;
        this.y = y;
       
        this.image = spritesLoader.getImage(35, 52, Bullet.WIDTH, Bullet.HEIGHT);
    }
    
    @Override
    public void tick() {
        y -= 5;
    }
    
    @Override
    public void render(Graphics g) {
        g.drawImage(image, (int) x, (int) y, null);
    }
    
    @Override
    public double getY() {
        return y;
    }
}