package com.training.basics.control_statements.jumpingstatement;

public class BreakStatement {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 2) {
                    break;
                }
                System.out.println("Inside inner loop i = : " + i);
                System.out.println("Inside inner loop j = : " + j);
            }
        }
        System.out.println("Outside loop");
    }
}
