package com.sonumangal.tech.dependency.inversion.solution;

import com.sonumangal.tech.Order;

public interface Payment {
    public void pay(Order order);
}
