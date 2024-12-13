package com.training.java8features.method_reference.static_method_reference.method_reference1;

/* Method reference is used to refer method of functional interface. It is compact and easy form of lambda expression.
Each time when you are using lambda expression to just referring a method,
you can replace your lambda expression with method reference */

// We have defined a functional interface and referring a static method to it's functional method say().

interface Drawable{
    void say();
}

public class MethodReference {

    public static void saySomething(){
        System.out.println("Hi there!");
    }

    public static void main(String[] args) {
        Drawable drawable = MethodReference::saySomething;
        drawable.say();
    }

}