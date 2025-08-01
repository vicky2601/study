package org.self.designpattern.behavioural.command;

public class ClientCode {

    public static void main(String[] args) {
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
}
