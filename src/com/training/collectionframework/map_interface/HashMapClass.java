package com.training.collectionframework.map_interface;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapClass {


    /**
     * 🔷 What is HashMap?
     * HashMap is a Java class used to store key-value pairs.
     * It allows fast access using the key — internally it uses a technique called **hashing**.
     *
     * 🔷 Why use HashMap?
     * - When you need to associate one object (like an ID or name) with another (like salary or age).
     * - For fast lookup, insertion, and deletion of values by key.
     *
     * 🔷 Where is HashMap used in real life?
     * - Database-like storage (id-name mapping)
     * - Caching (key = URL, value = web page)
     * - Counting word frequency in documents
     * - User settings or configurations
     *
     * 🔷 Advantages:
     * - Fast performance for basic operations (O(1) on average)
     * - No duplicate keys allowed (good for enforcing uniqueness)
     * - Can store null keys and values (only one null key allowed)
     *
     * 🔷 Developer Tip (📌 What helps you become a good dev):
     * ✅ Know when to use HashMap vs ArrayList
     * ✅ Practice solving real-world problems (ex: count frequency, group by category)
     * ✅ Learn how to iterate efficiently
     * ✅ Understand key concepts like hashing, collision, load factor (for interviews)
     * ✅ Use meaningful key names — improves readability and debugging
     */


    private Map<String, Object> map;
    private Scanner sc;

    public HashMapClass() {
        map = new HashMap<>();
        sc = new Scanner(System.in);
    }

    public static void main(String[] args) {
        HashMapClass hashMapClass = new HashMapClass();
        while (true) {
            System.out.println("1. Put Element");
            System.out.println("2. Get Element");
            System.out.println("3. Remove Element");
            System.out.println("4. Remove Element with Value");
            System.out.println("5. Replace Element");
            System.out.println("6. Replace Element with Old Value");
            System.out.println("7. Check if Contains Key");
            System.out.println("8. Check if Contains Value");
            System.out.println("9. Display Keys");
            System.out.println("10. Display Values");
            System.out.println("11. Display Entries");
            System.out.println("12. Put If Absent");
            System.out.println("13. Compute");
            System.out.println("14. Compute If Absent");
            System.out.println("15. Compute If Present");
            System.out.println("16. Merge");
            System.out.println("17. Put All");
            System.out.println("18. Size of Map");
            System.out.println("19. Check if Map is Empty");
            System.out.println("20. Clear Map");
            System.out.println("21. ForEach");
            System.out.println("22. Exit");

            int choice = hashMapClass.sc.nextInt();
            switch (choice) {
                case 1: hashMapClass.putElement(); break;
                case 2: hashMapClass.getElement(); break;
                case 3: hashMapClass.removeElement(); break;
                case 4: hashMapClass.removeElementWithValue(); break;
                case 5: hashMapClass.replaceElement(); break;
                case 6: hashMapClass.replaceElementWithOldValue(); break;
                case 7: hashMapClass.containsKey(); break;
                case 8: hashMapClass.containsValue(); break;
                case 9: hashMapClass.displayKeys(); break;
                case 10: hashMapClass.displayValues(); break;
                case 11: hashMapClass.displayEntries(); break;
                case 12: hashMapClass.putIfAbsent(); break;
                case 13: hashMapClass.compute(); break;
                case 14: hashMapClass.computeIfAbsent(); break;
                case 15: hashMapClass.computeIfPresent(); break;
                case 16: hashMapClass.merge(); break;
                case 17: hashMapClass.putAll(); break;
                case 18: hashMapClass.sizeOfMap(); break;
                case 19: hashMapClass.isEmpty(); break;
                case 20: hashMapClass.clearMap(); break;
                case 21: hashMapClass.forEach(); break;
                case 22: System.out.println("Exiting..."); return;
                default: System.out.println("Enter a valid choice!"); break;
            }
        }
    }

    public void putElement() {
        System.out.println("Enter key: ");
        String key = sc.next();
        System.out.println("Enter value: ");
        Object value = sc.next();
        map.put(key, value);
        System.out.println("Element added: " + key + " = " + value);
    }

    public void getElement() {
        System.out.println("Enter key: ");
        String key = sc.next();
        System.out.println("Value for key " + key + ": " + map.get(key));
    }

    public void removeElement() {
        System.out.println("Enter key to remove: ");
        String key = sc.next();
        map.remove(key);
        System.out.println("Element removed for key: " + key);
    }

    public void removeElementWithValue() {
        System.out.println("Enter key: ");
        String key = sc.next();
        System.out.println("Enter value: ");
        Object value = sc.next();
        map.remove(key, value);
        System.out.println("Element removed for key: " + key + " with value: " + value);
    }

    public void replaceElement() {
        System.out.println("Enter key: ");
        String key = sc.next();
        System.out.println("Enter new value: ");
        Object value = sc.next();
        map.replace(key, value);
        System.out.println("Replaced value for key: " + key + " with " + value);
    }

    public void replaceElementWithOldValue() {
        System.out.println("Enter key: ");
        String key = sc.next();
        System.out.println("Enter old value: ");
        Object oldValue = sc.next();
        System.out.println("Enter new value: ");
        Object newValue = sc.next();
        map.replace(key, oldValue, newValue);
        System.out.println("Replaced value for key: " + key + " with new value: " + newValue);
    }

    public void containsKey() {
        System.out.println("Enter key to check: ");
        String key = sc.next();
        System.out.println("Contains key '" + key + "': " + map.containsKey(key));
    }

    public void containsValue() {
        System.out.println("Enter value to check: ");
        Object value = sc.next();
        System.out.println("Contains value '" + value + "': " + map.containsValue(value));
    }

    public void displayKeys() {
        System.out.println("Keys: " + map.keySet());
    }

    public void displayValues() {
        System.out.println("Values: " + map.values());
    }

    public void displayEntries() {
        System.out.println("Entries: " + map.entrySet());
    }

    public void putIfAbsent() {
        System.out.println("Enter key: ");
        String key = sc.next();
        System.out.println("Enter value: ");
        Object value = sc.next();
        map.putIfAbsent(key, value);
        System.out.println("Put if absent: " + key + " = " + value);
    }

    public void compute() {
        System.out.println("Enter key: ");
        String key = sc.next();
        System.out.println("Enter value: ");
        String value = sc.next(); // Expecting value to be a String
        map.compute(key, (k, v) -> v == null ? value : v + value);
        System.out.println("Computed value for key: " + key);
    }


    public void computeIfAbsent() {
        System.out.println("Enter key: ");
        String key = sc.next();
        System.out.println("Enter value: ");
        Object value = sc.next();
        map.computeIfAbsent(key, k -> value);
        System.out.println("Computed if absent for key: " + key);
    }

    public void computeIfPresent() {
        System.out.println("Enter key: ");
        String key = sc.next();
        System.out.println("Enter value: ");
        String value = sc.next(); // Expecting value to be a String
        map.computeIfPresent(key, (k, v) -> v + value);
        System.out.println("Computed if present for key: " + key);
    }


    public void merge() {
        System.out.println("Enter key: ");
        String key = sc.next();
        System.out.println("Enter value: ");
        String value = sc.next();  // Expecting value to be a String
        map.merge(key, value, (oldVal, newVal) -> oldVal + " -> " + newVal);
        System.out.println("Merged value for key: " + key);
    }


    public void putAll() {
        System.out.println("Enter another map: ");
        Map<String, Object> otherMap = new HashMap<>();
        otherMap.put("key3", "value3");
        map.putAll(otherMap);
        System.out.println("All elements added from another map.");
    }

    public void sizeOfMap() {
        System.out.println("Size of map: " + map.size());
    }

    public void isEmpty() {
        System.out.println("Is map empty: " + map.isEmpty());
    }

    public void clearMap() {
        map.clear();
        System.out.println("Map cleared.");
    }

    public void forEach() {
        map.forEach((key, value) -> System.out.println(key + " = " + value));
    }
}
