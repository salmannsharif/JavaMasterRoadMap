package com.training.basics.control_statements.conditional_statements;

public class SwitchStatement {
    public static void main(String[] args) {
        int number = 10;
        switch (number) {
            case 1:
                System.out.println("Number is 1");
                break;
            case 2:
                System.out.println("Number is 2");
                break;
            case 3:
                System.out.println("Number is 3");
                break;
            default:
                System.out.println("Number is not 1, 2, or 3");
        }
    }
}
