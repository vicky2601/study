package org.self.designpattern.behavioural.command;

public class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command; // Set the command to be executed
    }

    public void pressButton() {
        if (command != null) {
            command.execute(); // Execute the command when the button is pressed
        } else {
            System.out.println("No command set!");
        }
    }
}
