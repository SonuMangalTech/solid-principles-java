package com.deeson.labs.liskov.substitution.solution;

import com.deeson.labs.Order;

public class GiftCardPayment implements PaymentService {
    @Override
    public void pay(Order order) {
        System.out.println("Pay successfully");
    }

}
