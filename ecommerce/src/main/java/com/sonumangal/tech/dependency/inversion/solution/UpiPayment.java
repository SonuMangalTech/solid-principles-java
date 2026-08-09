package com.sonumangal.tech.dependency.inversion.solution;

import com.sonumangal.tech.Order;

public class UpiPayment implements Payment {
    @Override
    public void pay(Order order) {
        System.out.println("UPI Payment Successfully");
    }
}
