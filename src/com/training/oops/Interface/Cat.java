package com.training.oops.Interface;

public class Cat implements Animal{
    @Override
    public void sleep() {
        System.out.println("Cat Sleeping");
    }

    @Override
    public void eat() {
        System.out.println("Cat Eating");
    }

    public void meow(){
        System.out.println("Cat Meowing");
    }
}
