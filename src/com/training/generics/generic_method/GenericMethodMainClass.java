package com.training.generics.generic_method;

public class GenericMethodMainClass {
    public static void main(String[] args) {

        GenericMethod genericMethod = new GenericMethod();
        System.out.println(genericMethod.printData("data"));
        System.out.println(genericMethod.printData(12345));
        System.out.println(genericMethod.printData('A'));
        System.out.println(genericMethod.printData(256.45f));
        System.out.println(genericMethod.printData(256.45d));
        System.out.println(genericMethod.printData(123453219836398447L));


        Integer [] intArr = {1,2,3,4,5,6,7};
        String [] strArr = {"John","Smith","Wick","Christ","Scarlet"};
        Character [] chArr = {'A','B','C','D'};
        Float[] floatArr = {1.2f,3.4f,5.6f,7.8f,9.0f};
        Double[] doubleArr = {1.2,3.4,5.6,7.8,9.0};
        Long[] longArr = {1L,2L,3L,4L,5L};


        System.out.println(genericMethod.findMiddleElement(intArr));
        System.out.println(genericMethod.findMiddleElement(strArr));
        System.out.println(genericMethod.findMiddleElement(chArr));
        System.out.println(genericMethod.findMiddleElement(floatArr));
        System.out.println(genericMethod.findMiddleElement(doubleArr));
        System.out.println(genericMethod.findMiddleElement(longArr));
    }
}
