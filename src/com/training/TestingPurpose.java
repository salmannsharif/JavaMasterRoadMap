package com.training;

interface  Interface1 {
     void display();
}

interface Interface2 {
     void display1();
}


class A implements Interface1, Interface2{
    public void foo(String name){
        System.out.println(name);
    }

    @Override
    public void display() {
        System.out.println("Display Method From Abstract Interface.");
    }

    @Override
    public void display1() {
        System.out.println("Display1 Method from Abstract1 Interface.");
    }
}


public class TestingPurpose {
    public static void main(String[] args) {

    }
}