package com.training.collectionframework.map_interface.sorted_map;

import java.util.Comparator;
import java.util.SortedMap;

public class SortedMapClass {
    public static void main(String[] args) {
        SortedMap<Integer, String> sortedMap = new java.util.TreeMap<>(Comparator.reverseOrder());
        sortedMap.put(3, "Three");
        sortedMap.put(1, "One");
        sortedMap.put(4, "Four");
        sortedMap.put(2, "Two");
        sortedMap.put(5, "Five");

        for(Integer key : sortedMap.keySet()) {
            System.out.println(key + " : " + sortedMap.get(key));
        }
    }
}
