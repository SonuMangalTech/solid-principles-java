package com.sonumangal.tech.liskov.substitution.problem;

import com.sonumangal.tech.Order;

public class GiftCardPayment implements PaymentService {
    @Override
    public void pay(Order order) {
        System.out.println("Pay successfully");
    }

    @Override
    public void refund(Order order) {
        throw new UnsupportedOperationException("Giftcard payment will not refund to account");
    }
}
