package com.training.java8features.method_reference.static_method_reference.method_reference2;

//We are using predefined functional interface Runnable to refer static method.

public class MethodReference2 {

    public static void  ThreadStatus(){
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {
        Thread t = new Thread(MethodReference2::ThreadStatus);
        t.start();
    }

}