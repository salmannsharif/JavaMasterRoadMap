package com.training.java8features.static_method_interface;

interface Base{
    static void staticMethod(){
        System.out.println("This is a static method in Base interface");
    }
    static boolean isStaticMethod(String str){
        return str!=null && !str.isEmpty();
    }
}

class SubClass {
    public void printMessage(){
        Base.staticMethod();
        System.out.println(Base.isStaticMethod("String"));
    }
}

public class StaticMethodInInterface {
    public static void main(String[] args) {
        SubClass subClass = new SubClass();
        subClass.printMessage();
    }
}
