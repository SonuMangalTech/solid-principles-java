package com.sonumangal.tech.solid;

import com.sonumangal.tech.Order;

public class InMemoryOrderRepository
        implements OrderRepository {

    @Override
    public void save(Order order) {

        System.out.println("Order Saved");
    }
}