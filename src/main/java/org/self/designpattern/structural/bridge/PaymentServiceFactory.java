package org.self.designpattern.structural.bridge;

public class PaymentServiceFactory {

    public static PaymentService getPaymentService(String type) {
        if ("UPI".equalsIgnoreCase(type)) {
            return new UPIPaymentService();
        } else if ("CreditCard".equalsIgnoreCase(type)) {
            return new CreditCardPaymentService();
        } else {
            throw new IllegalArgumentException("Invalid Payment type: " + type);
        }
    }
}
