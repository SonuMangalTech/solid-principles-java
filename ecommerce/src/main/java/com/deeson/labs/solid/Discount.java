package com.deeson.labs.solid;

import com.deeson.labs.Order;

public interface Discount {
    double calculateDiscount(Order order);
}