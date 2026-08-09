package com.sonumangal.tech.open.close.solution;

import com.sonumangal.tech.Order;

public class PremiumDiscount implements Discount {
    @Override
    public double calculateDiscount(Order order) {
        return order.getAmount() * 0.2;
    }
}
