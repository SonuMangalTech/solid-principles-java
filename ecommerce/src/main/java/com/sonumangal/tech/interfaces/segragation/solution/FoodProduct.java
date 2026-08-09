package com.sonumangal.tech.interfaces.segragation.solution;

import com.sonumangal.tech.Order;

public class FoodProduct implements OrderProcessor, PaymentProcessor, NotificationProcessor {
    @Override
    public void processOrder(Order order) {
        System.out.println("Order successfully Placed");
    }

    @Override
    public void processPayment(Order order) {
        System.out.println("Payment processed successfully");
    }

    @Override
    public void sendNotification(Order order) {
        System.out.println("Notification send");
    }
}
