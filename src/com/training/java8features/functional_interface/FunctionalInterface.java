package com.training.java8features.functional_interface;


/**Functional interface is a Java 8 interface that contains only one abstract method but can have many default method.*/

    /* A functional interface's main purpose is to provide a well-defined type for a lambda expression or
    method reference. This is the mechanism that allows us to pass behavior as a parameter,
    which in turn enables a more functional, declarative style of programming.
    While a 'normal' interface defines a contract for an object,
    a functional interface defines a contract for a single function,
    making it the key that unlocked lambda expressions and modern Java APIs like Streams. */

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
