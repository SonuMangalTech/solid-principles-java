package com.sonumangal.tech.solid;

import com.sonumangal.tech.Order;

public class PremiumDiscount implements Discount {

    @Override
    public double calculateDiscount(Order order) {

        return order.getAmount() * 0.20;
    }
}