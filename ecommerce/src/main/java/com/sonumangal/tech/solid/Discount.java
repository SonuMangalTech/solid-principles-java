package com.sonumangal.tech.solid;

import com.sonumangal.tech.Order;

public interface Discount {
    double calculateDiscount(Order order);
}