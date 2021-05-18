package com.tom.snowing;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class SnowCanvas extends Canvas {
//    Snow snow;
    List<Snow> snows = new ArrayList<>();
    public SnowCanvas() {
        setBackground(Color.BLACK);
        for (int i = 0; i < 100; i++) {
            Snow snow = new Snow(this);
            snow.start();
            snows.add(snow);
        }

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.WHITE);
        for (Snow snow : snows) {
            g.drawString("雪", snow.x, snow.y);
        }
    }
}
