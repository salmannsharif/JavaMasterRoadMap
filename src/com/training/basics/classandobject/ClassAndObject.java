package com.training.basics.classandobject;

public class ClassAndObject {
    int id=1;
    String name="john";
    char bloodGroup = 'A';
    long contactNumber = 1234567890;
    public static void main(String[] args) {
        ClassAndObject obj = new ClassAndObject(); // Here obj is object, With the help of obj we can access class properties.
        System.out.println(obj.id);
        System.out.println(obj.name);
        System.out.println(obj.bloodGroup);
        System.out.println(obj.contactNumber);
    }
}
