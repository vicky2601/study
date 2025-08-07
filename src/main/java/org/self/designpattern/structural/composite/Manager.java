package org.self.designpattern.structural.composite;

public class Manager implements Employee {

    String name;
    String position;

    public Manager(String name, String position) {
        this.name = name;
        this.position = position;
    }
    @Override
    public void showDetails() {
        System.out.println("Manager Name: " + this.name + ", Position: " + this.position);
    }
}
