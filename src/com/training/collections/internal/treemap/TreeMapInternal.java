package com.training.collections.internal.treemap;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * A simplified version of TreeMap that demonstrates how it internally works
 * using a Red-Black tree structure.
 */
public class TreeMapInternal<K, V> implements Iterable<TreeMapInternal.Entry<K, V>> {
    
    private static final boolean RED   = false;
    private static final boolean BLACK = true;
    
    private Entry<K, V> root;
    private int size = 0;
    private final Comparator<? super K> comparator;
    
    /**
     * Node type for the TreeMap.
     */
    static final class Entry<K, V> {
        K key;
        V value;
        Entry<K, V> left;
        Entry<K, V> right;
        Entry<K, V> parent;
        boolean color = BLACK;
        
        Entry(K key, V value, Entry<K, V> parent) {
            this.key = key;
            this.value = value;
            this.parent = parent;
        }
        
        public K getKey() {
            return key;
        }
        
        public V getValue() {
            return value;
        }
        
        public V setValue(V value) {
            V oldValue = this.value;
            this.value = value;
            return oldValue;
        }
        
        @Override
        public String toString() {
            return key + "=" + value;
        }
    }
    
    /**
     * Constructs a new, empty tree map using the natural ordering of its keys.
     */
    public TreeMapInternal() {
        comparator = null;
    }
    
    /**
     * Constructs a new, empty tree map, ordered according to the given comparator.
     */
    public TreeMapInternal(Comparator<? super K> comparator) {
        this.comparator = comparator;
    }
    
    /**
     * Returns the number of key-value mappings in this map.
     */
    public int size() {
        return size;
    }
    
    /**
     * Associates the specified value with the specified key in this map.
     */
    public V put(K key, V value) {
        Entry<K, V> t = root;
        
        if (t == null) {
            compare(key, key); // Type (and possibly null) check
            root = new Entry<>(key, value, null);
            size = 1;
            return null;
        }
        
        int cmp;
        Entry<K, V> parent;
        
        // Split comparator and comparable paths
        Comparator<? super K> cpr = comparator;
        if (cpr != null) {
            do {
                parent = t;
                cmp = cpr.compare(key, t.key);
                if (cmp < 0) {
                    t = t.left;
                } else if (cmp > 0) {
                    t = t.right;
                } else {
                    return t.setValue(value);
                }
            } while (t != null);
        } else {
            if (key == null) {
                throw new NullPointerException();
            }
            @SuppressWarnings("unchecked")
            Comparable<? super K> k = (Comparable<? super K>) key;
            do {
                parent = t;
                cmp = k.compareTo(t.key);
                if (cmp < 0) {
                    t = t.left;
                } else if (cmp > 0) {
                    t = t.right;
                } else {
                    return t.setValue(value);
                }
            } while (t != null);
        }
        
        Entry<K, V> e = new Entry<>(key, value, parent);
        if (cmp < 0) {
            parent.left = e;
        } else {
            parent.right = e;
        }
        
        // Fix Red-Black tree properties
        fixAfterInsertion(e);
        size++;
        return null;
    }
    
    /**
     * Returns the value to which the specified key is mapped, or null if this map contains no mapping for the key.
     */
    public V get(Object key) {
        Entry<K, V> p = getEntry(key);
        return (p == null ? null : p.value);
    }
    
    /**
     * Returns this map's entry for the given key, or null if the map does not contain an entry for the key.
     */
    final Entry<K, V> getEntry(Object key) {
        // Offload comparator-based version for sake of performance
        if (comparator != null) {
            return getEntryUsingComparator(key);
        }
        if (key == null) {
            throw new NullPointerException();
        }
        @SuppressWarnings("unchecked")
        Comparable<? super K> k = (Comparable<? super K>) key;
        Entry<K, V> p = root;
        while (p != null) {
            int cmp = k.compareTo(p.key);
            if (cmp < 0) {
                p = p.left;
            } else if (cmp > 0) {
                p = p.right;
            } else {
                return p;
            }
        }
        return null;
    }
    
    /**
     * Version of getEntry using comparator. Split off from getEntry for performance.
     */
    final Entry<K, V> getEntryUsingComparator(Object key) {
        @SuppressWarnings("unchecked")
        K k = (K) key;
        Comparator<? super K> cpr = comparator;
        if (cpr != null) {
            Entry<K, V> p = root;
            while (p != null) {
                int cmp = cpr.compare(k, p.key);
                if (cmp < 0) {
                    p = p.left;
                } else if (cmp > 0) {
                    p = p.right;
                } else {
                    return p;
                }
            }
        }
        return null;
    }
    
    /**
     * Returns the first Entry in the TreeMap (according to the TreeMap's key-sort function).
     */
    final Entry<K, V> getFirstEntry() {
        Entry<K, V> p = root;
        if (p != null) {
            while (p.left != null) {
                p = p.left;
            }
        }
        return p;
    }
    
    /**
     * Returns the successor of the specified Entry, or null if no such.
     */
    static <K, V> Entry<K, V> successor(Entry<K, V> t) {
        if (t == null) {
            return null;
        } else if (t.right != null) {
            Entry<K, V> p = t.right;
            while (p.left != null) {
                p = p.left;
            }
            return p;
        } else {
            Entry<K, V> p = t.parent;
            Entry<K, V> ch = t;
            while (p != null && ch == p.right) {
                ch = p;
                p = p.parent;
            }
            return p;
        }
    }
    
    /**
     * Compares two keys using the correct comparison method for this TreeMap.
     */
    @SuppressWarnings("unchecked")
    final int compare(Object k1, Object k2) {
        return comparator == null ? 
            ((Comparable<? super K>)k1).compareTo((K)k2) :
            comparator.compare((K)k1, (K)k2);
    }
    
    // Red-Black tree balancing methods
    
    private static <K, V> boolean colorOf(Entry<K, V> p) {
        return (p == null ? BLACK : p.color);
    }
    
    private static <K, V> Entry<K, V> parentOf(Entry<K, V> p) {
        return (p == null ? null : p.parent);
    }
    
    private static <K, V> void setColor(Entry<K, V> p, boolean c) {
        if (p != null) {
            p.color = c;
        }
    }
    
    private static <K, V> Entry<K, V> leftOf(Entry<K, V> p) {
        return (p == null) ? null : p.left;
    }
    
    private static <K, V> Entry<K, V> rightOf(Entry<K, V> p) {
        return (p == null) ? null : p.right;
    }
    
    /**
     * From CLR
     */
    private void rotateLeft(Entry<K, V> p) {
        if (p != null) {
            Entry<K, V> r = p.right;
            p.right = r.left;
            if (r.left != null) {
                r.left.parent = p;
            }
            r.parent = p.parent;
            if (p.parent == null) {
                root = r;
            } else if (p.parent.left == p) {
                p.parent.left = r;
            } else {
                p.parent.right = r;
            }
            r.left = p;
            p.parent = r;
        }
    }
    
    /**
     * From CLR
     */
    private void rotateRight(Entry<K, V> p) {
        if (p != null) {
            Entry<K, V> l = p.left;
            p.left = l.right;
            if (l.right != null) {
                l.right.parent = p;
            }
            l.parent = p.parent;
            if (p.parent == null) {
                root = l;
            } else if (p.parent.right == p) {
                p.parent.right = l;
            } else {
                p.parent.left = l;
            }
            l.right = p;
            p.parent = l;
        }
    }
    
    /**
     * Fixes the Red-Black tree properties after insertion.
     */
    private void fixAfterInsertion(Entry<K, V> x) {
        x.color = RED;
        
        while (x != null && x != root && x.parent.color == RED) {
            if (parentOf(x) == leftOf(parentOf(parentOf(x)))) {
                Entry<K, V> y = rightOf(parentOf(parentOf(x)));
                if (colorOf(y) == RED) {
                    setColor(parentOf(x), BLACK);
                    setColor(y, BLACK);
                    setColor(parentOf(parentOf(x)), RED);
                    x = parentOf(parentOf(x));
                } else {
                    if (x == rightOf(parentOf(x))) {
                        x = parentOf(x);
                        rotateLeft(x);
                    }
                    setColor(parentOf(x), BLACK);
                    setColor(parentOf(parentOf(x)), RED);
                    rotateRight(parentOf(parentOf(x)));
                }
            } else {
                Entry<K, V> y = leftOf(parentOf(parentOf(x)));
                if (colorOf(y) == RED) {
                    setColor(parentOf(x), BLACK);
                    setColor(y, BLACK);
                    setColor(parentOf(parentOf(x)), RED);
                    x = parentOf(parentOf(x));
                } else {
                    if (x == leftOf(parentOf(x))) {
                        x = parentOf(x);
                        rotateRight(x);
                    }
                    setColor(parentOf(x), BLACK);
                    setColor(parentOf(parentOf(x)), RED);
                    rotateLeft(parentOf(parentOf(x)));
                }
            }
        }
        root.color = BLACK;
    }
    
    @Override
    public Iterator<Entry<K, V>> iterator() {
        return new EntryIterator(getFirstEntry());
    }
    
    final class EntryIterator implements Iterator<Entry<K, V>> {
        private Entry<K, V> next;
        private Entry<K, V> lastReturned;
        
        EntryIterator(Entry<K, V> first) {
            lastReturned = null;
            next = first;
        }
        
        @Override
        public boolean hasNext() {
            return next != null;
        }
        
        @Override
        public Entry<K, V> next() {
            Entry<K, V> e = next;
            if (e == null) {
                throw new NoSuchElementException();
            }
            next = successor(e);
            lastReturned = e;
            return e;
        }
    }
    
    // Example usage
    public static void main(String[] args) {
        System.out.println("=== TreeMap Internal Demo ===\n");
        
        // Create a new TreeMapInternal with natural ordering
        TreeMapInternal<Integer, String> treeMap = new TreeMapInternal<>();
        
        // Add some key-value pairs
        System.out.println("Adding key-value pairs:");
        treeMap.put(3, "Three");
        treeMap.put(1, "One");
        treeMap.put(4, "Four");
        treeMap.put(2, "Two");
        treeMap.put(5, "Five");
        
        // Print the tree in-order
        System.out.println("\nTreeMap contents (in-order):");
        for (Entry<Integer, String> entry : treeMap) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        
        // Get a value by key
        System.out.println("\nValue for key 3: " + treeMap.get(3));
        
        // Update a value
        System.out.println("\nUpdating value for key 3 to 'THREE'");
        treeMap.put(3, "THREE");
        System.out.println("New value for key 3: " + treeMap.get(3));
        
        // Using a custom comparator
        System.out.println("\nCreating a new TreeMap with reverse order comparator");
        TreeMapInternal<Integer, String> reverseMap = new TreeMapInternal<>((a, b) -> b.compareTo(a));
        reverseMap.put(3, "Three");
        reverseMap.put(1, "One");
        reverseMap.put(4, "Four");
        reverseMap.put(2, "Two");
        
        System.out.println("Reverse order TreeMap contents:");
        for (Entry<Integer, String> entry : reverseMap) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
