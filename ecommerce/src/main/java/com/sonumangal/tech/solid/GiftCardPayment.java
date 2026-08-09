package com.sonumangal.tech.solid;

import com.sonumangal.tech.Order;

public class GiftCardPayment
        implements Payment {

    @Override
    public void pay(Order order) {

        System.out.println("Gift Card Payment");
    }
}