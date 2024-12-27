package com.training.collectionframework.read_only_collection;

/* In Java, a read-only (unmodifiable) collection cannot be modified once created. You cannot add, remove, or update elements.
Any such operation will throw a java.lang.UnsupportedOperationException.
To create a read-only collection, the java.util.Collections class provides wrapper methods like unmodifiableList(), unmodifiableSet(), and unmodifiableMap().
These methods return a read-only view of the original collection.
While you can perform read operations, any modification attempt on the returned collection will result in an exception.
Modifications to the original collection are reflected in the read-only collection.
*/

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ReadOnlySet {
    public static void main(String[] args) {
        //Creating an HashSet

        Set<String> originalSet = new HashSet<>();

        //Adding elements to originalSet

        originalSet.add("Salman");

        originalSet.add("Imran");

        originalSet.add("Sanjay");

        originalSet.add("Arif");

        originalSet.add("Luck");

        //Printing originalSet

        System.out.println("=========== Original Set ===========");

        System.out.println(originalSet);

        //Creating read only view of the originalSet

        Set<String> readOnlySet = Collections.unmodifiableSet(originalSet);

        //Printing readOnlySet

        System.out.println("=========== Read Only Set ===========");

        System.out.println(readOnlySet);

        //Modification operations on readOnlySet throws UnsupportedOperationException

        try {
            readOnlySet.add("AnyName");

            readOnlySet.remove("Luck");
        } catch (UnsupportedOperationException e) {
            System.out.println("====== Modifications to read only set not allowed ======");
        }

        //Modification operations on originalSet are reflected in readOnlySet also

        originalSet.add("AnyName");

        originalSet.remove("Luck");

        //Printing readOnlySet

        System.out.println("====== Modifications to original set are reflected in read only set ======");

        System.out.println("=========== Read Only set ===========");

        System.out.println(readOnlySet);
    }
}
