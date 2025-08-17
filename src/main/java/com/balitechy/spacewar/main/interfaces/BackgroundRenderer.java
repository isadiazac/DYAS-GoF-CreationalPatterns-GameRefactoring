package com.balitechy.spacewar.main.interfaces;

import java.awt.Canvas;
import java.awt.Graphics;
import java.io.IOException;

public interface BackgroundRenderer {
    void render(Graphics g, Canvas c) throws IOException;
}