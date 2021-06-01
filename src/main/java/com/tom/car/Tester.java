package com.tom.car;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Tester {
    public static void main(String[] args) {
        int fee = 30;
        Map<String, Car> cars = new HashMap<>();
        Car c1 = new Car("abc-123", "07:30");
        Car c2 = new Car("xyz-123", "09:45");
        Car c3 = new Car("ghi-123", "10:30");
        cars.put(c1.id, c1);
        cars.put(c2.id, c2);
        cars.put(c3.id, c3);
        String id = "abc-123";
        Car car = cars.get(id);
        if (car == null) {
            System.out.println("Car not found");
        } else {
            Date now = new Date();
            long ms = now.getTime() - car.getEnter().getTime();
            long mins = ms/(1000*60);
            System.out.println(mins);
        }


//        practice();
    }

    private static void practice() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        try {
            Date d = sdf.parse("08:58");
            System.out.println(d);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        //
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY, 8);
        cal.set(Calendar.MINUTE, 30);

        System.out.println(cal.getTime());

        Car c1 = new Car("abc-123");
        Car c2 = new Car("xyz-888", "07:30");
        System.out.println(c1.getEnter());
        Date now = new Date();
        System.out.println(now.getTime());
        long dis = now.getTime() - c1.getEnter().getTime();
        System.out.println(dis);
    }
}
