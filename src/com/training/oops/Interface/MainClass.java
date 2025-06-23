package com.training.oops.Interface;

class GenericClass<T>{
    T t;

    public GenericClass(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    static <T> void print(T t) {
        System.out.println(t);
    }
}

public class MainClass {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.eat();
        animal.sleep();

        GenericClass<String> genericClass = new GenericClass<String>(new String("Hello World"));
        genericClass.setT("This is sample string for testing purpose...");
        System.out.println(genericClass.getT());

        genericClass.print(12234);

    }
}