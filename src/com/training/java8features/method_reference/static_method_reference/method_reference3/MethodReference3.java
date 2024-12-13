package com.training.java8features.method_reference.static_method_reference.method_reference3;

import java.util.function.BiFunction;

class Arithmetic{
    public static int add(int a, int b){
        return a+b;
    }
}

public class MethodReference3 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> adder = Arithmetic::add;
        int result = adder.apply(10, 20);// Outputs: 30
        System.out.println(result);
    }
}