package com.training.java8features.functional_interface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * There are four most important functional interfaces - Predicate, Consumer, Function, Supplier.
 * 1. Predicate – Use when you need to check a condition and return true or false (like filtering).
 *    e.g = Predicate<Integer> isEven = n -> n % 2 == 0;
 *
 * 2. Consumer – Use when you want to perform an action on an object but don’t need to return anything (like printing).
 *    e.g = Consumer<String> print = s -> System.out.println(s);
 *
 * 3. Function – Use when you want to transform or map an input to an output (like converting data).
 *    e.g = Function<String, Integer> length = str -> str.length();
 *
 * 4. Supplier -  Use when you want to supply or generate data without any input (like generating random values).
 *    e.g = Supplier<Double> random = () -> Math.random();
 * */



public class FunctionalInterface2 {
    public static void main(String[] args) {

        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println(isEven.test(9));

        Consumer<String> print = s -> System.out.println(s);
        print.accept("This is an sample string");

        Function<String, Integer> length = str -> str.length();
        System.out.println(length.apply("String"));

        Supplier<Double> random = ()-> Math.random();
        System.out.println(random.get());


    }
}
