package com.sonumangal.tech.dependency.inversion.problem;

import com.sonumangal.tech.Order;

public class CreditCardPayment {
    public void pay(Order order) {
        System.out.println("Pay successfully");
    }
}
