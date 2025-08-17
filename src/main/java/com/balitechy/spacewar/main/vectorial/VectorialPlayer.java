package com.balitechy.spacewar.main.vectorial;

import java.awt.Color;
import java.awt.Graphics;

import com.balitechy.spacewar.main.Game;
import com.balitechy.spacewar.main.interfaces.Player;


public class VectorialPlayer implements Player {

    private double x;
    private double y;
    
    private double velX;
    private double velY;
    
    private Game game;
    
    public VectorialPlayer(double x, double y, Game game){
        this.x = x;
        this.y = y;
        this.game = game;
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
        game.createAndAddBullet(x + (Player.WIDTH / 2) - 5, y - 18);
    }

    @Override
    public void tick(){
        x += velX;
        y += velY;
        
        // Mantener al jugador dentro de los límites de la pantalla.      
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
        g.setColor(Color.black);
        int[] xPoints = {(int) x, (int) x + Player.WIDTH / 2, (int) x + Player.WIDTH};
        int[] yPoints = {(int) y + Player.HEIGHT, (int) y, (int) y + Player.HEIGHT};
        g.fillPolygon(xPoints, yPoints, 3);
    }
}