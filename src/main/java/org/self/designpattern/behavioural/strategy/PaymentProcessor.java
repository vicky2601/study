package org.self.designpattern.behavioural.strategy;

public class PaymentProcessor {
    private final PaymentService paymentService;

    public PaymentProcessor(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void processPayment(double amount) {
        paymentService.processPayment(amount);
    }

}
