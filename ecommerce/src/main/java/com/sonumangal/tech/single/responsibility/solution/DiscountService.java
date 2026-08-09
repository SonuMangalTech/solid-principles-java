package com.sonumangal.tech.single.responsibility.solution;

import com.sonumangal.tech.Order;

public class DiscountService {
    double calculateDiscount(Order order, String userType) {
        if ("Premium".equals(userType))
            return order.getAmount() * 0.10;

        return order.getAmount() * 0.05;
    }
}
