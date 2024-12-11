package com.training.oops.inheritance.hybrid;

public class GrandChild implements Parent, Child {
    @Override
    public void childMethod() {
        System.out.println("This is child interface method");
    }

    @Override
    public void parentMethod() {
        System.out.println("This is parent interface method");
    }
}
