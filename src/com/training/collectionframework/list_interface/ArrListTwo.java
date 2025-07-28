package com.training.collectionframework.list_interface;

import java.util.*;
/**
 * * * Custom implementation of ArrayList with basic CRUD operations
 */
class CustomArrayList<T> {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;
    private int size;

    // Default constructor
    public CustomArrayList() {
        this.elements = new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    // Add element to the end of the list
    public void add(T element) {
        ensureCapacity(size + 1);
        elements[size++] = element;
    }

    // Get element by index (O(1) time complexity)
    @SuppressWarnings("unchecked")
    public T get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return (T) elements[index];
    }

    // Remove element by index (O(n) time complexity due to shifting)
    @SuppressWarnings("unchecked")
    public T remove(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        T oldValue = (T) elements[index];
        int numMoved = size - index - 1;
        if (numMoved > 0) {
            System.arraycopy(elements, index + 1, elements, index, numMoved);
        }
        elements[--size] = null; // Help garbage collection
        return oldValue;
    }

    // Get current number of elements
    public int size() {
        return size;
    }

    // Check if list is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Ensure there's enough capacity
    private void ensureCapacity(int minCapacity) {
        if (minCapacity > elements.length) {
            int newCapacity = elements.length * 2;
            elements = Arrays.copyOf(elements, newCapacity);
        }
    }

    @Override
    public String toString() {
        if (size == 0) return "[]";
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size - 1; i++) {
            sb.append(elements[i]).append(", ");
        }
        return sb.append(elements[size - 1]).append("]").toString();
    }
}

/**
 * Main class to demonstrate CustomArrayList usage and compare with other collections
 */
public class ArrListTwo {
    public static void main(String[] args) {
        System.out.println("=== Custom ArrayList Implementation ===\n");
        
        // 1. Basic Usage
        CustomArrayList<String> fruits = new CustomArrayList<>();
        
        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        
        System.out.println("Initial List: " + fruits);
        System.out.println("Element at index 1: " + fruits.get(1));
        
        // Removing elements
        fruits.remove(0);
        System.out.println("After removing first element: " + fruits);
        
        /*
         * ArrayList vs Other Collections:
         * 
         * 1. ArrayList vs LinkedList:
         *    - ArrayList: Fast random access (O(1)), slow add/remove in middle (O(n))
         *    - LinkedList: Slow random access (O(n)), fast add/remove (O(1))
         * 
         * 2. ArrayList vs HashSet:
         *    - ArrayList: Maintains order, allows duplicates
         *    - HashSet: No order, no duplicates, O(1) contains()
         * 
         * 3. ArrayList vs Array:
         *    - ArrayList: Dynamic resizing, more methods, uses more memory
         *    - Array: Better performance for fixed-size collections
         */
         
        // Performance comparison
        System.out.println("\n=== Performance Comparison ===");
        
        // ArrayList is faster for random access
        CustomArrayList<Integer> numbers = new CustomArrayList<>();
        long start = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            numbers.add(i);
        }
        long arrayListGetTime = System.nanoTime();
        numbers.get(50000);
        arrayListGetTime = System.nanoTime() - arrayListGetTime;
        
        System.out.println("Time to get middle element: " + arrayListGetTime + " ns");
        
        /*
         * When to use ArrayList:
         * 1. When you need fast random access to elements
         * 2. When you need to maintain insertion order
         * 3. When you need to allow duplicate elements
         * 4. When you need to frequently iterate over elements
         * 
         * Real-world use cases:
         * 1. Storing and processing database query results
         * 2. Implementing dynamic arrays where size changes
         * 3. When you need to frequently access elements by index
         * 4. When you need to maintain insertion order
         */
    }
}

