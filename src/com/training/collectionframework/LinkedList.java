package com.training.collectionframework;

public class LinkedList {
    public static void main(String[] args) {
        int m = 7; // height of 'C'

        for (int x = 0; x < m; x++) {
            for (int y = 0; y < m; y++) {
                // Conditions for printing 'C'
                if (x == 0 || x == m - 1 || y == 0 || (x > 0 && x < m - 1 && y == 0)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }


        System.out.println();

        int d = 7; // height of 'O'

        for (int x = 0; x < d; x++) {
            for (int y = 0; y < d; y++) {
                // Conditions for printing 'O'
                if (x == 0 || x == d - 1 || y == 0 || y == d - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();

        int a = 7; // height of 'L'

        for (int x = 0; x < a; x++) {
            for (int y = 0; y < a; y++) {
                // Conditions for printing 'L'
                if (y == 0 || x == a - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();

        int n = 7;

        for (int x = 0; x < n; x++) {
            for (int y = 0; y < n; y++) {

                if ((x == 0 && y != 0 && y != n - 1)
                        || (x == n / 2)
                        || (y == 0 && x != 0)
                        || (y == n - 1 && x != 0)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
