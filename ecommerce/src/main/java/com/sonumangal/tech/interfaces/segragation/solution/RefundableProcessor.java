package com.sonumangal.tech.interfaces.segragation.solution;

import com.sonumangal.tech.Order;

public interface RefundableProcessor {

    void processReturn(Order order);  // Return or Exchange
}
