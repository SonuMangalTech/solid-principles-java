package com.sonumangal.tech.single.responsibility.problem;

import com.sonumangal.tech.Order;

public class TestClient {
    public static void main(String[] args) {
        Order order = new Order(101, "Mobile Phone", 9767.80);
        OrderService service = new OrderService();
        service.createOrder(order);
        service.processPayment(order);
        service.calculateDiscount(order, "Premium");
        service.sendNotification(order);
    }
}
