package com.deeson.labs.solid;

import com.deeson.labs.Order;

public class GiftCardPayment
        implements Payment {

    @Override
    public void pay(Order order) {

        System.out.println("Gift Card Payment");
    }
}