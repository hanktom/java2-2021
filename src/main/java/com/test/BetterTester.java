package com.test;

import java.util.ArrayList;
import java.util.List;

public class BetterTester {
    public static void main(String[] args) {
        List boxes = new ArrayList();
        boxes.add(new Box1());
        boxes.add(new Box2());
        boxes.add(new Box3());
        boxes.add(new Box4());
        boxes.add(new Box5());
        Box box = (Box) boxes.get(3);
        System.out.println(box.name);
        boxes.add(new Box1());
        boxes.add(new Box1());
        boxes.add(new Box1());
        boxes.add(new Box1());
        //
        boxes.add(new Box1());
        //
        boxes.add(new Box1());
        System.out.println(boxes.size());


    }
}
