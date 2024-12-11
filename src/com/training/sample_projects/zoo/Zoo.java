package com.training.sample_projects.zoo;

public class Zoo {
    public static void main(String[] args) {

        Dog dog1 = new Dog("lucy" , "lab" );
        Cat cat1 = new Cat("linda","percian");
        PetAnimals pt = new PetAnimals(dog1,cat1);

//        String dog_1 []  = new String[1];
//        dog_1[0] = dog1;
//        for(String animal : dog_1){
//            System.out.println(animal);
//        }

        Dog[] dog_1 = new Dog[1];
        dog_1[0] = dog1;
        for(Dog dog : dog_1){
            System.out.println(dog.breed);
        }



        Tiger tiger = new Tiger("Khan",5);
        Lion lion = new Lion("simba",8);
        WildAnimals wd = new WildAnimals(tiger,lion);
        wd.lion.roar();

        Animals animals = new Animals(wd,pt);
        System.out.println(animals.petAnimals.cat.name);
    }
}
