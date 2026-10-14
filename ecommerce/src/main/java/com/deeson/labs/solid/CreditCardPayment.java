package com.deeson.labs.solid;

import com.deeson.labs.Order;

public class CreditCardPayment
        implements Payment, Refundable {

    @Override
    public void pay(Order order) {

        System.out.println("Credit Card Payment");
    }

    @Override
    public void refund(Order order) {

        System.out.println("Refund Success");
    }
}