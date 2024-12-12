package com.training.generics.generic_method;

public class GenericMethodMainClass {
    public static void main(String[] args) {
        GenericMethod genericMethod = new GenericMethod();
        genericMethod.printData(10);
        Integer [] arr = {1,2,3,4,5,6,7};
        System.out.println(genericMethod.findMiddleElement(arr));
    }
}
