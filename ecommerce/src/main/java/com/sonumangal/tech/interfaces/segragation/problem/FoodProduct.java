package com.sonumangal.tech.interfaces.segragation.problem;

import com.sonumangal.tech.Order;

public class FoodProduct implements OrderService {
    @Override
    public void processOrder(Order order) {
        System.out.println("Order successfully Placed");
    }

    @Override
    public void processReturn(Order order) {
        throw new UnsupportedOperationException("Return not allowed in food product");
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
