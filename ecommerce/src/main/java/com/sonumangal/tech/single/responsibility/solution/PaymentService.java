package com.sonumangal.tech.single.responsibility.solution;

import com.sonumangal.tech.Order;

public class PaymentService {
    void processPayment(Order o) {
        System.out.println("Payment process successfully");
    }

    public boolean validatePayment(Order order) {
        return order.getAmount() > 100;
    }

    public void refund(Order order) {
        System.out.println("Refund successfully");
    }
}
