package com.training.collectionframework.queue_interface;

import java.util.PriorityQueue;

// A simple class that is NOT Comparable
class NonComparableItem {
    private String name;
    private int value;

    public NonComparableItem(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() { return name; }
    public int getValue() { return value; }

    @Override
    public String toString() {
        return name + "(" + value + ")";
    }
}

// A class that IS Comparable
class ComparableItem implements Comparable<ComparableItem> {
    private String name;
    private int value;

    public ComparableItem(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() { return name; }
    public int getValue() { return value; }

    @Override
    public int compareTo(ComparableItem other) {
        return Integer.compare(this.value, other.value);
    }

    @Override
    public String toString() {
        return name + "(" + value + ")";
    }
}

public class PriorityQueueDemo {
    public static void main(String[] args) {
        System.out.println("=== Demonstrating ClassCastException with Non-Comparable Elements ===");

        try {
            // Create a PriorityQueue without explicit comparator
            PriorityQueue<NonComparableItem> nonComparableQueue = new PriorityQueue<>();

            // Add non-comparable elements - this will compile fine
            nonComparableQueue.add(new NonComparableItem("ItemA", 5));
            nonComparableQueue.add(new NonComparableItem("ItemB", 3));
            nonComparableQueue.add(new NonComparableItem("ItemC", 7));

            System.out.println("Elements added successfully...");

            // The exception occurs when we try to access elements
            // because the queue needs to compare elements to maintain order
            System.out.println("Polling first element: " + nonComparableQueue.poll());

        } catch (ClassCastException e) {
            System.out.println("ClassCastException caught: " + e.getMessage());
            e.printStackTrace();
        }

        System.out.println("\n=== Working Example with Comparable Elements ===");

        try {
            // Create a PriorityQueue with comparable elements
            PriorityQueue<ComparableItem> comparableQueue = new PriorityQueue<>();

            comparableQueue.add(new ComparableItem("ItemA", 5));
            comparableQueue.add(new ComparableItem("ItemB", 3));
            comparableQueue.add(new ComparableItem("ItemC", 7));

            System.out.println("Polling elements in order:");
            while (!comparableQueue.isEmpty()) {
                System.out.println(comparableQueue.poll());
            }

        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("\n=== Alternative: Using Comparator with Non-Comparable Elements ===");

        try {
            // We can use a PriorityQueue with a custom Comparator
            // even for non-comparable elements
            PriorityQueue<NonComparableItem> queueWithComparator = new PriorityQueue<>(
                    (item1, item2) -> Integer.compare(item1.getValue(), item2.getValue())
            );

            queueWithComparator.add(new NonComparableItem("ItemA", 5));
            queueWithComparator.add(new NonComparableItem("ItemB", 3));
            queueWithComparator.add(new NonComparableItem("ItemC", 7));

            System.out.println("Polling elements using custom comparator:");
            while (!queueWithComparator.isEmpty()) {
                System.out.println(queueWithComparator.poll());
            }

        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}