package com.sonumangal.tech.open.close.problem;

import com.sonumangal.tech.Order;

public class DiscountService {

    public double calculateDiscount(Order o, String userType) {
        if ("PREMIUM".equals(userType)) {
            return o.getAmount() * 0.2;
        } else if ("CORPORATE".equals(userType)) {
            return o.getAmount() * 0.4;
        } else if ("EMPLOYEE".equals(userType)) {
            return o.getAmount() * 0.5;
        }
        return o.getAmount() * 0.1;
    }
}
