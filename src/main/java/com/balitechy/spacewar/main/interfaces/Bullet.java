package com.balitechy.spacewar.main.interfaces;

import java.awt.Graphics;

public interface Bullet {
    // Constantes para las dimensiones de la bala, accesibles por todas las clases.
    public static final int WIDTH = 11;
    public static final int HEIGHT = 21;

    void tick();
    void render(Graphics g);
    double getY();
}