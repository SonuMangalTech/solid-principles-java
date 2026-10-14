package com.deeson.labs.liskov.substitution.problem;

import com.deeson.labs.Order;

public class TestClient {
    public static void main(String[] args) {
        Order order = new Order(101, "Mobile Phone", 9767.80);

        PaymentService service = new GiftCardPayment();
        service.pay(order);
        service.refund(order);  // UnsupportedOperationException

    }
}
