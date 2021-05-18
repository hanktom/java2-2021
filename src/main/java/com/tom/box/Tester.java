package com.tom.box;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Box[] boxes = {new Box1(), new Box2(),
            new Box3(), new Box4()};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter object\'s length: ");
        int length = Integer.parseInt(scanner.next());
        System.out.println("Please enter object\'s width: ");
        int width = Integer.parseInt(scanner.next());
        System.out.println("Please enter object\'s height: ");
        int height = Integer.parseInt(scanner.next());
        System.out.println("Length: " + length + ", width: " + width + ", height: " + height);
        for (Box box : boxes) {
            if (box.validate(length, width, height)) {
                System.out.println(box.getName() + " / " + box.getPrice());
                break;
            }
        }
        /*if (length <= 10 && width <= 10 && height <= 10) {
            System.out.println("Box 3 it is, price: 60");
        } else if (length <10 && width <= 20 && height <= 20) {
            System.out.println("Box 5 it is, price: 90");
        }*/
    }
}
