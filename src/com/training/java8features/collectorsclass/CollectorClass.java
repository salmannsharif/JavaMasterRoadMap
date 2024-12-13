package com.training.java8features.collectorsclass;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/*The Collector class in Java is used with the Streams API to accumulate elements from a stream into a different form,
 such as a list, set, map, or even custom collections.
The Collectors utility class provides a rich set of static methods to create common collectors*/

public class CollectorClass {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        list.stream().filter(x->x%2==0).collect(Collectors.toList()).forEach(System.out::println);

        List<String> listStr = Arrays.asList("John", "Skype", "Bob", "Roman", "Smith", "Evan");
        List<String> filterNameList = listStr.stream().filter(name -> name.startsWith("J")).collect(Collectors.toList());
        filterNameList.forEach(System.out::println);
    }
}
