package org.self.designpattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CEO implements Employee {
    List<Employee> employees = new ArrayList<>();
    String name;
    String position;
    public CEO(String name, String position) {
        this.name = name;
        this.position = position;
    }
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
    @Override
    public void showDetails() {
        System.out.println("CEO Name: " + this.name + ", Position: " + this.position);
        for (Employee employee : employees) {
            employee.showDetails();
        }
    }

}
