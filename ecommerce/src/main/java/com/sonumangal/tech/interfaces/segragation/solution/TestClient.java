package com.sonumangal.tech.interfaces.segragation.solution;

import com.sonumangal.tech.Order;

public class TestClient {
    public static void main(String[] args) {
        Order order = new Order(101, "Mobile Phone", 9767.80);

        ElectronicsProduct electronicsProduct = new ElectronicsProduct();
        electronicsProduct.processOrder(order);
        electronicsProduct.processReturn(order);
        electronicsProduct.processPayment(order);
        electronicsProduct.sendNotification(order);

        // refund/return/exchange not allowed in food product
        FoodProduct foodProduct = new FoodProduct();
        foodProduct.processOrder(order);
        foodProduct.processPayment(order);
        foodProduct.sendNotification(order);
    }
}
