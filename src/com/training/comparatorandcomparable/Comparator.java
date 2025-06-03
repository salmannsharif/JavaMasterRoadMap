package com.training.comparatorandcomparable;

import java.util.*;

// Employee class without implementing Comparable
class EmployeeClass {
    int id;
    String name;
    int salary;

    public EmployeeClass(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
}

// Comparator to sort by salary
class SalaryComparator implements java.util.Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.getSalary() - e2.getSalary(); // ascending order
    }
}

public class Comparator {
    public static void main(String[] args) {

        Employee employee1 = new Employee(1, "John", 50000);
        Employee employee2 = new Employee(2, "Jane", 60000);
        Employee employee3 = new Employee(3, "Bob", 40000);
        Employee employee4 = new Employee(4, "Alice", 55000);
        Employee employee5 = new Employee(5, "Charlie", 45000);

        List<Employee> employeeList = Arrays.asList(employee1, employee2, employee3, employee4, employee5);

        // Sort by salary using Comparator
        Collections.sort(employeeList, new SalaryComparator());

        for (Employee employee : employeeList) {
            System.out.println("ID: " + employee.getId() + ", Name: " + employee.getName() + ", Salary: " + employee.getSalary());
        }
    }
}
