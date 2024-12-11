package com.training.sample_projects.calculatordemo;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        CalculatorUtil calculatorUtil = new CalculatorUtil();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("---------- Welcome To Demo Calculator -----------");
            System.out.println("1 . Addition");
            System.out.println("2 . Subtraction");
            System.out.println("3 . Multiplication");
            System.out.println("4 . Division");
            System.out.println("5 . Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    calculatorUtil.additionMethod();
                    break;
                case 2:
                    calculatorUtil.subtractionMethod();
                    break;
                case 3:
                    calculatorUtil.multiplicationMethod();
                    break;
                case 4:
                    calculatorUtil.divisionMethod();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Enter the choice correctly ");
                    break;
            }
        } while (true);
    }


}