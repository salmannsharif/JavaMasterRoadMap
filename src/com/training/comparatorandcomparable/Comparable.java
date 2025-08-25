package com.training.comparatorandcomparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Suppose if you want to sort the employees based on their salary
// then you need to implement the Comparable interface
// and override the compareTo() method
// The compareTo() method returns a negative value if the current object is less than the specified object
// The compareTo() method returns a positive value if the current object is greater than the specified object
// The compareTo() method returns 0 if the current object is equal to the specified object


class  Employee implements java.lang.Comparable<Employee> {
    int id;
    String name;
    int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee o) {
//        return this.salary - o.salary; // ascending order

        return o.salary - this.salary; // descending order
    }
}

public class Comparable {
    public static void main(String[] args) {

        Employee employee1 = new Employee(1, "John", 50000);
        Employee employee2 = new Employee(2, "Jane", 60000);
        Employee employee3 = new Employee(3, "Bob", 40000);
        Employee employee4 = new Employee(4, "Alice", 55000);
        Employee employee5 = new Employee(5, "Charlie", 45000);
        List<Employee> employeeList = Arrays.asList(employee1, employee2, employee3, employee4, employee5);
        Collections.sort(employeeList);
        for (Employee employee : employeeList) {
            System.out.println("ID: " + employee.getId() + ", Name: " + employee.getName() + ", Salary: " + employee.getSalary());
        }
    }
}