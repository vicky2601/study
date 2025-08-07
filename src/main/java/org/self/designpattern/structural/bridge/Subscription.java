package org.self.designpattern.structural.bridge;

public abstract class Subscription {
    protected UserPlan userPlan;
    protected PaymentService paymentService;

    public Subscription(UserPlan userPlan, PaymentService paymentService) {
        this.userPlan = userPlan;
        this.paymentService = paymentService;
    }

    public abstract void processSubscriptionPayment();

}
