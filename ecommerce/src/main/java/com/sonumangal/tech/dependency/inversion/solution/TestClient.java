package com.sonumangal.tech.dependency.inversion.solution;

import com.sonumangal.tech.Order;

/*
High-level modules should not depend on low-level modules. Both should depend on abstractions.
In simple words:
    Depend on interfaces, not concrete classes.


* */
public class TestClient {
    public static void main(String[] args) {
        Order order = new Order(101, "Mobile Phone", 9767.80);

        Payment payment = new CreditcardPayment();
        payment.pay(order);
    }
}
