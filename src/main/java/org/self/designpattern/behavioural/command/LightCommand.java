package org.self.designpattern.behavioural.command;

public class LightCommand implements Command {
    private Light light;
    private boolean isOn;

    public LightCommand(Light light) {
        this.light = light;
        this.isOn = false; // Initially, the light is off
    }

    @Override
    public void execute() {
        if (isOn) {
            light.turnOff(); // If the light is on, turn it off
        } else {
            light.turnOn(); // If the light is off, turn it on
        }
        isOn = !isOn; // Toggle the state of the light
    }
}
