package com.training.basics.classandobject;

public class ClassAndObject {
    int id=1;
    String name="john";
    char bloodGroup = 'A';
    long contactNumber = 1234567890;

    ClassAndObject(){}

    // Using constructor method to initialize the object
    ClassAndObject(int id, String name, char bloodGroup, long contactNumber){
        this.id = id;
        this.name = name;
        this.bloodGroup = bloodGroup;
        this.contactNumber =contactNumber;
    }

    // Using setter method to initialize the object
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBloodGroup(char bloodGroup) {
        this.bloodGroup = bloodGroup;
    }


    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }

    // Using instance initialization block
    {
        this.id = 100;
        this.name = "John Wick";
        this.contactNumber = 697912737123l;
        this.bloodGroup = 'A';
    }




    public static void main(String[] args) {
        ClassAndObject obj = new ClassAndObject(); // Here obj is object, With the help of obj we can access class properties.
        System.out.println(obj.id);
        System.out.println(obj.name);
        System.out.println(obj.bloodGroup);
        System.out.println(obj.contactNumber);

        // There are five ways to initialize the object
//        1. Constructor class
//        2. Using setter method
        obj.setId(10);
        obj.setName("John wick");

//        3. Direct Initialization
        obj.id = 10;
        obj.name = "John Wick";

//        4. Instance initialization Block
//        5. Using builder or factory method


    }
}
