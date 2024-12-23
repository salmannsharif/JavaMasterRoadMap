package com.training;

import java.util.*;

public class TestingPurpose {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read BitSet size (n) and number of operations (m)
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        // Create two BitSets
        BitSet B1 = new BitSet(n);
        BitSet B2 = new BitSet(n);
        for (int i = 0; i < m; i++) {
            String operation = scanner.next();
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            switch (operation) {
                case "AND":
                    if (x == 1) {
                        B1.and(B2);
                    } else {
                        B2.and(B1);
                    }
                    break;

                case "OR":
                    if (x == 1) {
                        B1.or(B2);
                    } else {
                        B2.or(B1);
                    }
                    break;

                case "XOR":
                    if (x == 1) {
                        B1.xor(B2);
                    } else {
                        B2.xor(B1);
                    }
                    break;

                case "FLIP":
                    if (x == 1) {
                        B1.flip(y);
                    } else {
                        B2.flip(y);
                    }
                    break;

                case "SET":
                    if (x == 1) {
                        B1.set(y);
                    } else {
                        B2.set(y);
                    }
                    break;
            }

            // Print cardinality (number of set bits) of both BitSets
            System.out.println(B1.cardinality() + " " + B2.cardinality());
        }

        scanner.close();
    }
}