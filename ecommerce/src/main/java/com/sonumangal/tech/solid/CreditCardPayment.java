package com.sonumangal.tech.solid;

import com.sonumangal.tech.Order;

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