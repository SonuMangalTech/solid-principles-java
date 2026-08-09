package com.sonumangal.tech.solid;

import com.sonumangal.tech.Order;

public class OrderService {

    private final Discount discount;

    private final Payment payment;

    private final InventoryService inventoryService;

    private final NotificationService notificationService;

    private final OrderRepository repository;

    public OrderService(
            Discount discount,
            Payment payment,
            InventoryService inventoryService,
            NotificationService notificationService,
            OrderRepository repository) {

        this.discount = discount;
        this.payment = payment;
        this.inventoryService = inventoryService;
        this.notificationService = notificationService;
        this.repository = repository;
    }

    public void placeOrder(Order order) {

        double discountAmount = discount.calculateDiscount(order);

        System.out.println("Discount : " + discountAmount);

        payment.pay(order);

        inventoryService.updateInventory(order);

        repository.save(order);

        notificationService.send(order);
    }
}