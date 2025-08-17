package com.balitechy.spacewar.main.sprites;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import com.balitechy.spacewar.main.interfaces.BackgroundRenderer;


public class SpriteBackgroundRenderer implements BackgroundRenderer {

    private BufferedImage background;

    
    public SpriteBackgroundRenderer(SpritesImageLoader spritesLoader) {
        try {
            
            background = spritesLoader.loadImage();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void render(Graphics g, Canvas c) throws IOException {
        // Dibuja la imagen que ya fue cargada en el constructor.
        if (background != null) {
            g.drawImage(background, 0, 0, c.getWidth(), c.getHeight(), c);
        }
    }
}