package com.training.sample_projects.zoo;

public class Tiger {
    String name;
    int age;
    public Tiger(String name , int age){
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println(name + "Eating...");
    }
    public void hunt(){
        System.out.println(name + "Hunting...");
    }
}
