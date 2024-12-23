package com.training;

public class forClass {
    public static void main(String[] args) {
        String[] data = "This is sample data".split(" ");
        for(int i = data.length - 1; i >= 0; i--) {
            System.out.print(data[i] + " ");
        }

    }
}
