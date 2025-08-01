package org.self.designpattern.creational.factory;

public class DefaultPaymentService implements PaymentService{

    DefaultPaymentService() {
        PaymentFactory.registerPaymentService("default", this);
    }

    @Override
    public void processPayment(double amount) {
        // Logic to process default payment
        System.out.println("Processing default payment of amount: " + amount);
    }
}
