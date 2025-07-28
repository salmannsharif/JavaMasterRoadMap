package com.training.collections.internal.list;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * A simplified version of LinkedList that demonstrates how it internally works.
 * This implementation shows the doubly-linked list structure and basic operations.
 */
public class LinkedListInternal<E> implements Iterable<E> {
    
    // Pointer to first node
    private Node<E> first;
    
    // Pointer to last node
    private Node<E> last;
    
    // Size of the list
    private int size = 0;
    
    /**
     * Constructs an empty list.
     */
    public LinkedListInternal() {}
    
    /**
     * Links e as first element.
     */
    private void linkFirst(E e) {
        final Node<E> f = first;
        final Node<E> newNode = new Node<>(null, e, f);
        first = newNode;
        if (f == null) {
            last = newNode;
        } else {
            f.prev = newNode;
        }
        size++;
    }
    
    /**
     * Links e as last element.
     */
    void linkLast(E e) {
        final Node<E> l = last;
        final Node<E> newNode = new Node<>(l, e, null);
        last = newNode;
        if (l == null) {
            first = newNode;
        } else {
            l.next = newNode;
        }
        size++;
    }
    
    /**
     * Inserts element e before non-null Node succ.
     */
    void linkBefore(E e, Node<E> succ) {
        final Node<E> pred = succ.prev;
        final Node<E> newNode = new Node<>(pred, e, succ);
        succ.prev = newNode;
        if (pred == null) {
            first = newNode;
        } else {
            pred.next = newNode;
        }
        size++;
    }
    
    /**
     * Unlinks non-null first node f.
     */
    private E unlinkFirst(Node<E> f) {
        final E element = f.item;
        final Node<E> next = f.next;
        f.item = null;
        f.next = null; // help GC
        first = next;
        if (next == null) {
            last = null;
        } else {
            next.prev = null;
        }
        size--;
        return element;
    }
    
    /**
     * Unlinks non-null last node l.
     */
    private E unlinkLast(Node<E> l) {
        final E element = l.item;
        final Node<E> prev = l.prev;
        l.item = null;
        l.prev = null; // help GC
        last = prev;
        if (prev == null) {
            first = null;
        } else {
            prev.next = null;
        }
        size--;
        return element;
    }
    
    /**
     * Unlinks non-null node x.
     */
    E unlink(Node<E> x) {
        final E element = x.item;
        final Node<E> next = x.next;
        final Node<E> prev = x.prev;
        
        if (prev == null) {
            first = next;
        } else {
            prev.next = next;
            x.prev = null;
        }
        
        if (next == null) {
            last = prev;
        } else {
            next.prev = prev;
            x.next = null;
        }
        
        x.item = null;
        size--;
        return element;
    }
    
    /**
     * Returns the first element in this list.
     */
    public E getFirst() {
        final Node<E> f = first;
        if (f == null) {
            throw new NoSuchElementException();
        }
        return f.item;
    }
    
    /**
     * Returns the last element in this list.
     */
    public E getLast() {
        final Node<E> l = last;
        if (l == null) {
            throw new NoSuchElementException();
        }
        return l.item;
    }
    
    /**
     * Removes and returns the first element from this list.
     */
    public E removeFirst() {
        final Node<E> f = first;
        if (f == null) {
            throw new NoSuchElementException();
        }
        return unlinkFirst(f);
    }
    
    /**
     * Removes and returns the last element from this list.
     */
    public E removeLast() {
        final Node<E> l = last;
        if (l == null) {
            throw new NoSuchElementException();
        }
        return unlinkLast(l);
    }
    
    /**
     * Appends the specified element to the end of this list.
     */
    public void add(E e) {
        linkLast(e);
    }
    
    /**
     * Inserts the specified element at the specified position in this list.
     */
    public void add(int index, E element) {
        checkPositionIndex(index);
        
        if (index == size) {
            linkLast(element);
        } else {
            linkBefore(element, node(index));
        }
    }
    
    /**
     * Removes the element at the specified position in this list.
     */
    public E remove(int index) {
        checkElementIndex(index);
        return unlink(node(index));
    }
    
    /**
     * Returns the (non-null) Node at the specified element index.
     */
    Node<E> node(int index) {
        // assert isElementIndex(index);
        
        if (index < (size >> 1)) {
            Node<E> x = first;
            for (int i = 0; i < index; i++) {
                x = x.next;
            }
            return x;
        } else {
            Node<E> x = last;
            for (int i = size - 1; i > index; i--) {
                x = x.prev;
            }
            return x;
        }
    }
    
    /**
     * Returns the element at the specified position in this list.
     */
    public E get(int index) {
        checkElementIndex(index);
        return node(index).item;
    }
    
    /**
     * Replaces the element at the specified position in this list with the specified element.
     */
    public E set(int index, E element) {
        checkElementIndex(index);
        Node<E> x = node(index);
        E oldVal = x.item;
        x.item = element;
        return oldVal;
    }
    
    /**
     * Returns the number of elements in this list.
     */
    public int size() {
        return size;
    }
    
    /**
     * Returns true if this list contains no elements.
     */
    public boolean isEmpty() {
        return size == 0;
    }
    
    /**
     * Removes all of the elements from this list.
     */
    public void clear() {
        for (Node<E> x = first; x != null; ) {
            Node<E> next = x.next;
            x.item = null;
            x.next = null;
            x.prev = null;
            x = next;
        }
        first = last = null;
        size = 0;
    }
    
    // Positional Access Operations
    
    private boolean isElementIndex(int index) {
        return index >= 0 && index < size;
    }
    
    private boolean isPositionIndex(int index) {
        return index >= 0 && index <= size;
    }
    
    private String outOfBoundsMsg(int index) {
        return "Index: " + index + ", Size: " + size;
    }
    
    private void checkElementIndex(int index) {
        if (!isElementIndex(index)) {
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
        }
    }
    
    private void checkPositionIndex(int index) {
        if (!isPositionIndex(index)) {
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
        }
    }
    
    @Override
    public String toString() {
        if (size == 0) {
            return "[]";
        }
        
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        
        Node<E> current = first;
        while (current != null) {
            sb.append(current.item == this ? "(this Collection)" : current.item);
            if (current.next != null) {
                sb.append(", ").append(' ');
            }
            current = current.next;
        }
        
        return sb.append(']').toString();
    }
    
    @Override
    public Iterator<E> iterator() {
        return new ListItr(0);
    }
    
    private class ListItr implements Iterator<E> {
        private Node<E> lastReturned;
        private Node<E> next;
        private int nextIndex;
        
        ListItr(int index) {
            // assert isPositionIndex(index);
            next = (index == size) ? null : node(index);
            nextIndex = index;
        }
        
        @Override
        public boolean hasNext() {
            return nextIndex < size;
        }
        
        @Override
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            
            lastReturned = next;
            next = next.next;
            nextIndex++;
            return lastReturned.item;
        }
        
        @Override
        public void remove() {
            if (lastReturned == null) {
                throw new IllegalStateException();
            }
            
            Node<E> lastNext = lastReturned.next;
            unlink(lastReturned);
            if (next == lastReturned) {
                next = lastNext;
            } else {
                nextIndex--;
            }
            lastReturned = null;
        }
    }
    
    /**
     * Node class for LinkedListInternal
     */
    private static class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;
        
        Node(Node<E> prev, E element, Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }
    
    // Example usage
    public static void main(String[] args) {
        System.out.println("=== LinkedList Internal Demo ===\n");
        
        // Create a new LinkedListInternal
        LinkedListInternal<String> list = new LinkedListInternal<>();
        
        // Add elements to the end
        System.out.println("Adding elements: 'A', 'B', 'C', 'D'");
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        
        // Print the list
        System.out.println("List contents: " + list);
        
        // Add at specific position
        System.out.println("\nAdding 'X' at index 2");
        list.add(2, "X");
        System.out.println("List after addition: " + list);
        
        // Get element
        System.out.println("\nElement at index 3: " + list.get(3));
        
        // Remove element by index
        System.out.println("\nRemoving element at index 2");
        list.remove(2);
        System.out.println("List after removal: " + list);
        
        // Add more elements
        System.out.println("\nAdding more elements...");
        for (int i = 0; i < 5; i++) {
            list.add("Item" + i);
        }
        System.out.println("List after adding more elements: " + list);
        
        // Iterate using iterator
        System.out.println("\nIterating using iterator:");
        for (String item : list) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
