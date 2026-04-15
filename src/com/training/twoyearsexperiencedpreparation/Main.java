package com.training.twoyearsexperiencedpreparation;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
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



    public static void main(String[] args) {
//        moveZeroElementToRightInArray();
//        moveZeroElementToRightInList();
        sortingMapUsingByValue();
    }
}
