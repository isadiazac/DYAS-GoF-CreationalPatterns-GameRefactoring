package com.balitechy.spacewar.main.colorful;

import com.balitechy.spacewar.main.Game;
import com.balitechy.spacewar.main.interfaces.BackgroundRenderer;
import com.balitechy.spacewar.main.interfaces.Bullet;
import com.balitechy.spacewar.main.interfaces.GameVisualsFactory;
import com.balitechy.spacewar.main.interfaces.Player;

public class ColorfulVisualsFactory implements GameVisualsFactory {

    @Override
    public Player createPlayer(double x, double y, Game game) {
        return new ColorfulPlayer(x, y, game);
    }

    @Override
    public Bullet createBullet(double x, double y, Game game) {
        return new ColorfulBullet(x, y);
    }

    @Override
    public BackgroundRenderer createBackgroundRenderer() {
        return new ColorfulBackgroundRenderer();
    }
}