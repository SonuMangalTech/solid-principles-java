package com.sonumangal.tech.open.close.solution;

import com.sonumangal.tech.Order;

/*
* if the business introduces a new discount type, you don't modify DiscountService.
  Just add a new implementation.
  DiscountService remains unchanged. This is exactly what "Open for Extension, Closed for Modification" means.
* */

public class DiscountService {
    private Discount discount;

    DiscountService(Discount discount) {
        this.discount = discount;
    }

    double calculateDiscount(Order order) {
        return discount.calculateDiscount(order);
    }
}
