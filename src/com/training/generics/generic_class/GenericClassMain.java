package com.training.generics.generic_class;

import java.util.List;

class GenericClass<T> {
    T data;
    public void setData(T data) {
        this.data = data;
    }
    public T getData() {
        return data;
    }
}

public class GenericClassMain {
    public static void main(String[] args) {
        List<Integer> list;
        GenericClass<Integer> integerSampleClass = new GenericClass<>();
        integerSampleClass.setData(10);
        System.out.println(integerSampleClass.getData());

        GenericClass<String> stringSampleClass = new GenericClass<>();
        stringSampleClass.setData("Hello World");

        System.out.println(stringSampleClass.getData());

        GenericClass<Character> charSampleClass = new GenericClass<>();
        charSampleClass.setData('A');
        System.out.println(charSampleClass.getData());

        GenericClass<Double> doubleSampleClass = new GenericClass<>();
        doubleSampleClass.setData(3.14);
        System.out.println(doubleSampleClass.getData());
    }
}