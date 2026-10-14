package com.deeson.labs.interfaces.segragation.solution;

import com.deeson.labs.Order;

public interface NotificationProcessor {
    void sendNotification(Order order);
}
