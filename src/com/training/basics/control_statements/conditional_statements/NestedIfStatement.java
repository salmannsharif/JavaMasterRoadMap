package com.training.basics.control_statements.conditional_statements;

public class NestedIfStatement {
    public static void main(String[] args) {
        int number = 10;
        if (number > 5) {
            System.out.println("Number is greater than 5");
            if (number > 10) {
                System.out.println("Number is also greater than 10");
            } else {
                System.out.println("Number is not greater than 10");
            }
        } else {
            System.out.println("Number is not greater than 5");
        }
    }
}
