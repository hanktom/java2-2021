package com.test;

public class Tester {
    public static void main(String[] args) {
        Box[] boxes = new Box[5];
        boxes[0] = new Box1();
        boxes[1] = new Box2();
        boxes[2] = new Box3();
        boxes[3] = new Box4();
        boxes[4] = new Box5();
        System.out.println(boxes[3].price);
        //
        boxes[5] = new Box1();

//        Box[] boxes = {new Box1(), new Box2(),
//                new Box3(), new Box4(), new Box5()
//        };
        int length = 20;
        int width = 5;
        int height = 5;
        for (Box box: boxes) {
//            Box1 box1 = (Box1) box;
            if (box.validate(length, width, height)){
                System.out.println(box.name + " it is!, " + box.price);
                break;
            }
        }

        /*if (boxes[0].validate(length, width, height)) {
            System.out.println("BOX1 it is!");
        } else if (boxes[1].validate(length, width, height)) {
            System.out.println("BOX2 it is!");
        } else if (boxes[2].validate(length, width, height)) {
            System.out.println("BOX3 it is!");
        } else if (boxes[3].validate(length, width, height)) {
            System.out.println("BOX4 it is!");
        } else if (boxes[4].validate(length, width, height)) {
            System.out.println("BOX5 it is!");
        }*/
    }
}
