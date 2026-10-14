package com.deeson.labs.solid;

import com.deeson.labs.Order;

public interface Refundable {

    void refund(Order order);
}