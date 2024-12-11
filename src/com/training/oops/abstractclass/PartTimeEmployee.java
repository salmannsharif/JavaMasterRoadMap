package com.training.oops.abstractclass;

// Concrete class for part-time employees
class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    // Constructor
    public PartTimeEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    // Implementation of abstract method
    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}
