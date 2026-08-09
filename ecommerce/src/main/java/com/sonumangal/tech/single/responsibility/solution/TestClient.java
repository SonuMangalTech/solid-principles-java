package com.sonumangal.tech.single.responsibility.solution;

import com.sonumangal.tech.Order;

public class TestClient {
    public static void main(String[] args) {
        Order order = new Order(101, "Mobile Phone", 9767.80);

        OrderService orderService = new OrderService();
        orderService.createOrder(order);

        PaymentService paymentService = new PaymentService();
        paymentService.processPayment(order);
        paymentService.validatePayment(order);
        paymentService.refund(order);

        DiscountService discountService = new DiscountService();
        discountService.calculateDiscount(order, "Premium");

        NotificationService notificationService = new NotificationService();
        notificationService.sendNotification(order);
    }
}
