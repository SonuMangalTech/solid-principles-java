package com.sonumangal.tech.liskov.substitution.solution;

import com.sonumangal.tech.Order;

public interface RefundableService {
    void refund(Order order);
}
