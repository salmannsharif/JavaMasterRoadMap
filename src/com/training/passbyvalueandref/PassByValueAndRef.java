package com.training.passbyvalueandref;

class Base{
    int a;
}
public class PassByValueAndRef {
    public static void changeName(String name) {
        name = "John";
    }
    public static void changeReference(Base b){
        // b = new Base();
        // b.a = 20;
        b.a = 20;
    }
    public static void main(String[] args) {

        Base b = new Base();
        b.a = 5;
        System.out.println("Before: " + b.a);
        changeReference(b);
        System.out.println("After: " + b.a);

        String name = "Naveen";
        System.out.println("Before: " + name);
        changeName(name);
        System.out.println("After: " + name);
    }
}