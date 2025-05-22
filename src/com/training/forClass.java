package com.training;

import java.util.Stack;

public class forClass {
    public static void main(String[] args) {
        

//        String[] data = "This is sample data".split(" ");
//        for(int i = data.length - 1; i >= 0; i--) {
//            System.out.print(data[i] + " ");
//        }
        String string = "this is string";
        String[] charArray = string.split(" ");
        String reverse = "";
        for(int i = charArray.length - 1; i >= 0; i--) {
            reverse = reverse + charArray[i] + " ";
        }
        System.out.println(reverse);

        String data = "This is sample data for testing purpose Oops!";
        StringBuilder sb = new StringBuilder(data).reverse();
        System.out.println(sb.toString());

        String str = "This is a sample data for testing purpose Oops!";
        for(int i=str.length()-1 ; i>=0 ; i--){
            System.out.print(str.charAt(i));
        }
        System.out.println();


        // Reverese the string at the same place
        String[] data1 = "This is sample data".split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : data1) {
            result.append(new StringBuilder(word).reverse()).append(" ");
        }

        // Printing final result
        System.out.println(result.toString().trim());

        Stack<Character> stack = new Stack<>();
        String data2 = "Salman";
    }
}
