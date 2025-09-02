package com.training.collectionframework.queue_interface.deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

/**
 * ArrayDeque in Java is a resizable-array implementation of the Deque interface.
 * It's more efficient than Stack when used as a stack, and faster than LinkedList when used as a queue.
 *
 * Key Features:
 * - Implements both Queue and Deque interfaces
 * - No capacity restrictions (grows as needed)
 * - Not thread-safe (for thread-safe operations, use ConcurrentLinkedDeque)
 * - Null elements are not allowed
 * - Faster than Stack and LinkedList when used as a stack or queue
 *
 * When to use:
 * - When you need a double-ended queue (can add/remove from both ends)
 * - When you need a stack implementation (better than Stack class)
 * - When you need a queue implementation (better than LinkedList for single-threaded scenarios)
 * - When you need better performance than LinkedList for queue operations
 *
 * Time Complexity:
 * - Insert/Remove at both ends: O(1) amortized
 * - Search: O(n)
 * - Access: O(1) for head/tail, O(n) for other elements
 */
public class ArrayDequeClass {
    public static void main(String[] args) {
        // 1. Basic Operations
        System.out.println("=== Basic ArrayDeque Operations ===");
        Deque<String> deque = new ArrayDeque<>();

        // Add elements to the end (like a queue)
        deque.offerLast("First");
        deque.offerLast("Second");
        deque.offerLast("Third");

        // Add elements to the front
        deque.offerFirst("Zeroth");

        System.out.println("Deque after adding elements: " + deque);

        // 2. Queue-like operations (FIFO)
        System.out.println("\n=== Queue Operations (FIFO) ===");
        System.out.println("Peek (first element): " + deque.peekFirst()); // Peek at first element
        System.out.println("Poll (remove first): " + deque.pollFirst());  // Remove first element
        System.out.println("Deque after poll: " + deque);

        // 3. Stack-like operations (LIFO)
        System.out.println("\n=== Stack Operations (LIFO) ===");
        deque.push("New First"); // Same as addFirst
        System.out.println("After push (add to front): " + deque);
        System.out.println("Pop (remove from front): " + deque.pop()); // Same as removeFirst
        System.out.println("Deque after pop: " + deque);

        // 4. Iterating through the deque
        System.out.println("\n=== Iterating through ArrayDeque ===");
        System.out.println("Using iterator():");
        Iterator<String> iterator = deque.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\nUsing descendingIterator():");
        Iterator<String> descIterator = deque.descendingIterator();
        while (descIterator.hasNext()) {
            System.out.println(descIterator.next());
        }

        // 5. ArrayDeque as a Stack (better than java.util.Stack)
        System.out.println("\n=== Using ArrayDeque as Stack ===");
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Stack: " + stack);
        System.out.println("Pop: " + stack.pop());
        System.out.println("After pop: " + stack);

        // 6. ArrayDeque vs Other Collections
        System.out.println("\n=== ArrayDeque vs Other Collections ===");
        System.out.println("vs Stack: ArrayDeque is more efficient and should be preferred for stack operations");
        System.out.println("vs LinkedList: ArrayDeque is generally faster for queue operations in single-threaded scenarios");
        System.out.println("vs PriorityQueue: ArrayDeque doesn't support priority ordering");
    }
}

/**
 * Key Differences from Other Collections:
 *
 * 1. ArrayDeque vs Stack:
 *    - Stack is a legacy class, ArrayDeque is the modern replacement
 *    - ArrayDeque is more memory efficient
 *    - ArrayDeque doesn't have the overhead of synchronization
 *
 * 2. ArrayDeque vs LinkedList (when used as Deque):
 *    - ArrayDeque is generally faster for most operations
 *    - ArrayDeque uses less memory (no node objects)
 *    - LinkedList allows null elements, ArrayDeque doesn't
 *    - LinkedList implements List interface, ArrayDeque doesn't
 *
 * 3. ArrayDeque vs PriorityQueue:
 *    - PriorityQueue orders elements according to natural ordering or a Comparator
 *    - ArrayDeque maintains insertion order
 *    - ArrayDeque is generally faster for queue operations
 *
 * Best Practices:
 * - Use ArrayDeque when you need a stack or queue implementation
 * - Prefer ArrayDeque over Stack class
 * - Use ArrayDeque instead of LinkedList when you need better performance in single-threaded environments
 * - Consider ConcurrentLinkedDeque for thread-safe operations
 */