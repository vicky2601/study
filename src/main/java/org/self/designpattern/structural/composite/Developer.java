package org.self.designpattern.structural.composite;

public class Developer implements Employee {
    private final String name;
    private final String position;
    public Developer(String name, String position) {
        this.name = name;
        this.position = position;
    }
    @Override
    public void showDetails() {
        System.out.println("Developer Name: " + this.name + ", Position: " + this.position);
    }
}
