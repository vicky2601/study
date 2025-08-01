package org.self.designpattern.behavioural.strategy;

public class StrategyTest {

    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor(new UPIPaymentService());
        paymentProcessor.processPayment(100.0);
    }
}
