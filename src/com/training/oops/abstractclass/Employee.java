package com.training.oops.abstractclass;

// Abstract class to represent a generic employee
abstract class Employee {
    private String name;
    private int id;

    // Constructor
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Common method
    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
    }

    // Abstract method for salary calculation
    public abstract double calculateSalary();
}