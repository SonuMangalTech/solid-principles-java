package com.deeson.labs.open.close.solution;

import com.deeson.labs.Order;

public class NormalDiscount implements Discount {
    @Override
    public double calculateDiscount(Order order) {
        return order.getAmount() * 0.1;
    }
}
