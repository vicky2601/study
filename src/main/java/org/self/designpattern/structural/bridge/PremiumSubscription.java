package org.self.designpattern.structural.bridge;

public class PremiumSubscription extends Subscription {

    public PremiumSubscription(UserPlan userPlan, PaymentService paymentService) {
        super(userPlan, paymentService);
    }

    @Override
    public void processSubscriptionPayment() {
        double amount = userPlan.amount();
        paymentService.processPayment(amount);
        System.out.println("Premium subscription activated with amount: " + amount);
    }
}
