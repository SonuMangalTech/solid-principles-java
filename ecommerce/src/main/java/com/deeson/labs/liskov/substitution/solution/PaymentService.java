package com.deeson.labs.liskov.substitution.solution;

import com.deeson.labs.Order;

public interface PaymentService {
    void pay(Order order);
}
