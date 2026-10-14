package com.deeson.labs.liskov.substitution.solution;

import com.deeson.labs.Order;

public class CreditCardPayment implements PaymentService, RefundableService {
    @Override
    public void pay(Order order) {
        System.out.println("Pay successfully");
    }

    @Override
    public void refund(Order order) {
        System.out.println("Refund successfully");
    }
}
