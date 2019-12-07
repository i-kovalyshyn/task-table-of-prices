package com.home;

import java.time.Month;

public class ProductKey {
    private Month month;
    private int price;

    public ProductKey(Month month, int price) {
        this.month = month;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public Month getMonth() {
        return month;
    }
}
