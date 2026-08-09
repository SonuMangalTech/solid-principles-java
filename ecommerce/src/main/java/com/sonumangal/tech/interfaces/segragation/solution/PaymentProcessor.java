package com.sonumangal.tech.interfaces.segragation.solution;

import com.sonumangal.tech.Order;

public interface PaymentProcessor {
    void processPayment(Order order);
}
