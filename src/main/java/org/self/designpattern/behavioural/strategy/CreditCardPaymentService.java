package org.self.designpattern.behavioural.strategy;

public class CreditCardPaymentService implements PaymentService {

    @Override
    public void processPayment(double amount) {
        // Logic to process credit card payment
        System.out.println("Processing credit card payment of amount: " + amount);
    }
}
