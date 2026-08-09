package com.sonumangal.tech.liskov.substitution.problem;

import com.sonumangal.tech.Order;

public class CreditCardPayment implements PaymentService{
    @Override
    public void pay(Order order) {
        System.out.println("Pay successfully");
    }

    @Override
    public void refund(Order order) {
        System.out.println("Refund successfully");
    }
}
