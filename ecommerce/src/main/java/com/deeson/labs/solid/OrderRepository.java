package com.deeson.labs.solid;

import com.deeson.labs.Order;

public interface OrderRepository {

    void save(Order order);
}