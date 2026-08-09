package com.sonumangal.tech.liskov.substitution.solution;

import com.sonumangal.tech.Order;

public class GiftCardPayment implements PaymentService {
    @Override
    public void pay(Order order) {
        System.out.println("Pay successfully");
    }

}
