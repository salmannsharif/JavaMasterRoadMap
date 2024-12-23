package com.training.oops.abstractclass;

public class MainClass {
    public static void main(String[] args) {
        // Creating objects of subclasses
        Employee fullTimeEmp = new FullTimeEmployee("John Doe", 101, 50000);
        Employee partTimeEmp = new PartTimeEmployee("Jane Smith", 102, 200, 30);

        // Displaying details and salary
        System.out.println("Full-Time Employee:");
        fullTimeEmp.displayDetails();
        System.out.println("Salary: " + fullTimeEmp.calculateSalary());

        System.out.println("\nPart-Time Employee:");
        partTimeEmp.displayDetails();
        System.out.println("Salary: " + partTimeEmp.calculateSalary());
    }
}