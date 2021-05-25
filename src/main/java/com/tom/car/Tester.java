package com.tom.car;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Tester {
    public static void main(String[] args) {
        int fee = 30;
        List<Car> cars = new ArrayList<>();

        Car c1 = new Car("abc-123", "07:30");
        Car c2 = new Car("xyz-123", "09:45");
        Car c3 = new Car("ghi-123", "10:30");
        cars.add(c1);
        cars.add(c2);
        cars.add(c3);

        String id = "abc-123";
        for(Car c : cars) {
            if (c.id.equals(id)) {

                break;
            }
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
        System.out.println(c1.enter);
        Date now = new Date();
        System.out.println(now.getTime());
        long dis = now.getTime() - c1.enter.getTime();
        System.out.println(dis);
    }
}
