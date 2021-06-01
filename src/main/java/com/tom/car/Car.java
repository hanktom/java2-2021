package com.tom.car;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Car {
    String id;
    private Date enter;

    public Car(String id) {
        this.id = id;
        enter = new Date();
    }
    public Car(String id, String time) {
        this.id = id;
        //"07:30"
        Calendar now = Calendar.getInstance();
        String[] tokens = time.split(":");
        System.out.println("t0 " + tokens[0]);
        System.out.println("t1 " + tokens[1]);
        now.set(Calendar.HOUR_OF_DAY, Integer.parseInt(tokens[0]));
        now.set(Calendar.MINUTE, Integer.parseInt(tokens[1]));
        enter = now.getTime();
    }

    public Date getEnter() {
        return enter;
    }
}
