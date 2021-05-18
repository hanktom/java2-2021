package com.tom.snowing;

import java.util.Random;

public class Snow extends Thread {
    Random random = new Random();
    int x;
    int y;
    SnowCanvas canvas;

    public Snow(SnowCanvas canvas) {
        this.canvas = canvas;
        x = random.nextInt(300);
        y = random.nextInt(200);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            y = y + i;
            x = x + random.nextInt(5)-2;
            canvas.repaint();
            try {
                sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
