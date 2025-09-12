package com.training.collectionframework.list_interface.linkedList;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * LinkedListArr demonstrates the usage of LinkedList in Java and its key characteristics.
 *
 * LinkedList is a linear data structure where elements are not stored in contiguous memory locations.
 * Each element (node) contains a data part and an address/reference to the next node in the sequence.
 *
 * Key Characteristics:
 * 1. Implements both List and Deque interfaces
 * 2. Uses doubly-linked list internally
 * 3. Non-synchronized (not thread-safe)
 * 4. Allows null elements
 * 5. Maintains insertion order
 *
 * When to use LinkedList over ArrayList:
 * - Frequent insertion/deletion operations (O(1) time for add/remove at head/tail)
 * - When memory allocation flexibility is needed
 * - When implementing queues or double-ended queues (Deque)
 * - When you need to implement custom data structures like stacks or queues
 *
 * When NOT to use LinkedList:
 * - When you need fast random access (get/set operations are O(n))
 * - Memory is a concern (extra memory for node references)
 * - When working with primitive types (LinkedList uses more memory due to object overhead)
 */
public class LinkedListArr {

    public static void main(String[] args) {
        // Creating a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // 1. Adding elements - O(1) for adding at end/beginning
        linkedList.add("First");      // Adds to the end
        linkedList.addFirst("Zeroth"); // Adds to the beginning
        linkedList.addLast("Last");    // Adds to the end (same as add())
        linkedList.add(1, "Second");   // Adds at specific position

        System.out.println("LinkedList after additions: " + linkedList);

        // 2. Accessing elements
        // Getting first and last elements is O(1)
        System.out.println("First element: " + linkedList.getFirst());
        System.out.println("Last element: " + linkedList.getLast());

        // Getting element by index is O(n) as it needs to traverse the list
        System.out.println("Element at index 2: " + linkedList.get(2));

        // 3. Removing elements - O(1) for first/last, O(n) for specific element/index
        linkedList.removeFirst();  // Removes first element
        linkedList.removeLast();   // Removes last element
        linkedList.remove("Second"); // Removes specific element

        System.out.println("LinkedList after removals: " + linkedList);

        // 4. LinkedList as Deque (Double Ended Queue)
        linkedList.offer("New First");  // Adds to the end
        linkedList.offerFirst("New Zeroth"); // Adds to the beginning
        System.out.println("LinkedList after Deque operations: " + linkedList);

        // 5. Performance comparison with ArrayList
        // LinkedList is better when:
        // - Frequent add/remove operations in the middle of the list
        // - Implementing queues/stacks
        // - Memory allocation flexibility is needed

        // ArrayList is better when:
        // - Frequent random access by index is needed
        // - Memory usage needs to be optimized
        // - Working with primitive types (consider using primitive collections)

        // Example: Adding 100,000 elements at the beginning
        long startTime = System.nanoTime();
        LinkedList<Integer> ll = new LinkedList<>();
        for (int i = 0; i < 100000; i++) {
            ll.addFirst(i);  // Fast in LinkedList (O(1))
        }
        long endTime = System.nanoTime();
        System.out.println("Time to add 100,000 elements at beginning (LinkedList): "
            + (endTime - startTime) / 1_000_000 + " ms");

        // 6. Common methods
        System.out.println("Size: " + linkedList.size());
        System.out.println("Contains 'New First': " + linkedList.contains("New First"));
        System.out.println("Index of 'New First': " + linkedList.indexOf("New First"));

        // 7. Iterating through LinkedList (using for-each loop)
        System.out.print("Iterating through LinkedList: ");
        for (String item : linkedList) {
            System.out.print(item + " ");
        }
        System.out.println();

        // Backward traversal
        Iterator<String> iterator = linkedList.descendingIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next()+ " ");
        }

        // 8. Comparison with other collections
        System.out.println("\n=== LinkedList vs Other Collections ===");

        /*
         * 1. LinkedList vs ArrayList:
         *    - Memory: LinkedList uses more memory (stores two references per node)
         *    - Access: ArrayList is faster for random access (O(1) vs O(n))
         *    - Insertion/Deletion: LinkedList is faster for operations at beginning/middle (O(1) vs O(n))
         *    - Memory Allocation: ArrayList needs contiguous memory, LinkedList doesn't
         *    - Use ArrayList when: You need fast random access and infrequent modifications
         *    - Use LinkedList when: You have frequent insertions/deletions and mostly sequential access
         */

        /*
         * 2. LinkedList vs ArrayDeque:
         *    - Both implement Deque interface
         *    - Memory: ArrayDeque uses less memory (no node overhead)
         *    - Performance: ArrayDeque is generally faster for queue operations
         *    - Nulls: ArrayDeque doesn't allow null elements, LinkedList does
         *    - Use ArrayDeque when: You need a queue/stack and don't need List operations
         *    - Use LinkedList when: You need List operations or null elements
         */

        /*
         * 3. LinkedList vs HashSet:
         *    - Ordering: LinkedList maintains insertion order, HashSet doesn't
         *    - Uniqueness: HashSet doesn't allow duplicates, LinkedList does
         *    - Performance: HashSet has O(1) contains(), LinkedList has O(n)
         *    - Use HashSet when: You need fast lookups and don't care about order
         *    - Use LinkedList when: You need to maintain insertion order and allow duplicates
         */

        /*
         * 4. LinkedList vs TreeSet:
         *    - Ordering: TreeSet maintains sorted order, LinkedList maintains insertion order
         *    - Performance: TreeSet has O(log n) for add/remove/contains
         *    - Uniqueness: TreeSet doesn't allow duplicates
         *    - Use TreeSet when: You need elements in sorted order and fast lookups
         *    - Use LinkedList when: You need to maintain insertion order and allow duplicates
         */

        /*
         * 5. LinkedList vs LinkedHashSet:
         *    - Both maintain insertion order
         *    - Uniqueness: LinkedHashSet doesn't allow duplicates
         *    - Performance: Similar for iteration, but LinkedHashSet has better contains()
         *    - Use LinkedHashSet when: You need to maintain insertion order with unique elements
         *    - Use LinkedList when: You need to maintain insertion order and allow duplicates
         */

        /*
         * 6. LinkedList vs Vector/Stack:
         *    - Thread-safety: Vector/Stack are synchronized, LinkedList is not
         *    - Performance: LinkedList is generally faster in single-threaded scenarios
         *    - Use Vector/Stack when: You need thread-safety
         *    - Use LinkedList when: You don't need thread-safety or need better performance
         */

        /*
        ArrayList (Random Access - Fast 🚀)
        An ArrayList is built on top of a Java array. The elements are stored in contiguous (adjacent) memory blocks.

        To get the element at index i: The JVM can calculate its exact memory address instantly using a simple formula:
        memory_address = start_address + (i * size_of_each_element)

        This is called constant time access or O(1) complexity.
        It's extremely fast and takes the same amount of time to get the first element or the millionth element.

        LinkedList (Sequential Access - Slow 🐢)
        A LinkedList is a chain of nodes. Each node contains
        the element and a pointer/reference to the next node (and often the previous node, for a doubly-linked list).
        The nodes are scattered throughout memory.

        To get the element at index i: The JVM has to start at the first node
        (the head) and literally "walk" or "traverse" the chain of i nodes,
         one by one, until it reaches the desired node.

        This is called linear time access or O(n) complexity.
        To get the last element of a list with 1,000,000 elements, it must traverse all 1,000,000 nodes.

         */
    }
}
