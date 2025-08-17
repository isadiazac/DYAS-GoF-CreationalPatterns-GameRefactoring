package com.balitechy.spacewar.main.vectorial;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;

import com.balitechy.spacewar.main.interfaces.BackgroundRenderer;


public class VectorialBackgroundRenderer implements BackgroundRenderer {
    
    @Override
    public void render(Graphics g, Canvas c) throws IOException {
        g.setColor(Color.white);
        
        g.fillRect(0, 0, c.getWidth(), c.getHeight());

        g.setColor(Color.black);
        g.drawOval(20, 20, 200, 200);

    }
}