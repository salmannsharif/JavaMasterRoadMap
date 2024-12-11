package com.training.oops.abstractclass;

// Concrete class for full-time employees
class FullTimeEmployee extends Employee {
    private double monthlySalary;

    // Constructor
    public FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    // Implementation of abstract method
    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}