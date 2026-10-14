package com.deeson.labs.liskov.substitution.problem;

import com.deeson.labs.Order;

public interface PaymentService {
    void pay(Order order);

    void refund(Order order);
}
