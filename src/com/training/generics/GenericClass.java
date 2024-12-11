package com.training.generics;

class SampleClass<T> {
    T data;
    public void setData(T data) {
        this.data = data;
    }
    public T getData() {
        return data;
    }
}

public class GenericClass {
    public static void main(String[] args) {
        SampleClass<Integer> integerSampleClass = new SampleClass<>();
        integerSampleClass.setData(10);
        System.out.println(integerSampleClass.getData());

        SampleClass<String> stringSampleClass = new SampleClass<>();
        stringSampleClass.setData("Hello World");
        System.out.println(stringSampleClass.getData());

        SampleClass<Character> charSampleClass = new SampleClass<>();
        charSampleClass.setData('A');
        System.out.println(charSampleClass.getData());

        SampleClass<Double> doubleSampleClass = new SampleClass<>();
        doubleSampleClass.setData(3.14);
        System.out.println(doubleSampleClass.getData());
    }
}
