package com.deeson.labs.interfaces.segragation.problem;

import com.deeson.labs.Order;

public interface OrderService {

    void processOrder(Order order);

    void processReturn(Order order);  // Return or Exchange

    void processPayment(Order order);

    void sendNotification(Order order);
}
