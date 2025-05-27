package com.training.java8features.functional_interface;

/**Functional interface is a Java 8 interface that contains only one abstract method but can have many default method.*/

    /**There is two ways to implement functional interface
  1. Anonymous inner class (Before java 8)
  2. Lambda Expression (After Java 8)*/

@java.lang.FunctionalInterface // This annotation is used to create functional interface manually(Customize)
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
