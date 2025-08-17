package com.balitechy.spacewar.main.colorful;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import com.balitechy.spacewar.main.Game;
import com.balitechy.spacewar.main.interfaces.Bullet;
import com.balitechy.spacewar.main.interfaces.Player;


public class ColorfulPlayer implements Player {

    private double x;
    private double y;
    
    private double velX;
    private double velY;
    
    private Game game;
    private Color color;
    private static final Random rand = new Random();
    
    public ColorfulPlayer(double x, double y, Game game){
        this.x = x;
        this.y = y;
        this.game = game;

        float r = rand.nextFloat() / 2f + 0.5f;
        float g = rand.nextFloat() / 2f + 0.5f;
        float b = rand.nextFloat() / 2f + 0.5f;
        this.color = new Color(r, g, b);
    }
    
    @Override
    public double getX() {
        return x;
    }

    @Override
    public double getY() {
        return y;
    }
    
    @Override
    public void setVelX(double velX) {
        this.velX = velX;
    }

    @Override
    public void setVelY(double velY) {
        this.velY = velY;
    }
    
    @Override
    public void shoot(){
        game.createAndAddBullet(x + (Player.WIDTH / 2) - (Bullet.WIDTH / 2), y);
    }

    @Override
    public void tick(){
        x += velX;
        y += velY;
        
        if(x <= 0)
            x = 0;
        if(x >= (Game.WIDTH * Game.SCALE) - Player.WIDTH)
            x = (Game.WIDTH * Game.SCALE) - Player.WIDTH;
        if(y <= 0)
            y = 0;
        if(y >= (Game.HEIGHT * Game.SCALE) - Player.HEIGHT)
            y = (Game.HEIGHT * Game.SCALE) - Player.HEIGHT;
    }
    
    @Override
    public void render(Graphics g){
        g.setColor(this.color);
        
        int[] xPoints = { (int) (x + Player.WIDTH / 2), (int) x, (int) (x + Player.WIDTH) };
        int[] yPoints = { (int) y, (int) (y + Player.HEIGHT), (int) (y + Player.HEIGHT) };
        
        g.fillPolygon(xPoints, yPoints, 3);
    }
}