package com.sonumangal.tech.dependency.inversion.solution;

import com.sonumangal.tech.Order;

public class CreditcardPayment  implements Payment {
    @Override
    public void pay(Order order) {
        System.out.println("Credit Card Payment Successfully");
    }
}