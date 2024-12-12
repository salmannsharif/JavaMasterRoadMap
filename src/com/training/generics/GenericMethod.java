package com.training.generics;

/*A generic method is a method that can operate on different types (data types).
The type is specified as a type parameter at runtime, making the method flexible and reusable for various data types.

Key Features :
Defined with Type Parameters:
                A generic method has a type parameter (e.g., <T>), which is placed before the return type.
Flexible Usage:
                The method can work with any data type specified when called.
Compile-Time Safety:
                It ensures type safety by catching type errors at compile time.*/

public class GenericMethod {
    public static <T> void printData(T data) {
        System.out.println(data);
    }
    public static <T> T findMiddleElement(T[] array){
        return array[array.length/2];
    }
}
