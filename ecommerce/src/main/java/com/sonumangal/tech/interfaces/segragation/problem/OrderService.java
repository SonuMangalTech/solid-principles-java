package com.sonumangal.tech.interfaces.segragation.problem;

import com.sonumangal.tech.Order;

public interface OrderService {

    void processOrder(Order order);

    void processReturn(Order order);  // Return or Exchange

    void processPayment(Order order);

    void sendNotification(Order order);
}
