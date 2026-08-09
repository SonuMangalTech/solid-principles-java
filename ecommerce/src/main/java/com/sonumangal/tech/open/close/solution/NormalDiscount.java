package com.sonumangal.tech.open.close.solution;

import com.sonumangal.tech.Order;

public class NormalDiscount implements Discount {
    @Override
    public double calculateDiscount(Order order) {
        return order.getAmount() * 0.1;
    }
}
