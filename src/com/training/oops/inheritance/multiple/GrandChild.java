package com.training.oops.inheritance.multiple;

public class GrandChild implements Parent, Child  {

    @Override
    public void childMethod() {
        System.out.println("This is the child method");
    }

    @Override
    public void parentMethod() {
        System.out.println("This is the parent method");
    }
}
