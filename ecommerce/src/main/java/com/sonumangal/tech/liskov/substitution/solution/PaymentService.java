package com.sonumangal.tech.liskov.substitution.solution;

import com.sonumangal.tech.Order;

public interface PaymentService {
    void pay(Order order);
}
