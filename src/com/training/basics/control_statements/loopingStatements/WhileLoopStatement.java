package com.training.basics.control_statements.loopingStatements;

public class WhileLoopStatement {
    public static void main(String[] args) {

        // Print numbers from 0 to 9 using while loop
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }

        // Print numbers from 10 to 1 using while loop
        i = 10;
        while (i > 0) {
            System.out.println(i);
            i--;
        }

        // Print numbers from 10 to 1 using decrement operator in while loop
        i = 10;
        while(i >= 1){
            System.out.println(i);
            i--;
        }

    }
}
