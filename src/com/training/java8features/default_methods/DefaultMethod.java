package com.training.java8features.default_methods;

interface DefaultMethod{
    default void defaultMethod(){
        System.out.println("Default method in interface");
    }
    default String str(String str){
        return str;
    }
    static void staticMethod(){
        System.out.println("This is a static method");
    }
}