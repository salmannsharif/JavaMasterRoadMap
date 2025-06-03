package com.training.oops.abstractclass;

public class MainClass {

    /**
     * Abstraction is the process of hiding the implementation details and exposing only the necessary information to the user.
     -> Like in computer science abstraction is the process of separating ideas from their actions
     -> Yes, Abstraction is used to separate ideas from their implementation.
     -> Abstraction in java is used to define only ideas in one class so that the ideas can be implemented by
        different Sub classes according to the requirement.*/



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