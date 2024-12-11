package com.training.java8features.functional_interface;

// Functional interface is a Java 8 interface that contains only one abstract method.
@java.lang.FunctionalInterface
interface Functional{
     void method(String str);
}
public class FunctionalInterface {
    public static void main(String[] args) {

        // Using Lambda Expression
//        Functional functional = str -> System.out.println(str);
//        functional.method("This is a sample string for better understanding");


        // Anonymous class
        Functional functional = new Functional() {
            @Override
            public void method(String str) {
                System.out.println(str);
            }
        };

        functional.method("This is a sample string for better understanding of using anonymous class");

    }
}
