package com.training.sample_projects.calculatordemo;

import java.util.Scanner;

public  class CalculatorUtil {
    static String A_NOT_A_NUMBER = "(A) Given number is not numeric!";
    static String B_NOT_A_NUMBER = "(B) Given number is not a numeric!";
    static String A_NOT_A_NUMBER_F = "(A) Given number is not a Numerical or Float!";
    static String B_NOT_A_NUMBER_F = "(B) Given number is not a Numerical or Float!";
    static String a;
    static String b;
    static String c;
    static String d;
    private static String str;
    static Scanner sc = new Scanner(System.in);

    // Addition Method
    public static void additionMethod(){
        CalculatorUtil mainClass = new CalculatorUtil();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Data type you want to do operations : ( Integer or Float )");
        str = sc.nextLine().toLowerCase();
        if (str.equals("integer")) {
            System.out.println("--ADDITION--");
            String name = "Addition";
            takeInpu(name);
            boolean boo = isANotNumber();
            boolean foo = isBNotNumber();
            if(boo || foo){
                return;
            }
            Integer a1 = Integer.valueOf(a);
            Integer b1 = Integer.valueOf(b);
            System.out.println(Addition.addition(a1, b1));
        } else if (str.equals("float")) {
            System.out.println("--ADDITION--");
            String name = "Addition";
            takeFloInpu(name);
            boolean foo = isANotNumberF();
            boolean boo = isBNotNumberF();
            if(boo || foo){
                return;
            }
            Float a1 = Float.valueOf(c);
            Float b1 = Float.valueOf(d);
            System.out.println(AdditonalFloat.additionalFloat(a1, b1));
        } else {
            System.out.println("Enter the data type correctly ! like given");

        }
    }

    // Subtraction Method

    public static void subtractionMethod(){
        System.out.println("Enter The Data type you want to do operations : ( Integer or Float )");
        str = sc.nextLine().toLowerCase();
        if (str.equals("integer")) {
            System.out.println("--SUBTRACTION--");
            String name = "Subtration";
            takeInpu(name);
            boolean boo = isANotNumber();
            boolean foo = isBNotNumber();
            if(boo || foo){
                return;
            }
            Integer a1 = Integer.valueOf(a);
            Integer b1 = Integer.valueOf(b);
            System.out.println(Subtraction.subtraction(a1, b1));
        } else if (str.equals("float")) {
            System.out.println("--SUBTRACTION--");
            String name = "Subtraction";
            takeFloInpu(name);
            boolean foo = isANotNumberF();
            boolean boo = isBNotNumberF();
            if(foo || boo){
                return;
            }
            Float a1 = Float.valueOf(c);
            Float b1 = Float.valueOf(d);
            System.out.println(SubtractionFloat.subtractionFloat(a1, b1));
        } else {
            System.out.println("Enter the data type correctly ! like given");
        }

    }

    // Multiplication Method

    public static void multiplicationMethod(){
        System.out.println("Enter The Data type you want to do operations : ( Integer or Float )");
        str = sc.nextLine().toLowerCase();
        if (str.equals("integer")) {
            System.out.println("--MULTIPLICATION--");
            String name = "Multiplication";
            takeInpu(name);
            boolean boo = isANotNumber();
            boolean foo = isBNotNumber();
            if(boo || foo){
                return;
            }

            Integer a1 = Integer.valueOf(a);

            Integer b1 = Integer.valueOf(b);
            System.out.println(Multiplication.multiplication(a1, b1));
        } else if (str.equals("float")) {
            System.out.println("--MULTIPLICATION--");
            String name="Multipliation";
            takeFloInpu(name);
            boolean foo = isANotNumberF();
            boolean boo = isBNotNumberF();
            if(foo || boo){
                return;
            }
            Float a1 = Float.valueOf(c);

            Float b1 = Float.valueOf(d);
            System.out.println(MultiplicationFloat.multiplicationFloat(a1, b1));
        } else {
            System.out.println("Enter the data type correctly ! like given");
        }
    }

    // Division Method

    public static void divisionMethod(){
        System.out.println("Enter The Data type you want to do operations : ( Integer or Float )");
        str = sc.nextLine().toLowerCase();
        if (str.equals("integer")) {
            System.out.println("--DIVISION--");
            String name ="Division";
            takeInpu(name);
            boolean boo = isANotNumber();
            boolean foo = isBNotNumber();
            if(boo || foo){
                return;
            }
            Integer a1 = Integer.valueOf(a);
            Integer b1 = Integer.valueOf(b);
            if(a1==0 || b1==0){
                System.out.println("User cannot have zero in division operands!");
            }else {
                System.out.println(Division.division(a1, b1));
            }
        } else if (str.equals("float")) {
            System.out.println("--DIVISION--");
            String name = "Division";
            takeFloInpu(name);
            boolean foo = isANotNumberF();
            boolean boo = isBNotNumberF();
            if(foo || boo){
                return;
            }
            Float a1 = Float.valueOf(c);
            Float b1 = Float.valueOf(d);
            if(a1==0 || b1==0){
                System.out.println("User cannot have zero in division operand" +
                        "ds!");
            }else {
                System.out.println(DivisionFloat.divisionFloat(a1, b1));
            }
        } else {
            System.out.println("Enter the data type correctly ! like given");
        }
    }

    //taking integer input
    public static String takeInpu(String str){
        System.out.println("Enter the values that you want to : " + str);
        a = sc.nextLine();
        b = sc.nextLine();
        return a + b;
    }
    //taking float input
    public static void takeFloInpu(String str){
        System.out.println("Enter the values that you want to : "+str);
        c = sc.nextLine();
        d = sc.nextLine();
    }

    // checking A number
    public static boolean isANotNumber(){
        boolean isANotANumber=false;
        for(int i=0 ; i<a.length() ; i++){
            char ch = a.charAt(i);
            if(!Character.isDigit(ch)){
                System.out.println(A_NOT_A_NUMBER);
                isANotANumber=true;
                break;
            }
        }
        return isANotANumber;
    }

    // checking B number

    public static boolean isBNotNumber(){
        boolean isBNotANumber = false;
        for(int i=0 ; i<b.length() ; i++){
            char ch = b.charAt(i);
            if(!Character.isDigit(ch)){
                System.out.println(B_NOT_A_NUMBER);
                isBNotANumber=true;
                break;
            }
        }
        return isBNotANumber;
    }

    // CHECKING A FLOAT NUMBERS

    //A
    public static boolean isANotNumberF(){
        boolean isANotANumberF = false;
        for(int i=0 ; i<c.length() ; i++){
            char ch = c.charAt(i);
            if(!Character.isDigit(ch) && ch != '.'){
                System.out.println(A_NOT_A_NUMBER_F);
                isANotANumberF=true;
                break;
            }
        }
        return  isANotANumberF;
    }

    //B
    public static boolean isBNotNumberF(){
        boolean isBNotANumberF = false;
        for(int i=0 ; i<d.length() ; i++){
            char ch = d.charAt(i);
            if(!Character.isDigit(ch) && ch != '.'){
                System.out.println(B_NOT_A_NUMBER_F);
                isBNotANumberF=true;
                break;
            }
        }
        return  isBNotANumberF;
    }

}