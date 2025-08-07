package org.self.designpattern.structural.bridge;

public class ClientCode {
    public static void main(String[] args) {
        UserPlan userPlan = UserPlanFactory.getUserPlan("STANDARD");
        PaymentService paymentService = PaymentServiceFactory.getPaymentService("UPI");

        Subscription subscription = new PremiumSubscription(userPlan, paymentService);
        subscription.processSubscriptionPayment();
    }
}
