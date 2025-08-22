package com.training.collectionframework.list_interface.arrayList;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.List.*;

public class AryListTask {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        // list.add(50);

        // LinkedHashSet<Integer> list2 = new LinkedHashSet<Integer>(list);

        // list2.add(60);
        // list2.add(20);
        // list2.add(70);
        // list2.add(80);
        // list2.add(90);

        // ----------------------------------------------

        // Basic Operations like get, update and delete In ArrayList

        // list.stream().forEach(System.out::println);

        // System.out.println(list.get(0));

        // System.out.println(list.get(list.size()-1));

        // list.set(1, 200);

        // list.stream().forEach(System.out::println);

        // list.remove(2);

        // list.stream().forEach(System.out::println);

        // System.out.println(list.contains(50));

        // -------------------------------------------------

        // Moderate Level - Iterating an arrayList

        // for(int i=0 ; i<list.size(); i++){
        //     System.out.println(list.get(i));
        // }

        // for(Integer integerList : list){
        //     System.out.println(integerList);
        // }

        // list.stream().forEach(System.out::println);

//        -------------------------------------------------

        // Ascending and Descending order

        // Ascending
        // Using Collections.sort() method :

        // Collections.sort(list);

        // list.stream().forEach(System.out::println);

        // Descending
//         Collections.sort(list, Collections.reverseOrder());

        // list.stream().forEach(System.out::println);


        // Using ArrayList.sort() - Ascending
        // ArrayList<Integer> naturalOrder = new ArrayList<Integer>(list);

//        list.sort(Comparator.naturalOrder());
//        list.stream().forEach(System.out::println);

        // naturalOrder.sort(Comparator.naturalOrder());

        // naturalOrder.stream().forEach(System.out::println);

        // Using ArrayList.sort() - Descending

        // ArrayList<Integer> descendingOrder = new ArrayList<>(list);
        // descendingOrder.sort(Comparator.reverseOrder());
        // descendingOrder.stream().forEach(System.out::println);

//        list.sort(Comparator.reverseOrder());
//        list.stream().forEach(System.out::println);
//        list.sort(Comparator.naturalOrder());
//        list.stream().forEach(System.out::println);


        // Using stream API

        // List<Integer> asc = list.stream().sorted().collect(Collectors.toList());
        // System.out.println(asc);

         List<Integer> dsc = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        // System.out.println(dsc);


        // Finding minimum and maximum in list

        //  Integer max = Collections.max(list);
        //  System.out.println(max);

        //  Integer min = Collections.min(list);
        //  System.out.println(min);

//        -------------------------------------------------

        // Copy one arraylist into another arraylist without duplicates

        // ArrayList<Integer> list2 = new ArrayList<>(list);
        // list2.stream().forEach(System.out::println);

        // Removing duplicate
        // LinkedHashSet<Integer> st = new LinkedHashSet<>(list);
        // st.stream().forEach(System.out::println);

        // for(int i=list.size()-1 ; i>=0 ; i--){
        //     System.out.println(list.get(i));
        // }


        // Adding two arrayList into one and preventing duplicates
        // HashSet<Integer> setList = new HashSet<Integer>();
        // System.out.print(list2);


        // Reversing an arraylist using ListIterator

        ListIterator listIterator = list.listIterator(list.size());


//        while (listIterator.hasNext()) {
//            listIterator.next(); // Just moving, not using the value
//        }


//        while(listIterator.hasPrevious()){
//            System.out.println(listIterator.previous());
//        }


        // Finding the missing numbers
//        int [] intArr = {1,2,2,3,5,7,7,8,9};
//        Set<Integer> collect = Arrays.stream(intArr).boxed()
//                .collect(Collectors.toSet());
//
//        List<Integer> collect1 = IntStream.rangeClosed(1, 9)
//                .filter(i -> !collect.contains(i))
//                .boxed()
//                .collect(Collectors.toList());
//
//        System.out.println(collect1);


        /**
         * Arrays.asList(array) → converts an array into a List.
         *
         * But the list it returns is backed by the same array.
         * 👉 Means: if you change the list, the array changes too. If you change the array, the list also reflects that.
         *
         * The list is fixed-size → you can’t add or remove elements, but you can update existing ones.
         *
         * It’s just a view of the array, not a brand-new independent list.
         *
         * Example in simple words:
         *
         * Suppose you have an array: ["A", "B", "C"]
         *
         * You do Arrays.asList(array) → now you get a List that shows ["A", "B", "C"].
         *
         * If you change list.set(1, "X"), the array also becomes ["A", "X", "C"].
         *
         * But you can’t do list.add("D") → because the size is fixed.
         *
         * 👉 So simply:
         * It’s a bridge that lets you use array data as if it were a list, but without giving you full freedom like a normal ArrayList
         *
         * ✅ In short:
         *
         * Arrays.asList() = fixed-size, linked directly to the array.
         *
         * ArrayList = dynamic, independent, full-featured list.
         */
//        List<Integer> list_1 = Arrays.asList(1,2,3);
//
//        try{
//            list_1.add(4);
//        }catch (Exception e){
//            System.out.println("Exception while adding");
//        }
//
//        try {
//            list_1.set(2,2);
//        }catch (Exception e) {
//            System.out.println("Exception while updating");
//        }

//        System.out.println(list_1);


    }
}
