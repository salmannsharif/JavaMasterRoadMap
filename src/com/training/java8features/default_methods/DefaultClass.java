package com.training.java8features.default_methods;

public class DefaultClass implements DefaultMethod{
    public void initialize(){
//        defaultMethod();// Can be called directly
        System.out.println(str("This is return str default method"));
        DefaultMethod.staticMethod();
    }
    // Or we can call through override method
    @Override
    public void defaultMethod() {
        System.out.println("This is an override interface default method");
    }
}
