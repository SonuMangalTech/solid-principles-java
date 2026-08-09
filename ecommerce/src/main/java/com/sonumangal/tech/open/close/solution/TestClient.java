package com.sonumangal.tech.open.close.solution;

import com.sonumangal.tech.Order;

public class TestClient {
    public static void main(String[] args) {
        Order order = new Order(101, "Mobile Phone", 9767.80);

        Discount discount = new CorporateDiscount();
        DiscountService service = new DiscountService(discount);
        System.out.println(service.calculateDiscount(order));
    }
}
