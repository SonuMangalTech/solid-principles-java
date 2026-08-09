package com.sonumangal.tech.liskov.substitution.problem;

import com.sonumangal.tech.Order;

public interface PaymentService {
    void pay(Order order);

    void refund(Order order);
}
