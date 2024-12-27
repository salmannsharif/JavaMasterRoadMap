package com.training.collectionframework.read_only_collection;

/*In Java, a read-only (unmodifiable) collection cannot be modified once created. You cannot add, remove, or update elements.
Any such operation will throw a java.lang.UnsupportedOperationException.
To create a read-only collection, the java.util.Collections class provides wrapper methods like unmodifiableList(), unmodifiableSet(), and unmodifiableMap().
These methods return a read-only view of the original collection.
While you can perform read operations, any modification attempt on the returned collection will result in an exception.
Modifications to the original collection are reflected in the read-only collection.
*/

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ReadOnlyMap {
    public static void main(String[] args) {
        //Creating an HashMap

        Map<Integer, String> originalMap = new HashMap<>();

        //Adding elements to originalMap

        originalMap.put(1, "John");

        originalMap.put(2, "Carlos");

        originalMap.put(3, "David");

        originalMap.put(4, "Ian");

        originalMap.put(5, "Daniel");

        //Printing originalMap

        System.out.println("=========== Original Map ===========");

        Set<Entry<Integer, String>> entrySet = originalMap.entrySet();

        for (Entry<Integer, String> entry : entrySet) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        //Creating read only view of the originalMap

        Map<Integer, String> readOnlyMap = Collections.unmodifiableMap(originalMap);

        //Printing readOnlyMap

        System.out.println("=========== Read Only Map ===========");

        entrySet = readOnlyMap.entrySet();

        for (Entry entry : entrySet) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        //Modification operations on readOnlyMap throws UnsupportedOperationException

        try {
            readOnlyMap.put(6, "AnyName");

            readOnlyMap.remove(2);
        } catch (UnsupportedOperationException e) {
            System.out.println("====== Modifications to read only map are not allowed ======");
        }

        //Modification operations on originalMap are reflected in readOnlyMap also

        originalMap.put(6, "AnyName");

        originalMap.remove(2);

        //Printing readOnlyMap

        System.out.println("====== Modifications to original map are reflected in read only map also ======");

        System.out.println("=========== Read Only Map ===========");

        entrySet = readOnlyMap.entrySet();

        for (Entry entry : entrySet) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}