package org.self.designpattern.structural.bridge;

public class UserPlanFactory {

    public static UserPlan getUserPlan(String planType) {
        if (planType == null) {
            throw new IllegalArgumentException("Plan type cannot be null");
        }
        if (planType.equalsIgnoreCase("STANDARD")) {
            return new StandardPlan();
        } else if (planType.equalsIgnoreCase("BASIC")) {
            return new BasicPlan();
        }else {
            throw new IllegalArgumentException("Invalid plan type: " + planType);
        }
    }
}
