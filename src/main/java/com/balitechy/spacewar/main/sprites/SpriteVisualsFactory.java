package com.balitechy.spacewar.main.sprites;

import java.io.IOException;

import com.balitechy.spacewar.main.Game;
import com.balitechy.spacewar.main.interfaces.BackgroundRenderer;
import com.balitechy.spacewar.main.interfaces.Bullet;
import com.balitechy.spacewar.main.interfaces.GameVisualsFactory;
import com.balitechy.spacewar.main.interfaces.Player;

public class SpriteVisualsFactory implements GameVisualsFactory {
    
    private final SpritesImageLoader spritesLoader;

    public SpriteVisualsFactory() {
        spritesLoader = new SpritesImageLoader("/sprites.png");
        try {
            spritesLoader.loadImage();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public Player createPlayer(double x, double y, Game game) {
        return new SpritePlayer(x, y, game, spritesLoader);
    }

    @Override
    public Bullet createBullet(double x, double y, Game game) {
        return new SpriteBullet(x, y, spritesLoader);
    }

    @Override
    public BackgroundRenderer createBackgroundRenderer() {
    // La ruta correcta es "/bg.png", ya que la carpeta resources
    // se considera la raíz del classpath.
    SpritesImageLoader bgLoader = new SpritesImageLoader("/bg.png");
    return new SpriteBackgroundRenderer(bgLoader);
}
}