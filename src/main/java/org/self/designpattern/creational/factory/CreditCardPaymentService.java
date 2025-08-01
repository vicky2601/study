package org.self.designpattern.creational.factory;

public class CreditCardPaymentService implements PaymentService {

    CreditCardPaymentService(){
        PaymentFactory.registerPaymentService("creditCard", this);
    }
    @Override
    public void processPayment(double amount) {
        // Logic to process credit card payment
        System.out.println("Processing credit card payment of amount: " + amount);
    }
}
