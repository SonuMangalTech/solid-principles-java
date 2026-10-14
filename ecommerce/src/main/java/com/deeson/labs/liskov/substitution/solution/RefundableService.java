package com.deeson.labs.liskov.substitution.solution;

import com.deeson.labs.Order;

public interface RefundableService {
    void refund(Order order);
}
