package com.tom.db;

public class Drink {
    int id;
    String name;
    int price;

    public Drink(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "DRINK:" + id + "/" + name + "/" + price;
    }
}
