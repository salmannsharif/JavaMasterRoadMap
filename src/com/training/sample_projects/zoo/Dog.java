package com.training.sample_projects.zoo;

public class Dog {
    String name;
    String breed;
    public Dog(String name , String breed){
        this.name = name;
        this.breed = breed;
    }
    public String getBreed(){
        return name + " - " + breed;
    }
    public String getName(){
        return name;
    }
}
