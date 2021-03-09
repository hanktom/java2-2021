package com.tom;

public class HelloWorld {
    public static void main(String[] args) {

        System.out.println("Hello world");
//        Student stu = new Student("1101", "Eric", 60, 80);
//        stu.print();
//        int[] scores = {50, 80, 35, 90};
//        int[] ss = new int[5];
        Student[] students = {
                new Student("1101", "Eric", 60, 80),
                new Student("1102", "Hank", 60, 80),
                new Student("1103", "Jane", 60, 80),
                new Student("1106", "Jack", 60, 80)
        };
        for (int i = 0; i < students.length; i++) {
            students[i].print();
        }

    }
}
