package org.self.designpattern.creational.factory;

public class UPIPaymentService implements PaymentService {

    UPIPaymentService() {
        PaymentFactory.registerPaymentService("upi", this);
    }
    @Override
    public void processPayment(double amount) {
        // Logic to process UPI payment
        System.out.println("Processing UPI payment of amount: " + amount);
    }
}
