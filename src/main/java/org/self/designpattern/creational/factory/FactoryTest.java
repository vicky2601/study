package org.self.designpattern.creational.factory;

public class FactoryTest {

    public static void main(String[] args) {
        PaymentService paymentService = PaymentFactory.getPaymentServiceInstance("upi");
        paymentService.processPayment(100.0);
    }
}
