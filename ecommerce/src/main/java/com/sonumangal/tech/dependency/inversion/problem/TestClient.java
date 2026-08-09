package com.sonumangal.tech.dependency.inversion.problem;

import com.sonumangal.tech.Order;

public class TestClient {
    public static void main(String[] args) {
        Order order = new Order(101, "Mobile Phone", 9767.80);

        OrderService orderService = new OrderService();
        orderService.processPayment(order);

    }
}
