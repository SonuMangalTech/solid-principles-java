package com.sonumangal.tech.dependency.inversion.problem;

import com.sonumangal.tech.Order;

public class OrderService {
    private CreditCardPayment creditCardPayment = new CreditCardPayment();

    public void processPayment(Order order) {
        creditCardPayment.pay(order);
    }
}
