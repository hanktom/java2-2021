package com.tom.cust;

public class SilverCustomer extends Customer {
    float discount = 0.1f;

    public SilverCustomer(String id, int amount) {
        super(id, amount);
    }
    @Override
    public int getTotal() {
        return amount - (int)(amount * discount);
    }
}
