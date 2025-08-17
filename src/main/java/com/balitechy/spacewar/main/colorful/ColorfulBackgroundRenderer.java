package com.balitechy.spacewar.main.colorful;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;
import java.util.Random;

import com.balitechy.spacewar.main.Game;
import com.balitechy.spacewar.main.interfaces.BackgroundRenderer;


public class ColorfulBackgroundRenderer implements BackgroundRenderer {

    private static final int NUM_STARS = 150;
    private final int[] starX = new int[NUM_STARS];
    private final int[] starY = new int[NUM_STARS];
    private final Color[] starColors = new Color[NUM_STARS];
    private final Random rand = new Random();

    public ColorfulBackgroundRenderer() {
        for (int i = 0; i < NUM_STARS; i++) {
            starX[i] = rand.nextInt(Game.WIDTH * Game.SCALE);
            starY[i] = rand.nextInt(Game.HEIGHT * Game.SCALE);
            float r = rand.nextFloat() / 2f + 0.5f;
            float g = rand.nextFloat() / 2f + 0.5f;
            float b = rand.nextFloat() / 2f + 0.5f;
            starColors[i] = new Color(r, g, b);
        }
    }

    @Override
    public void render(Graphics g, Canvas c) throws IOException {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, c.getWidth(), c.getHeight());

        for (int i = 0; i < NUM_STARS; i++) {
            g.setColor(starColors[i]);
            g.fillOval(starX[i], starY[i], 2, 2);
        }
        g.setColor(Color.lightGray);
        g.drawOval(20, 20, 150, 150);
    }
}