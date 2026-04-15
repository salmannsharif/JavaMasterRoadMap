package com.training.twoyearsexperiencedpreparation;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {


    static void moveZeroElementToRightInArray(){
        int[] arr = {0, 1, 0, 3, 12};
        int count = 0;
        // Traverse the array. If element
        // encountered is non-zero, then
        // replace the element at index 'count'
        // with this element
        for(int i = 0; i< arr.length ; i++){
            if(arr[i] != 0){
                arr[count++] = arr[i];
            }
        }
        // Now all non-zero elements have been shifted to
        // front and 'count' is set as index of first 0.
        // Make all elements 0 from count to end.
        while(count < arr.length){
         arr[count++] = 0;
        }
        for(int i : arr){
            System.out.print(i+ " ");
        }

    }

    static void moveZeroElementToRightInList() {
        List<Integer> numbers = List.of(1,0,-3,0,5,-2,0,8,0,-4);
        List<Integer> collect = Stream.concat(numbers.stream().filter(n -> n != 0), numbers.stream().filter(n -> n == 0))
                .toList();
        System.out.println(collect);
//        0(n)
    }

    static void sortingMapUsingByValue(){
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("D", 32);
        map.put("H", 76);
        map.put("B", 97);
        map.put("U", 43);
        map.put("G", 95);

        LinkedHashMap<String, Integer> collect = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors
                        .toMap(Map.Entry::getKey, Map.Entry::getValue,
                                (e1, e2) -> e1, LinkedHashMap::new));
        collect.forEach((key, value)->
                System.out.println(key+ "-" +value));
    }

    //Don't want to use condition here
    static int  testData(int a){
        //write  logic to return 7-11, 11-7
        return 7+11-a;
    }

    static void findingDuplicates() {
        int[] arr = {1, 1, 3, 4, 5, 6, 7, 4, 9, 10};
        for(int i = 0 ; i < arr.length -1 ; i++){
            for(int j = i+1 ; j < arr.length ; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                }
            }
        }
    }

    static void findingDuplicatesUsingStream(){
        List<Integer> num = List.of(8, 2, 7, 4, 9, 6, 7, 8, 9, 10);
//        Map<Integer, Long> collect = num.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting()));
//        Set<Integer> collect = num.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting()))
//                .entrySet().stream().filter(e -> e.getValue() > 1).map(n -> n.getKey()).
//                collect(Collectors.toSet());
        Set<Integer> collect = num.stream().filter(n -> Collections.frequency(num, n) > 1).collect(Collectors.toSet());
        System.out.println(collect);
    }

    public static void main(String[] args) {
//        moveZeroElementToRightInArray();
//        moveZeroElementToRightInList();
//        sortingMapUsingByValue();
//        System.out.println(testData(7));
//        System.out.println(testData(11));
//        findingDuplicates();
//        findingDuplicatesUsingStream();

    }
}
