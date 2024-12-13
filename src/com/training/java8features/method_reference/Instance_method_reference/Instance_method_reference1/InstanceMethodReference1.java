package com.training.java8features.method_reference.Instance_method_reference.Instance_method_reference1;

//We are referring non-static methods. You can refer methods by class object and anonymous object.

interface Drawable{
    void say();
}

public class InstanceMethodReference1{

    public void saySomething(){
        System.out.println("Hi there! this is instance method reference");
    }

    public static void main(String[] args) {
        InstanceMethodReference1 instanceMethodReference1 = new InstanceMethodReference1();
        Drawable drawable = instanceMethodReference1::saySomething;
        drawable.say(); // Output: Hi there! this is instance method reference

        Drawable drawable1 = new InstanceMethodReference1()::saySomething;
        drawable1.say(); // Output: Hi there! this is instance method reference
    }
}
