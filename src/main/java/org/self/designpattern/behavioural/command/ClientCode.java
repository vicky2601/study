package org.self.designpattern.behavioural.command;

import java.util.ArrayList;
import java.util.List;

public class ClientCode {

    private static List<Order> orders = new ArrayList<>();

    static class Order {
        int id;
        double amount;
        String status;

        Order(int id, double amount) {
            this.id = id;
            this.amount = amount;
            this.status = "NEW";
        }
    }
    public static void main(String[] args) {

        double total = orders.stream().mapToDouble(order -> order.amount).sum();
        // Create a Light object
        Light light = new Light();

        // Create command objects for turning the light on and off
        Command lightCommand = new LightCommand(light);

        // Create a remote control object
        RemoteControl remoteControl = new RemoteControl();

        // Set the command to turn the light on and press the button
        remoteControl.setCommand(lightCommand);
        remoteControl.pressButton(); // Output: Light is turned ON

        // Set the command to turn the light off and press the button
        remoteControl.pressButton(); // Output: Light is turned OFF
        remoteControl.pressButton();
        remoteControl.pressButton();
        remoteControl.pressButton();

    }

    // create binary se
}
