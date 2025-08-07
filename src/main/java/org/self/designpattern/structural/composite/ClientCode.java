package org.self.designpattern.structural.composite;

public class ClientCode {
    public static void main(String[] args) {
        Employee manager = new Manager("Alice", "Project Manager");
        Employee developer = new Developer("Bob", "Software Engineer");
        Employee intern = new Developer("Charlie", "Intern"); // Assuming intern is also a type of Developer

        // You can create a composite structure if needed, e.g., a team of employees
        CEO team = new CEO("Donar", "CEO");
        team.addEmployee(manager);
        team.addEmployee(developer);
        team.addEmployee(intern);
        team.showDetails();

    }
}
