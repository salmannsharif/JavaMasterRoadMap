package com.training.start_pattern;

public class Start_Pattern {
    public static void main(String[] args) {

//        for(int i=0 ;  i<=5 ; i++){
//
//            for(int j=5; j>i; j--){
//                System.out.print(" ");
//            }
//
//            for(int k=0; k<i; k++){
//                System.out.print("* ");
//            }
//
//            System.out.println();
//
//            for(int j=0; j<i; j++){
//                System.out.print(" ");
//            }
//
//            for(int k=5; k>i; k--){
//                System.out.print("* ");
//            }
//
//            System.out.println();
//
//        }
//
//        for(int i=1 ;  i<5 ; i++){
//
//            for(int j=0; j<i; j++){
//                System.out.print(" ");
//            }
//
//            for(int k=5; k>i; k--){
//                System.out.print("* ");
//            }
//
//            System.out.println();
//
//        }

        int m = 17;
        System.out.println();

        for (int x = 0; x < m; x++) {

            for (int y = 0; y < m; y++) {

                if (x == 0 || x == m - 1 || y == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.print("    ");

            for (int y = 0; y < m; y++) {
                if (x == 0 || x == m - 1 || y == 0 || y == m - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.print("    ");

            for (int y = 0; y < m; y++) {
                if (y == 0 || x == m - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.print("    ");

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

            System.out.print("    ");


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
