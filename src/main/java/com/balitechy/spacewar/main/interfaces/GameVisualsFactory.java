package com.balitechy.spacewar.main.interfaces;

import com.balitechy.spacewar.main.Game;

public interface GameVisualsFactory {
    Player createPlayer(double x, double y, Game game);
    Bullet createBullet(double x, double y, Game game);
    BackgroundRenderer createBackgroundRenderer();
}