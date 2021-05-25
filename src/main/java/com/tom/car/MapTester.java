package com.tom.car;

import java.util.HashMap;
import java.util.Map;

public class MapTester {
    public static void main(String[] args) {
        Map<String, String> students =
                new HashMap<>();
        students.put("99595959", "王小明");
        students.put("001", "王");
        students.put("002", "王小");
        students.put("008", "王小明");
        String name = students.get("001");
        System.out.println(name);
    }
}
