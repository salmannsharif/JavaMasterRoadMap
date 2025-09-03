package com.training.collectionframework.queue_interface.blocking_queue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * LinkedBlockingQueue is an optionally-bounded, blocking queue that stores elements as linked nodes.
 * It's part of Java's java.util.concurrent package and implements the BlockingQueue interface.
 *
 * Key Features:
 * - Optional bounded capacity (unbounded by default)
 * - Thread-safe (internally uses two ReentrantLocks for put and take operations)
 * - FIFO (First-In-First-Out) ordering
 * - Higher throughput than ArrayBlockingQueue in most concurrent applications
 * - Better performance than ArrayBlockingQueue with multiple producers/consumers
 *
 * When to use:
 * - When you need a thread-safe blocking queue
 * - In high-concurrency producer-consumer scenarios
 * - When you need better performance than ArrayBlockingQueue with multiple threads
 * - When you need an optionally bounded blocking queue
 *
 * Time Complexity:
 * - Insert/Remove: O(1)
 * - Search: O(n)
 * - Access: O(1) for head/tail, O(n) for other elements
 */
public class LinkedBlockingQueueClass {
    public static void main(String[] args) throws InterruptedException {
        // 1. Basic Operations
        System.out.println("=== Basic LinkedBlockingQueue Operations ===");
        // Unbounded queue
        BlockingQueue<String> unboundedQueue = new LinkedBlockingQueue<>();

        // Bounded queue with capacity of 3
        BlockingQueue<String> queue = new LinkedBlockingQueue<>(3);

        // Add elements
        System.out.println("Adding elements to queue...");
        queue.put("First");
        queue.offer("Second");
        boolean added = queue.offer("Third", 1, TimeUnit.SECONDS);
        System.out.println("Third element added: " + added);

        System.out.println("Queue: " + queue);
        System.out.println("Queue size: " + queue.size() + "/" +
                (queue.remainingCapacity() + queue.size()));

        // 2. Blocking operations
        System.out.println("\n=== Blocking Operations ===");
        new Thread(() -> {
            try {
                // This will block until space is available
                queue.put("Fourth");
                System.out.println("Added Fourth to queue");
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

        // 4. Drain operations
        System.out.println("\n=== Drain Operations ===");
        queue.drainTo(java.util.Collections.singleton("Fifth"));
        System.out.println("Queue after drain: " + queue);

        // 5. Producer-Consumer Example with multiple producers/consumers
        System.out.println("\n=== Multiple Producers-Consumers Example ===");
        BlockingQueue<Integer> sharedQueue = new LinkedBlockingQueue<>(5);

        // Multiple Producers
        for (int i = 0; i < 2; i++) {
            final int producerId = i + 1;
            new Thread(() -> {
                for (int j = 1; j <= 3; j++) {
                    try {
                        int item = producerId * 100 + j;
                        sharedQueue.put(item);
                        System.out.println("Producer " + producerId + " produced: " + item);
                        Thread.sleep(300); // Simulate work
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }).start();
        }

        // Multiple Consumers
        for (int i = 0; i < 3; i++) {
            final int consumerId = i + 1;
            new Thread(() -> {
                while (true) {
                    try {
                        Integer item = sharedQueue.poll(1, TimeUnit.SECONDS);
                        if (item == null) break; // No more items to process
                        System.out.println("Consumer " + consumerId + " consumed: " + item);
                        Thread.sleep(500); // Simulate work
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        break;
                    }
                }
            }).start();
        }

        // 6. Using as an unbounded queue
        System.out.println("\n=== Unbounded Queue Example ===");
        BlockingQueue<String> unbounded = new LinkedBlockingQueue<>();
        // Can keep adding elements until memory runs out
        for (int i = 0; i < 5; i++) {
            unbounded.offer("Item " + (i + 1));
        }
        System.out.println("Unbounded queue size: " + unbounded.size());
    }
}

/**
 * Key Differences from Other Queue Implementations:
 *
 * 1. LinkedBlockingQueue vs ArrayBlockingQueue:
 *    - LinkedBlockingQueue has higher throughput in most concurrent scenarios
 *    - LinkedBlockingQueue uses less memory per element (no array storage overhead)
 *    - ArrayBlockingQueue has better memory locality
 *    - LinkedBlockingQueue can be unbounded
 *
 * 2. LinkedBlockingQueue vs ConcurrentLinkedQueue:
 *    - LinkedBlockingQueue is blocking (supports wait/notify)
 *    - ConcurrentLinkedQueue is non-blocking and lock-free
 *    - LinkedBlockingQueue has better throughput under high contention
 *
 * 3. LinkedBlockingQueue vs PriorityBlockingQueue:
 *    - LinkedBlockingQueue is FIFO, PriorityBlockingQueue orders by priority
 *    - LinkedBlockingQueue is generally faster for FIFO scenarios
 *
 * Best Practices:
 * - Specify a capacity to prevent unbounded growth unless truly needed
 * - Use put()/take() for blocking operations
 * - Use offer()/poll() with timeouts for better responsiveness
 * - Consider using drainTo() for batch processing
 * - For high-throughput scenarios, prefer over ArrayBlockingQueue
 *
 * Common Use Cases:
 * - Thread pools (like ExecutorService)
 * - High-concurrency producer-consumer patterns
 * - Task scheduling systems
 * - Message passing between threads in concurrent applications
 * - Implementing backpressure in streaming applications
 */