package com.deeson.labs.dependency.inversion.solution;

import com.deeson.labs.Order;

public class OrderService {
    private final Payment payment;

    OrderService(Payment payment) {
        this.payment = payment;
    }

    public void paymentProcess(Order order) {
        payment.pay(order);
    }
}
