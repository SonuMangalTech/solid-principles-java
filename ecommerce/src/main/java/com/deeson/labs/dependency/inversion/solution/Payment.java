package com.deeson.labs.dependency.inversion.solution;

import com.deeson.labs.Order;

public interface Payment {
    public void pay(Order order);
}
