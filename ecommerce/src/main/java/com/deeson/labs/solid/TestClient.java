package com.deeson.labs.solid;

import com.deeson.labs.Order;

public class TestClient {

    public static void main(String[] args) {

        Order order = new Order(
                101,
                "Laptop",
                75000);

        Discount discount = new PremiumDiscount();

        Payment payment = new CreditCardPayment();

        OrderRepository repository = new InMemoryOrderRepository();

        OrderService service = new OrderService(
                        discount,
                        payment,
                        new InventoryService(),
                        new NotificationService(),
                        repository);

        service.placeOrder(order);
    }
}