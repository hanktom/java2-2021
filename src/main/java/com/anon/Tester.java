package com.anon;

import java.util.Random;

public class Tester {
    public static void main(String[] args) {
        Reporter reporter = new WeatherReporter();
        Reporter reporter2 = new HeheheReporter();
        reporter.print();
        reporter2.print();



        //Printer printer = new Printer();
    }
}
