package org.self.designpattern.creational.factory;

import java.util.HashMap;
import java.util.Map;

public class PaymentFactory {
    private static final Map<String, PaymentService> registerPaymentService = new HashMap<>();

    public static void registerPaymentService(String type, PaymentService paymentService) {
        registerPaymentService.put(type, paymentService);
    }
    public static PaymentService getPaymentServiceInstance(String type) {
        return registerPaymentService.getOrDefault(type, new DefaultPaymentService());
    }
}
