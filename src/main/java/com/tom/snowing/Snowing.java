package com.tom.snowing;

import javax.swing.*;
import java.awt.*;

public class Snowing extends JFrame {
    public Snowing() {
        setSize(600, 400);
        setLocation(300, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        SnowCanvas canvas = new SnowCanvas();
        add(canvas, BorderLayout.CENTER);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Snowing();
    }
}
