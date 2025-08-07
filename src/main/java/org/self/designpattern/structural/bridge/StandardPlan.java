package org.self.designpattern.structural.bridge;

public class StandardPlan implements UserPlan {

    @Override
    public double amount() {
        // Logic to return the amount for the standard plan
        return 200.0; // Example amount for the standard plan
    }
}
