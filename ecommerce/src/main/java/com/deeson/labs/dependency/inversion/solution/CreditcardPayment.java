package com.deeson.labs.dependency.inversion.solution;

import com.deeson.labs.Order;

public class CreditcardPayment  implements Payment {
    @Override
    public void pay(Order order) {
        System.out.println("Credit Card Payment Successfully");
    }
}