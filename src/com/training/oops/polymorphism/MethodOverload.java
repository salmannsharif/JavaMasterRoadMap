package com.training.oops.polymorphism;

public class MethodOverload {

    // In one class we have two same name methods but different parameters that is called method overloading

    public static void main(String[] args) {
        System.out.println(sum(1, 2, 3));
        System.out.println(sum(1, 2));

    }

    public static int sum(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

    public static int sum(int num1, int num2){
        return num1 + num2;
    }

}
