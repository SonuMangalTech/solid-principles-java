package com.sonumangal.tech.liskov.substitution.solution;

import com.sonumangal.tech.Order;

/*
LSP: Objects of a superclass should be replaceable with objects of its subclasses without
        breaking the application.

        LSP asks: Can I replace the parent with any child?

        Payment payment = new CreditCardPayment();
      Replace with
        Payment payment = new GiftCardPayment();

        Will everything still work?
        If No => LSP violated.
* */
public class TestClient {
    public static void main(String[] args) {
        Order order = new Order(101, "Mobile Phone", 9767.80);

        PaymentService paymentService = new GiftCardPayment();
        paymentService.pay(order); // Refund not allowed

        PaymentService creditCardPayment = new CreditCardPayment();
        creditCardPayment.pay(order);
        RefundableService refundService = new CreditCardPayment();
        refundService.refund(order);
    }
}
