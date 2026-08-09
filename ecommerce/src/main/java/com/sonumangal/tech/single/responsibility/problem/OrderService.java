package com.sonumangal.tech.single.responsibility.problem;

import com.sonumangal.tech.Order;

public class OrderService {

    void createOrder(Order order) {
        System.out.println("Order created successfully");
    }

    void processPayment(Order o) {
        System.out.println("Payment process successfully");
    }

    double calculateDiscount(Order order, String userType) {
        if ("Premium".equals(userType))
            return order.getAmount() * 0.10;

        return order.getAmount() * 0.05;
    }

    void sendNotification(Order o) {
        System.out.println("Send notification successfully");
    }

}
