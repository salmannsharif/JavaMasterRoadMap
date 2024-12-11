package com.training.sample_projects.zoo;

public class Lion {
    String name;
    int age;
    public Lion(String name , int age){
        this.name = name;
        this.age = age;
    }
    public void eat(){
        System.out.println(name + "Eating...");
    }
    public void roar(){
        System.out.println("Roaring...");
    }
}
