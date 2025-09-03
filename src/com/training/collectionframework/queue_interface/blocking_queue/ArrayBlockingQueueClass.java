package com.training.collectionframework.queue_interface.blocking_queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * ArrayBlockingQueue is a bounded, blocking queue that stores elements in an array.
 * It's part of Java's java.util.concurrent package and implements the BlockingQueue interface.
 *
 * Key Features:
 * - Bounded capacity (must be specified at creation)
 * - Thread-safe (internally uses ReentrantLock)
 * - FIFO (First-In-First-Out) ordering
 * - Optional fairness policy for ordering of waiting producer and consumer threads
 * - Supports operations that wait for the queue to become non-empty when retrieving an element
 *   and wait for space to become available when storing an element
 *
 * When to use:
 * - When you need a thread-safe, bounded blocking queue
 * - In producer-consumer scenarios with multiple threads
 * - When you need to limit the memory usage of your queue
 * - When you need blocking operations (put/take) that wait for space/elements
 *
 * Time Complexity:
 * - Insert/Remove: O(1)
 * - Search: O(n)
 * - Access: O(1) for head/tail, O(n) for other elements
 */
public class ArrayBlockingQueueClass {
    public static void main(String[] args) throws InterruptedException {
        // 1. Basic Operations
        System.out.println("=== Basic ArrayBlockingQueue Operations ===");
        BlockingQueue<String> queue = new ArrayBlockingQueue<>(5); // Bounded to 5 elements

        // Add elements (throws IllegalStateException if full)
        queue.add("First");
        queue.offer("Second"); // Returns false if queue is full
        queue.put("Third"); // Blocks if queue is full

        System.out.println("Queue after adding elements: " + queue);
        System.out.println("Queue size: " + queue.size() + "/" + queue.remainingCapacity());

        // 2. Blocking operations
        System.out.println("\n=== Blocking Operations ===");
        // Try to add with timeout (waits up to 2 seconds)
        boolean added = queue.offer("Fourth", 2, TimeUnit.SECONDS);
        System.out.println("Element added with timeout: " + added);

        // Producer thread
        new Thread(() -> {
            try {
                // This will block until space is available
                queue.put("Fifth");
                System.out.println("Added Fifth to queue");
                queue.put("Sixth"); // This will block until space is available
                System.out.println("Added Sixth to queue");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }).start();

        // 3. Consumer operations
        System.out.println("\n=== Consumer Operations ===");
        System.out.println("Peek (without removal): " + queue.peek());
        System.out.println("Element (without removal): " + queue.element());

        // Remove elements
        System.out.println("Poll (removes head): " + queue.poll());
        System.out.println("Take (blocks if empty): " + queue.take());

        // Try to remove with timeout
        String item = queue.poll(1, TimeUnit.SECONDS);
        System.out.println("Poll with timeout: " + item);

        // 4. Drain operations
        System.out.println("\n=== Drain Operations ===");
        queue.drainTo(java.util.Collections.singleton("Seventh"));
        System.out.println("Queue after drain: " + queue);

        // 5. Clear and check
        queue.clear();
        System.out.println("Queue after clear - Empty? " + queue.isEmpty());

        // 6. Producer-Consumer Example
        System.out.println("\n=== Producer-Consumer Example ===");
        BlockingQueue<Integer> sharedQueue = new ArrayBlockingQueue<>(3);

        // Producer
        new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                try {
                    sharedQueue.put(i);
                    System.out.println("Produced: " + i);
                    Thread.sleep(500); // Simulate work
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }).start();

        // Consumer
        new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                try {
                    int num = sharedQueue.take();
                    System.out.println("Consumed: " + num);
                    Thread.sleep(1000); // Simulate work
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }).start();
    }
}

/**
 * Key Differences from Other Queue Implementations:
 *
 * 1. ArrayBlockingQueue vs LinkedList:
 *    - ArrayBlockingQueue is bounded, LinkedList is unbounded
 *    - ArrayBlockingQueue is thread-safe, LinkedList is not
 *    - ArrayBlockingQueue has better performance in concurrent scenarios
 *
 * 2. ArrayBlockingQueue vs LinkedBlockingQueue:
 *    - ArrayBlockingQueue uses a fixed-size array, LinkedBlockingQueue uses linked nodes
 *    - ArrayBlockingQueue has better memory locality
 *    - LinkedBlockingQueue can be optionally bounded
 *
 * 3. ArrayBlockingQueue vs PriorityBlockingQueue:
 *    - ArrayBlockingQueue is FIFO, PriorityBlockingQueue orders by priority
 *    - ArrayBlockingQueue has better performance for FIFO scenarios
 *
 * Best Practices:
 * - Always specify an appropriate capacity based on your memory constraints
 * - Consider using offer()/poll() with timeouts for better responsiveness
 * - Use put()/take() when you need to block until the operation can succeed
 * - Consider using drainTo() for batch operations to improve performance
 * - For fair ordering, use the constructor with the fairness parameter set to true if needed
 *
 * Common Use Cases:
 * - Thread pools (like ExecutorService)
 * - Producer-consumer patterns
 * - Task scheduling
 * - Message passing between threads
 */