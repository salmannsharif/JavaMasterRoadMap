package com.training.collectionframework.size_of_collection;

public class DefaultSizeOfCollection {
    /*
    🔹 1. List Implementations
    Collection	Default Initial Size	Growth Policy
    ArrayList	10	When full, grows by newCapacity = oldCapacity + (oldCapacity >> 1) → i.e. 1.5x
    LinkedList	0 (empty, no array inside)	Doubly-linked list → grows dynamically, no resizing array
    Vector	    10	Doubles size (2x) when full
    Stack (extends Vector)	10	Same as Vector (2x growth)

🔹 2. Set Implementations
    Collection	Default Initial Size	Growth Policy
    HashSet	16 (via HashMap)	Doubles when load factor (0.75) exceeded
    LinkedHashSet	16 (via LinkedHashMap)	Same as HashSet (doubles)
    TreeSet	0	Backed by TreeMap → grows dynamically, no fixed array

🔹 3. Map Implementations
    Collection	Default Initial Size	Growth Policy
    HashMap	16	Doubles when load factor (0.75) exceeded
    LinkedHashMap	16	Same as HashMap
    Hashtable	11	Grows by newCap = oldCap * 2 + 1
    TreeMap	0	Red-Black tree → grows dynamically

🔹 4. Queue / Deque Implementations
    Collection	Default Initial Size	Growth Policy
    PriorityQueue	11	Grows by newCap = oldCap + (oldCap >> 1) → 1.5x
    ArrayDeque	16	Doubles when full
    LinkedList (as Queue/Deque)	0	Linked list → grows dynamically

🔹 5. Concurrent Collections
    Collection	Default Initial Size	Growth Policy
    ConcurrentHashMap	16	Doubles when load factor (0.75) exceeded
    CopyOnWriteArrayList	0	Grows by creating a new array (1.5x like ArrayList)
    CopyOnWriteArraySet	0	Same as CopyOnWriteArrayList (backed by it) */

}
