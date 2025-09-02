package com.training.collectionframework.set_interface.sorted_set;


import java.util.Iterator;
import java.util.TreeSet;

/**
 * “In Java, HashSet, LinkedHashSet, and TreeSet are the main implementations of the Set interface.
 * If we don’t care about the order, we use HashSet.
 * If we want to maintain the insertion order,
 * we use LinkedHashSet. If we need elements to be stored in a sorted order based on Comparable or a custom Comparator, we use TreeSet.
 * A common point among all these is that they don’t allow duplicate elements.”
 */

class Student{
    private int id;
    private String name;
    private int markObtained;

    public Student(int id, String name, int markObtained) {
        this.id = id;
        this.name = name;
        this.markObtained = markObtained;
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

    public int getMarkObtained() {
        return markObtained;
    }

    public void setMarkObtained(int markObtained) {
        this.markObtained = markObtained;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", markObtained=" + markObtained +
                '}';
    }
}

class MyComparator implements java.util.Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getId() == o2.getId()) {
            return 0;
        }else {
            return o2.getMarkObtained() - o1.getMarkObtained();
        }
    }
}

public class TreeSetClass {
    public static void main(String[] args) {

        MyComparator myComparator = new MyComparator();
        TreeSet<Student> treeSet = new TreeSet<Student>(myComparator);

        treeSet.add(new Student(1, "John", 80));
        treeSet.add(new Student(2, "Jane", 90));
        treeSet.add(new Student(2, "Jane", 90));
        treeSet.add(new Student(3, "Bob", 70));
        treeSet.add(new Student(4, "Alice", 85));
        treeSet.add(new Student(5, "Charlie", 75));
        treeSet.add(new Student(5, "Charlie", 75));
        treeSet.add(new Student(6, "David", 95));

        Iterator<Student> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }
}
