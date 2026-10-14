package com.deeson.labs.dependency.inversion.problem;

import com.deeson.labs.Order;

public class OrderService {
    private CreditCardPayment creditCardPayment = new CreditCardPayment();

    public void processPayment(Order order) {
        creditCardPayment.pay(order);
    }
}
