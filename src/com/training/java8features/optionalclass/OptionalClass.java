package com.training.java8features.optionalclass;

import java.util.Optional;

public class OptionalClass {

    public static void main(String[] args) {
        String[] str = new String[10];
        Optional<String> checkNull = Optional.ofNullable(str[5]);
        if(checkNull.isPresent()){
            String lowerCase = str[5].toLowerCase();
            System.out.println(lowerCase);
        }else {
            System.out.println("String value not present");
        }
        optionalMethod();
        optionalMethod1();
    }

    // Another optional class example
    public static void optionalMethod(){
        String[] str = new String[10];
        str[5] = "this is an optional class";
        Optional<String> checkNull = Optional.ofNullable(str[5]);
        if(checkNull.isPresent()){
            String upperCase = str[5].toUpperCase();
            System.out.println(upperCase);
        }else {
            System.out.println("String value not present");
        }
    }

    public static void optionalMethod1(){
        Double number = 90.76834987d;
        Optional<Double> isNull = Optional.ofNullable(number);
        if(isNull.isPresent()){
            double squareRoot = Math.sqrt(number);
            System.out.println("Square root of number : "+squareRoot);
        }else{
            System.out.println("Number is null");
        }
    }

}
