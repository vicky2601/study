package org.self.designpattern.structural.bridge;

public class BasicPlan implements UserPlan {

    @Override
    public double amount() {
        // Logic to return the amount for the basic plan
        return 100.0; // Example amount for the basic plan
    }
}
