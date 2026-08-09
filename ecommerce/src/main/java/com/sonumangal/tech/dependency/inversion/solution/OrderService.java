package com.sonumangal.tech.dependency.inversion.solution;

import com.sonumangal.tech.Order;

public class OrderService {
    private final Payment payment;

    OrderService(Payment payment) {
        this.payment = payment;
    }

    public void paymentProcess(Order order) {
        payment.pay(order);
    }
}
