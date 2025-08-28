package com.training.collectionframework.queue_interface;


import java.util.Comparator;
import java.util.PriorityQueue;

/** PriorityQueue in Java
 *
Definition: A PriorityQueue is a special type of queue where elements are ordered based on their priority,
            not strictly on First-In-First-Out (FIFO) order.
Ordering:
    - > If you provide a Comparator while creating it → elements are ordered according to that Comparator.
    - > If no Comparator is provided → elements are ordered in their natural order (ascending by default,
        since they must be Comparable).

Priority Rule:
    - > The element with the highest priority comes to the front,
        and the element with the lowest priority goes to the back.

Restrictions:
     - > null elements are not allowed.

     - > Elements must be Comparable (or you must provide a Comparator).
        Otherwise, inserting non-comparable elements causes a ClassCastException.

Use Cases:
    - >Ordering employees by salary (ascending or descending).
        Ordering customers by ID.

Hierarchy:

    PriorityQueue → extends AbstractQueue → implements Queue.

    It also implements the marker interface Serializable. */


class Employee{

    private String name;
    private int salary;

    Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
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
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

class MyComparator implements Comparator<Employee>{
    @Override
    public int compare(Employee o1, Employee o2) {
        return o2.getSalary() - o1.getSalary();
    }
}

public class PriorityQueueClass {
    public static void main(String[] args) {

        PriorityQueue<Employee> priorityQueue = new PriorityQueue<Employee>(7, new MyComparator());

        priorityQueue.add(new Employee("John", 50000));
        priorityQueue.add(new Employee("Jane", 60000));
        priorityQueue.add(new Employee("Bob", 40000));
        priorityQueue.add(new Employee("Alice", 55000));
        priorityQueue.add(new Employee("Charlie", 45000));

        for (Employee employee : priorityQueue) {
            System.out.println(employee);
        }


    }
}
