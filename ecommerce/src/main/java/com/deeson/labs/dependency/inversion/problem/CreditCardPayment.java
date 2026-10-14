package com.deeson.labs.dependency.inversion.problem;

import com.deeson.labs.Order;

public class CreditCardPayment {
    public void pay(Order order) {
        System.out.println("Pay successfully");
    }
}
