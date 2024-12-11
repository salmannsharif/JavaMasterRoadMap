package com.training.collectionframework;

import java.util.List;

public class HashSet {

    int a = 10; // "10" stored in heap (part of object instance), "a" (reference) stored in heap (inside the object)

    Integer b = new Integer(10); // "10" stored in Integer pool (cached for small integers), "b" (reference to the Integer object) stored in heap (inside the object)

    String str = "name"; // "name" stored in the String pool, "str" (reference) stored in heap (inside the object)

    String str_1 = new String("salman"); // "salman" stored in heap, "str_1" (reference) stored in heap (inside the object)

    static int num = 10; // "10" stored in method area (as a static primitive), "num" (reference) stored in method area

    static Integer num_1 = new Integer(10); // "10" stored in Integer pool (cached). **Integer pool is part of the heap**, "num_1" (reference to the Integer object) stored in method area

    static String str_2 = "name"; // "name" stored in the String pool, "str_2" (reference) stored in method area

    static String str_3 = new String("salman"); // "salman" stored in heap, "str_3" (reference) stored in method area

    static final int getNum = 90; // "90" stored in method area (as a static final constant), "getNum" (reference) stored in method area

    static final Integer getNum_1 = 100; // "100" stored in Integer pool (cached), **Integer pool is part of the heap**, "getNum_1" (reference to the Integer object) stored in method area

    static final String str_4 = "constant"; // "constant" stored in String pool, "str_4" (reference) stored in method area

    static final Integer num_2 = new Integer(10); // "10" stored in Integer pool (cached). **Integer pool is part of the heap**, "num_2" (reference to the Integer object) stored in method area

    static final String getStr_2 = new String("salman sharif"); // "salman sharif" stored in heap, "getStr_2" (reference) stored in method area

    public static void main(String[] args) {

        int a = 10; // "10" stored in stack (as a local variable), "a" (reference) stored in stack

        Integer b = new Integer(10); // "10" stored in Integer pool (cached). **Integer pool is part of the heap**, "b" (reference to the Integer object) stored in stack

        String str = "name"; // "name" stored in the String pool, "str" (reference) stored in stack

        String str_1 = new String("salman"); // "salman" stored in heap, "str_1" (reference) stored in stack

        final int num = 10; // "10" stored in stack (as a local final variable), "num" (reference) stored in stack

        final Integer num_1 = new Integer(10); // "10" stored in Integer pool (cached). **Integer pool is part of the heap**, "num_1" (reference to the Integer object) stored in stack

        final String str_2 = "constant"; // "constant" stored in String pool, "str_2" (reference) stored in stack

        final String str_3 = new String("constant"); // "constant" stored in heap, "str_3" (reference) stored in stack

        HashSet hashSet = new HashSet(); // Reference (hashSet) stored in stack, actual object stored in heap
    }

}
