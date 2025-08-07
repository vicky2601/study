package org.self.designpattern.structural.bridge;


public class UPIPaymentService implements PaymentService {

    @Override
    public void processPayment(double amount) {
        // Logic to process UPI payment
        System.out.println("Processing UPI payment of amount: " + amount);
    }
}
