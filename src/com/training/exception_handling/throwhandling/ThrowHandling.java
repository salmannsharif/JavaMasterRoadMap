package com.training.exception_handling.throwhandling;

public class ThrowHandling {
    public static void main(String[] args) {
        int number = 5;
        if (number < 0) {
            throw new IllegalArgumentException("Number cannot be positive");
        }else{
            throw new IllegalArgumentException("Number cannot be negative");
        }
    }
}
