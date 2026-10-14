package com.deeson.labs.interfaces.segragation.solution;

import com.deeson.labs.Order;

public interface RefundableProcessor {

    void processReturn(Order order);  // Return or Exchange
}
