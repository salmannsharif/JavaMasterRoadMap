package com.training.basics.input_and_ouput;

import java.util.Scanner;
import java.util.Arrays;

public class InputAndOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(Arrays.toString(args));
        // Asking for an integer input
        System.out.print("Enter an integer (n): ");
        int n = sc.nextInt();
        System.out.println("You entered the integer: " + n);

        // Handling leftover newline
        sc.nextLine(); // Clear the buffer

        // Asking for a string input
        System.out.print("Enter a string (name): ");
        String name = sc.nextLine();
        System.out.println("You entered the string: " + name);

        // Asking for a double input
        System.out.print("Enter a double value: ");
        double d = sc.nextDouble();
        System.out.println("You entered the double value: " + d);

        // Asking for a boolean input
        System.out.print("Enter a boolean value (true/false): ");
        boolean b = sc.nextBoolean();
        System.out.println("You entered the boolean value: " + b);

        // Asking for a character input
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        System.out.println("You entered the character: " + ch);

        // Asking for an array of integers
        System.out.println("Enter " + n + " integers for the array:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Display the array elements
        System.out.println("You entered the array: " + Arrays.toString(arr));

        // Closing the scanner object
        sc.close();
    }
}
