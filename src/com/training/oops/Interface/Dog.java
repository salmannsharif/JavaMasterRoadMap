package com.training.oops.Interface;

public class Dog implements Animal{
    @Override
    public void sleep() {
        System.out.println("Dog Sleeping");
    }

    @Override
    public void eat() {
        System.out.println("Dog Eating");
    }

    public void bark(){
        System.out.println("Dog Barking");
    }
}
