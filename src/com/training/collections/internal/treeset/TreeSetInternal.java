//package com.training.collections.internal.treeset;
//
//import com.training.collections.internal.treemap.TreeMapInternal;
//import java.util.AbstractSet;
//import java.util.Collection;
//import java.util.Comparator;
//import java.util.Iterator;
//import java.util.NavigableSet;
//import java.util.SortedSet;
//
///**
// * A simplified version of TreeSet that demonstrates how it internally works
// * using a TreeMap where all values are the same dummy object.
// */
//public class TreeSetInternal<E> extends AbstractSet<E>
//    implements NavigableSet<E>, Cloneable, java.io.Serializable {
//
//    private static final long serialVersionUID = -2479143000061671589L;
//
//    // Dummy value to associate with an Object in the backing Map
//    private static final Object PRESENT = new Object();
//
//    private final TreeMapInternal<E, Object> m;
//
//    /**
//     * Constructs a new, empty tree set, sorted according to the natural ordering of its elements.
//     */
//    public TreeSetInternal() {
//        this.m = new TreeMapInternal<>();
//    }
//
//    /**
//     * Constructs a new tree set containing the elements in the specified collection,
//     * sorted according to the natural ordering of its elements.
//     */
//    public TreeSetInternal(Comparator<? super E> comparator) {
//        this.m = new TreeMapInternal<>(comparator);
//    }
//
//    /**
//     * Constructs a new tree set containing the same elements and using the same ordering
//     * as the specified sorted set.
//     */
//    public TreeSetInternal(Collection<? extends E> c) {
//        this();
//        addAll(c);
//    }
//
//    /**
//     * Constructs a new tree set containing the same elements and using the same ordering
//     * as the specified sorted set.
//     */
//    public TreeSetInternal(SortedSet<E> s) {
//        this(s.comparator());
//        addAll(s);
//    }
//
//    // Implemented methods from NavigableSet
//
//    @Override
//    public Iterator<E> iterator() {
//        return m.keySet().iterator();
//    }
//
//    @Override
//    public Iterator<E> descendingIterator() {
//        return descendingSet().iterator();
//    }
//
//    @Override
//    public NavigableSet<E> descendingSet() {
//        return new TreeSetInternal<>(m.descendingMap());
//    }
//
//    @Override
//    public int size() {
//        return m.size();
//    }
//
//    @Override
//    public boolean isEmpty() {
//        return m.isEmpty();
//    }
//
//    @Override
//    public boolean contains(Object o) {
//        return m.containsKey(o);
//    }
//
//    @Override
//    public boolean add(E e) {
//        return m.put(e, PRESENT) == null;
//    }
//
//    @Override
//    public boolean remove(Object o) {
//        return m.remove(o) == PRESENT;
//    }
//
//    @Override
//    public void clear() {
//        m.clear();
//    }
//
//    @Override
//    public boolean addAll(Collection<? extends E> c) {
//        // Use linear-time version if applicable
//        if (m.size() == 0 && c.size() > 0 && c instanceof SortedSet &&
//                m instanceof TreeMapInternal) {
//            SortedSet<? extends E> set = (SortedSet<? extends E>) c;
//            TreeMapInternal<E, Object> map = (TreeMapInternal<E, Object>) m;
//            // Add all elements from the sorted set
//            for (E e : set) {
//                map.put(e, PRESENT);
//            }
//            return true;
//        }
//        return super.addAll(c);
//    }
//
//    @Override
//    public NavigableSet<E> subSet(E fromElement, boolean fromInclusive,
//                                 E toElement, boolean toInclusive) {
//        return new TreeSetInternal<>(m.subMap(fromElement, fromInclusive, toElement, toInclusive));
//    }
//
//    @Override
//    public NavigableSet<E> headSet(E toElement, boolean inclusive) {
//        return new TreeSetInternal<>(m.headMap(toElement, inclusive));
//    }
//
//    @Override
//    public NavigableSet<E> tailSet(E fromElement, boolean inclusive) {
//        return new TreeSetInternal<>(m.tailMap(fromElement, inclusive));
//    }
//
//    @Override
//    public SortedSet<E> subSet(E fromElement, E toElement) {
//        return subSet(fromElement, true, toElement, false);
//    }
//
//    @Override
//    public SortedSet<E> headSet(E toElement) {
//        return headSet(toElement, false);
//    }
//
//    @Override
//    public SortedSet<E> tailSet(E fromElement) {
//        return tailSet(fromElement, true);
//    }
//
//    @Override
//    public Comparator<? super E> comparator() {
//        return m.comparator();
//    }
//
//    @Override
//    public E first() {
//        return m.firstKey();
//    }
//
//    @Override
//    public E last() {
//        return m.lastKey();
//    }
//
//    // Lower, floor, ceiling, and higher methods
//
//    @Override
//    public E lower(E e) {
//        return m.lowerKey(e);
//    }
//
//    @Override
//    public E floor(E e) {
//        return m.floorKey(e);
//    }
//
//    @Override
//    public E ceiling(E e) {
//        return m.ceilingKey(e);
//    }
//
//    @Override
//    public E higher(E e) {
//        return m.higherKey(e);
//    }
//
//    @Override
//    public E pollFirst() {
//        // Not implemented in this simplified version
//        throw new UnsupportedOperationException();
//    }
//
//    @Override
//    public E pollLast() {
//        // Not implemented in this simplified version
//        throw new UnsupportedOperationException();
//    }
//
//    @Override
//    public String toString() {
//        Iterator<E> it = iterator();
//        if (!it.hasNext()) {
//            return "[]";
//        }
//
//        StringBuilder sb = new StringBuilder();
//        sb.append('[');
//        for (;;) {
//            E e = it.next();
//            sb.append(e == this ? "(this Collection)" : e);
//            if (!it.hasNext()) {
//                return sb.append(']').toString();
//            }
//            sb.append(',').append(' ');
//        }
//    }
//
//    // Package-private method to create a TreeSet from a TreeMap
//    TreeSetInternal(TreeMapInternal<E, Object> m) {
//        this.m = m;
//    }
//
//    // Example usage
//    public static void main(String[] args) {
//        System.out.println("=== TreeSet Internal Demo ===\n");
//
//        // Create a new TreeSetInternal with natural ordering
//        TreeSetInternal<Integer> treeSet = new TreeSetInternal<>();
//
//        // Add some elements
//        System.out.println("Adding elements: 3, 1, 4, 1, 2, 5");
//        treeSet.add(3);
//        treeSet.add(1);
//        treeSet.add(4);
//        treeSet.add(1); // Duplicate, will not be added
//        treeSet.add(2);
//        treeSet.add(5);
//
//        // Print the set (will be in sorted order)
//        System.out.println("\nTreeSet contents (in natural order):");
//        System.out.println(treeSet);
//
//        // Check if element exists
//        System.out.println("\nContains 3: " + treeSet.contains(3));
//        System.out.println("Contains 10: " + treeSet.contains(10));
//
//        // Get first and last elements
//        System.out.println("\nFirst element: " + treeSet.first());
//        System.out.println("Last element: " + treeSet.last());
//
//        // Get elements less than 3
//        System.out.println("\nElements less than 3: " + treeSet.headSet(3));
//
//        // Get elements between 2 and 5 (exclusive)
//        System.out.println("Elements between 2 (inclusive) and 5 (exclusive): " + treeSet.subSet(2, 5));
//
//        // Using a custom comparator (reverse order)
//        System.out.println("\nCreating a new TreeSet with reverse order comparator");
//        TreeSetInternal<Integer> reverseSet = new TreeSetInternal<>((a, b) -> b.compareTo(a));
//        reverseSet.add(3);
//        reverseSet.add(1);
//        reverseSet.add(4);
//        reverseSet.add(2);
//
//        System.out.println("Reverse order TreeSet: " + reverseSet);
//    }
//}
