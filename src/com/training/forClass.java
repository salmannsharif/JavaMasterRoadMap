package com.training;

public class forClass {
    public static void main(String[] args) {
        
        String[] data = "This is sample data".split(" ");
        for(int i = data.length - 1; i >= 0; i--) {
            System.out.print(data[i] + " ");
        }


        // Reverese the string at the same place
        String[] data = "This is sample data".split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : data) {
            result.append(new StringBuilder(word).reverse()).append(" ");
        }

        // Printing final result
        System.out.println(result.toString().trim());

    }
}
