package com.training.interview_preparation;

public class InterviewPreparationQuestions {

    // https://chat.deepseek.com/a/chat/s/4631af9c-e0a6-4d59-ad15-28255340337a

    void AboutPayFiniaProject(){
        /**
         * "In my previous role, I contributed to the development of Payfinia’s Instant Payment Xchange (IPX),
         * a robust payment solution that enables banks and fintech companies to process instant transactions
         * using the Federal Reserve’s FedNow® service. I worked on building and integrating APIs using Spring Boot,
         * ensuring seamless connectivity between banking systems, the FedNow® network, and end-user applications.
         * My responsibilities included implementing secure transaction workflows,
         * fraud prevention mechanisms like OFAC(Office Foreign Asset Control)/AML(Anti Money Laundering)
         * screening and transaction limits,
         * and optimizing the system for real-time performance. This project gave me hands-on experience with ISO 20022 standards,
         * open API development, and collaboration with core banking systems like XP2 and Fiserv DNA,
         * all while delivering a scalable and secure solution for instant payments."
         *
         */
    }


    void collectionFrameworkQuestions(){
        /**
         * Question 1: Which collection is best for frequently searching for elements by their value?
         *
         *  HashSet and HashMap. Since these collections internally use a hash table—I mean a bucket array—when we store elements,
         *  the hash code of the key is calculated to get the index of the bucket.
         *  It's stored as a node object in a linked list if a collision occurs.
         *  First, it checks if the keys are the same; if they are the same, the old value is replaced with the new one.
         *  When we fetch data from these collections, it takes constant time O(1),
         *  because it directly calculates the hash code and retrieves the data from the bucket
         *
         */

        /**
         * Question 2: Which collection would you choose if you need to frequently add new elements at the very beginning of a large list?
         *
         * "For this scenario, I would choose a LinkedList.
         * The reason is its underlying structure: it's built from nodes that have pointers to the next element."
         *
         * "Adding to the beginning is a constant-time O(1) operation.
         * It just involves creating a new node and updating the 'head' pointer,
         * which is very fast no matter how large the list is."
         *
         * "In contrast, an ArrayList would be a poor choice. Since it's built on a flat array,
         * inserting at the start requires shifting every single existing element one position to the right to make space.
         * This shifting operation becomes very slow O(n) for a large list."
         */

        /**
         * Question 3: Which collection would you use if you need to store unique elements
         *             and always iterate over them in the exact order they were inserted?
         *
         * For this, I would use a LinkedHashSet. It keeps all the benefits of a HashSet—like storing
         * unique elements with O(1) lookups—but it also maintains a separate linked list running through
         * all entries to remember the exact order in which they were inserted."
         *
         * "So, when I iterate over it,
         * I get the elements back in the same order I added them, which a regular HashSet does not guarantee.
         */


        /**
         * Question 4: You need to store key-value pairs where the keys must be sorted in their natural
         *              order (e.g., alphabetical, numerical). Which collection is the best choice?
         *
         * For this, I would choose a TreeMap. It gives the benefit of a HashMap,
         * which is used to store key-value pairs, as well as sorting the keys.
         * If we don't pass a custom Comparator, it will use the natural ascending order of the keys
         *
         */


        /**
         * Question 5: You need a collection that functions like a real-world queue (first-in, first-out).
         *             Which Java collection interface would you use, and what is a good implementing class for it?
         *
         * I would use the Queue interface. For a strict FIFO queue,
         * a good implementing class is ArrayDeque (or LinkedList).
         * ArrayDeque is more efficient for a high-volume queue as it's based on a resizable array.
         */


        /**
         * Question 6: You need to frequently remove elements from the middle of a very large list.
         *             Which collection should you avoid at all costs, and which one would be a slightly better choice?
         *
         *  I would use a LinkedList. Removing an element from the middle is an O(1) operation
         *      once you have found the node, as it only requires updating the pointers of the adjacent nodes.
         *
         *  I would avoid ArrayList because removing an element requires shifting all subsequent
         *      elements to fill the gap, which is an O(n) operation and very slow for a large list
         *
         */

        /**
         * Question 7: You need a thread-safe version of the classic key-value collection.
         * Which legacy Java collection would you consider, and what is a more modern alternative?
         *
         * I would consider the legacy Hashtable class, as it is thread-safe. Only one thread can access it at a time. It also does not allow null keys or values."
         *
         * "A more modern alternative is the ConcurrentHashMap from the java.util.concurrent package.
         * It provides better performance by allowing multiple threads to read and write concurrently
         * without full locking, and it also supports null values.
         *
         */

        /**
         * Question 8: You want to store a list of elements, but you need to access them by both index
         * and also perform frequent searches for values. What is the major trade-off you must consider?
         *
         *
         * There's no single perfect collection for this. If I use an ArrayList, accessing by index is fast O(1),
         * but searching for a value is slow O(n) because it requires a linear scan."
         *
         * "If I use a HashSet, searching for a value is fast O(1), but I lose the ability to access elements
         * by index entirely."
         *
         * "The trade-off is between fast index access and fast value search.
         * I have to choose the collection based on which operation is more frequent in my use case
         *
         */

        /**
         * Question 9: You need to store a collection of elements where duplicates are allowed and
         * the order of insertion must be preserved. Which List implementation is the most efficient for this?
         *
         * Yes, ArrayList is the most efficient and common choice for this.
         * It preserves insertion order by its index-based nature and allows duplicates.
         *
         * It's more memory-efficient and has faster iteration speed than a LinkedList for this typical use case,
         * making it the default go-to implementation for a List.
         */

        /**
         * Question 10: You need to implement a cache that evicts the least recently used (LRU) item
         * when it becomes full. Which collection in Java is specifically designed for this access-order behavior?
         *
         * LinkedHashMap is the perfect choice.
         *
         * It is specifically designed for this. When you create it with accessOrder = true,
         * it automatically maintains the elements in the order they were last accessed (by get() or put()).
         *
         * The least recently used (LRU) item moves to the front of this internal list,
         * so when the cache is full, you can easily remove the front element to evict the LRU item.
         *
         */

        /**
         * Question 11: You need to process elements in a collection based on a priority (e.g., highest value first),
         * rather than insertion order. Which collection should you use?
         *
         * PriorityQueue is the right choice. It is designed to always processes the element with
         * the highest priority (or lowest, based on your sorting order) first,
         * rather than in FIFO or insertion order.
         *
         * It internally uses a heap data structure, which makes adding elements and removing
         * the highest-priority one very efficient (O(log n) time).
         */


        /**
         * Question 12: You need a resizable array-like structure that is thread-safe for use in a
         * multi-threaded environment. Which legacy collection class would you use,
         * and what is a key drawback of using it?
         *
         * For this I would choose vector class the only drawback
         * is it is thread safe So that this issue leads to Performance issue
         * since each threads needs to wait for another thread to finish
         */


    }



}
