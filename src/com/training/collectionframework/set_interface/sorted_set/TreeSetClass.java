package com.training.collectionframework.set_interface.sorted_set;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetClass {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add("John");
        treeSet.add('A');
        treeSet.add(10.09f);
        treeSet.add(98.098729793d);
        treeSet.add(234309488132908109L);
        System.out.println(treeSet);


        HashSet<String> string = new HashSet<>();

    }
}
