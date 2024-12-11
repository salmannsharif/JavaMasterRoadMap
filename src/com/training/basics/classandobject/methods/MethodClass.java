package com.training.basics.classandobject.methods;

public class MethodClass {

    public static void printHello(){
        System.out.println("Hello World!");
    }

    public static String greet(){
        return "Good Morning";
    }

    public static void sum(){
        int a = 10;
        int b = 20;
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        printHello(); // printHello method
        System.out.println(greet()); // printing greet method
        sum(); // sum method
    }
}
