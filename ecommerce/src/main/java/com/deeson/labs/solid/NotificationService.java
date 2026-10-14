package com.deeson.labs.solid;

import com.deeson.labs.Order;

public class NotificationService {

    public void send(Order order) {

        System.out.println("SMS Sent");
    }
}