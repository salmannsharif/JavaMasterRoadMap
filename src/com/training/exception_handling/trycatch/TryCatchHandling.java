package com.training.exception_handling.trycatch;

public class TryCatchHandling {
    public static void main(String[] args) {
        int a = 67;
        int b = 0;

        // Example 1: ArithmeticException
        try {
            int result = a / b;  // This will throw ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error occurred: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unknown error occurred: " + e.getMessage());
        }

        // Example 2: NullPointerException
        try {
            String str = null;
            System.out.println(str.length());  // This will throw NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Null pointer error occurred: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unknown error occurred: " + e.getMessage());
        }

        // Example 3: ArrayIndexOutOfBoundsException
        try {
            int[] arr = new int[3];
            System.out.println(arr[5]);  // This will throw ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unknown error occurred: " + e.getMessage());
        }

        // Example 4: NumberFormatException (This is to demonstrate a different exception)
        try {
            String invalidNumber = "abc";
            int num = Integer.parseInt(invalidNumber);  // This will throw NumberFormatException
            System.out.println("Parsed number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unknown error occurred: " + e.getMessage());
        }
    }
}