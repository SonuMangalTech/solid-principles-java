package com.deeson.labs.solid;

import com.deeson.labs.Order;

public class InMemoryOrderRepository
        implements OrderRepository {

    @Override
    public void save(Order order) {

        System.out.println("Order Saved");
    }
}