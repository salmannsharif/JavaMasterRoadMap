package com.training.generics.generic_method;

public class GenericMethodMainClass {
    public static void main(String[] args) {
        GenericMethod genericMethod = new GenericMethod();
        System.out.println(genericMethod.printData("data"));
        Integer [] arr = {1,2,3,4,5,6,7};
        System.out.println(genericMethod.findMiddleElement(arr));
    }
}
