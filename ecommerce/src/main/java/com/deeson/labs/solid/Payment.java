package com.deeson.labs.solid;

import com.deeson.labs.Order;

public interface Payment {

    void pay(Order order);
}