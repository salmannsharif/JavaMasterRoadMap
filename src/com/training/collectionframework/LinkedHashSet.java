package com.training.collectionframework;
public class LinkedHashSet {
    public static void main(String[] args) {
        int m = 7;
        System.out.println();
        for (int x = 0; x < m; x++) {

            for (int y = 0; y < m; y++) {

                if (x == 0 || x == m - 1 || y == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.print(" ");

            for (int y = 0; y < m; y++) {
                // Conditions for printing 'O'
                if (x == 0 || x == m - 1 || y == 0 || y == m - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.print(" ");

            for (int y = 0; y < m; y++) {
                // Conditions for printing 'L'
                if (y == 0 || x == m - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.print(" ");

            for (int y = 0; y < m; y++) {

                if ((x == 0 && y != 0 && y != m - 1)
                        || (x == m / 2)
                        || (y == 0 && x != 0)
                        || (y == m - 1 && x != 0)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.print(" ");


            for (int y = 0; y < m; y++) {
                if (y == 0 || y == m-1 || x == y) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}