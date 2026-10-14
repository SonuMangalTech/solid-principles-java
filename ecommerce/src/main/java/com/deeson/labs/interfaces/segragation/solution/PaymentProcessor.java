package com.deeson.labs.interfaces.segragation.solution;

import com.deeson.labs.Order;

public interface PaymentProcessor {
    void processPayment(Order order);
}
