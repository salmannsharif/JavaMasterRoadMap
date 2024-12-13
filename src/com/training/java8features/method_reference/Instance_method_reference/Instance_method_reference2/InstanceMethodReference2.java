package com.training.java8features.method_reference.Instance_method_reference.Instance_method_reference2;

public class InstanceMethodReference2 {

    public void saySomething(){
        System.out.println("This is instance method reference");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new InstanceMethodReference2()::saySomething);
        thread.start();
    }
}
