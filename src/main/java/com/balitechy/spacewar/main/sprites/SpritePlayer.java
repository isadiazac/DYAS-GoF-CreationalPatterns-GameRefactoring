package com.balitechy.spacewar.main.sprites;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import com.balitechy.spacewar.main.Game;
import com.balitechy.spacewar.main.interfaces.Player;


public class SpritePlayer implements Player {
    
    private double x;
    private double y;
    
    private double velX;
    private double velY;
    
    
    private BufferedImage image;
    private Game game;
    
    public SpritePlayer(double x, double y, Game game, SpritesImageLoader spritesLoader){
        this.x = x;
        this.y = y;
        this.game = game;
        
        // La clase SpritePlayer ahora recibe el SpritesImageLoader directamente
        // para evitar la dependencia de la clase Game.
        image = spritesLoader.getImage(219, 304, Player.WIDTH, Player.HEIGHT);
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
        // El jugador ya no crea la bala directamente.
        // Ahora le pide al objeto Game que cree y añada la bala por él.
        // Esto elimina la dependencia de la clase Bullet concreta.
        game.createAndAddBullet(x + (Player.WIDTH / 2) - 5, y - 18);
    }

    @Override
    public void tick(){
        x += velX;
        y += velY;
        
        // Lógica para mantener al jugador dentro de los límites del juego.       
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
        g.drawImage(image, (int) x, (int) y, null);
    }
}