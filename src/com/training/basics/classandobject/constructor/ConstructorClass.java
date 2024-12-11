package com.training.basics.classandobject.constructor;

public class ConstructorClass {

    // Constructor is a special member function that is used to initialize the current class properties.

    private long id;
    private String name;
    private String phoneNumber;

    ConstructorClass(long id, String name, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "ConstructorClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public static void main(String[] args) {
        ConstructorClass constructorClass = new ConstructorClass(1, "John Smith", "12345");
        System.out.println(constructorClass.toString());
    }
}
