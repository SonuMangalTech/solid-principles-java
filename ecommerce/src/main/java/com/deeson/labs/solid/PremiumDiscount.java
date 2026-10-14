package com.deeson.labs.solid;

import com.deeson.labs.Order;

public class PremiumDiscount implements Discount {

    @Override
    public double calculateDiscount(Order order) {

        return order.getAmount() * 0.20;
    }
}