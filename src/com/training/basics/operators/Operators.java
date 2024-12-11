package com.training.basics.operators;

import com.training.basics.operators.arithmetic.ArithmeticOperators;
import com.training.basics.operators.assignment.AssignmentOperators;
import com.training.basics.operators.bitwise.BitwiseOperators;
import com.training.basics.operators.comparison.ComparisonOperators;
import com.training.basics.operators.logical.LogicalOperators;
import com.training.basics.operators.ternary.TernaryOperator;
import com.training.basics.operators.unary.Unary;


public class Operators {
    public static void main(String[] args) {
        ArithmeticOperators arithmeticOperators = new ArithmeticOperators();
        System.out.println("ArithmeticOperators");
        arithmeticOperators.arithmeticOperators();

        AssignmentOperators assignmentOperators = new AssignmentOperators();
        System.out.println("AssignmentOperators");
        assignmentOperators.assignmentOperators();

        ComparisonOperators comparisonOperators = new ComparisonOperators();
        System.out.println("ComparisonOperators");
        comparisonOperators.comparisonOperators();

        LogicalOperators logicalOperators = new LogicalOperators();
        System.out.println("LogicalOperators");
        logicalOperators.logicalOperators();

        BitwiseOperators bitwiseOperators = new BitwiseOperators();
        System.out.println("BitwiseOperators");
        bitwiseOperators.bitwiseOperators();

        TernaryOperator ternaryOperator = new TernaryOperator();
        System.out.println("TernaryOperator");
        ternaryOperator.ternaryOperator();

        Unary unary = new Unary();
        System.out.println("UnaryOperators");
        unary.unaryOperator();
    }


    public void switchOperator(){
        int a = 1;
        switch(a){
            case 1:
                System.out.println("Case 1");
                break;
            case 2:
                System.out.println("Case 2");
                break;
            default:
                System.out.println("Default case");
        }
    }

    public void breakStatement(){
        outer:
        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                if(j==2){
                    break outer;
                }
                System.out.println("i: " + i + ", j: " + j);
            }
        }
    }


}
