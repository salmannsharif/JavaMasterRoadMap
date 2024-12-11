package com.training.java8features.foreach;

import java.util.Arrays;
import java.util.List;

public class ForEachMethod {
    public static void main(String[] args) {
        // Using for each loop
        int [] arr = {1,2,3,4,5};
//        Arrays.stream(arr).forEach(System.out::println); using foreach method
        Arrays.stream(arr).filter(x->x%2==0).forEach(System.out::println);

        for (int i : arr) {
            System.out.print(i);
        }

        System.out.println();

        // Using forEach method and lambda expression
        List<Integer> elements = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        elements.forEach(numbers -> System.out.print(numbers));
    }
}
