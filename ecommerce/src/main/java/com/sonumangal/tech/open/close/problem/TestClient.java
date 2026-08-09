package com.sonumangal.tech.open.close.problem;

import com.sonumangal.tech.Order;

public class TestClient {
    public static void main(String[] args) {
        Order order = new Order(101, "Mobile Phone", 9767.80);

        DiscountService discountService = new DiscountService();
        discountService.calculateDiscount(order, "Normal");
    }
}
