package com.training.collectionframework;

class A{
    public void foo1(){
        System.out.println("Im from A class");
    }

}
class B extends A{
    public void foo1(){
        System.out.println("Im from B class");
    }
}

public class LinkedList {
    public static void main(String[] args) {
        A a = new A();
        a.foo1();

        A b = new B();
        b.foo1();
    }
}
