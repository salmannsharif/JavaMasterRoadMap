package com.training.basicsolutions;

import java.util.Arrays;
import java.util.Scanner;

public class AllInOne {
    private static String name = "salman";

    public AllInOne(){
        System.out.println("Default Constructor Invoked");
    }


    public AllInOne(int v){
        this();
        System.out.println("Param construct");
    }

    public void firstProgram(){

    }

    public static void main(String[] args) {
        AllInOne allInOne = new AllInOne(10);
    }
    public static void dataTypes(){
        byte a = 127;
        System.out.println(a);
        short b = 32767;
        System.out.println(b);
        int c = 1000000000;
        System.out.println(c);
        char ch = 'c';
        System.out.println(ch);
        float e = 10.12345678f;
        System.out.println(e);
        double d = 10.3433d;
        System.out.println(d);
        long f = 1000003123;
        System.out.println(f);
    }

    public static void operators(){
        int a = 10, b = 20;
        // Arithmetic Operators
//        System.out.println(a+b);
//        System.out.println(a-b);
//        System.out.println(a*b);
//        System.out.println(a/b);
//        System.out.println(a%b);

        // Assignment
//        System.out.println(a=b);
//        System.out.println(a+=b);
//        System.out.println(a-=b);
//        System.out.println(a*=b);
//        System.out.println(a/=b);
//        System.out.println(a%=b);

        // Comparison
//        System.out.println(a>b);
//        System.out.println(a<b);
//        System.out.println(a>=b);
//        System.out.println(a<=b);
//        System.out.println(a==b);
//        System.out.println(a!=b);

        // Logical Operator
//        System.out.println(a>b && b<a);
//        System.out.println(a<b && b>a);
//        System.out.println(a>b || b>a);

//        Ternary ?: , unary Operators ++ , --
    }

    public static  void reverseString(){
        String[] str = "this is salman from chennai".split(" ");

//        for(int i=str.length()-1; i>=0 ; i--){
//            System.out.print(str.charAt(i));
//        }
//
        for(int i=str.length-1 ; i>=0 ; i--){
            System.out.print(str[i]+" ");
        }

        String string = "this is string";
        String [] charArray = string.split(" ");
        String reverse="";
        for(int i = charArray.length-1 ; i >= 0; i--) {
            reverse =   reverse + charArray[i]+ " ";
        };
        System.out.println(reverse);


    }

    public static void lengthOfString(String str){
        System.out.println(str.length());
    }

    public static void findVowels(String str){
        int vowels=0, spaces=0 , consonant=0;
        for(int i=0 ; i<str.length() ; i++){
            char ch = str.charAt(i);
            if( ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                vowels++;
            }else {
                consonant++;
            }
            if(Character.isWhitespace(ch)){
                spaces++;
            }
        }
        System.out.println("Number of Vowels in given String : "+vowels);
        System.out.println("Number of Consonants in given String : "+consonant);
        System.out.println("Number of Spaces in given String : "+spaces);

    }

    public static void palindrome(String str){
        int length = str.length();
        boolean isPalindrome = true;
        for(int i=0 ; i<length/2 ; i++){
            if(str.charAt(i) != str.charAt(length-i-1)){
                isPalindrome=false;
                break;
            }
        }
        if(isPalindrome){
            System.out.println("Given string is palindrome");
        }else{
            System.out.println("Given string is not palindrome");
        }
    }

    public static  void swap(){
        int a = 10 , b = 20 , temp;
        System.out.println("Before : ");
        System.out.format(" a value  is %d and b value is %d",a,b);
        System.out.println();
        temp = a;
        a = b ;
        b = temp;
        System.out.println("After Swapping :");
        System.out.format(" a value is %d and b value is %d",a,b);
    }

    public static void typeCast(){
        String str = "123";
        float n = 10.98f;
        float i = Float.valueOf(str);
        System.out.println(i);
    }

    public static void ascii(){
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        int n = (int) ch;
        System.out.println(n);
    }

    public static void findingLargerNum(){
        int a = 100 , b = 20 , c = 30;

        if(a>b && a>c){
            System.out.println("Largest value is : " + a);
        }else if(b>a && b>c){
            System.out.println("Largest value is : " +b);
        }else {
            System.out.println("Largest value is : "+c);
        }

    }

    public static void factorial(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int fact=1;
        for(int i=1 ; i<=num ; i++){
            fact*=i;
        }
        System.out.println(fact);

    }

    public static void fibonacci(){
        int n1 = 0 , n2 = 1 , n3;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i=0;
        System.out.print(n1 + " " + n2 + " ");
        while(i<=num){
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
            i++;
        }
    }

    public static void occurences(){
        String name = "salman";
        for(int i=0 ; i<name.length() ; i++){
            char ch = name.charAt(i);
            int count = 0;
            for(int j=0 ; j<name.length(); j++){
                if(ch == name.charAt(j)){
                    count++;
                }
            }
            System.out.println(ch + " " + count);
        }
    }

    public static void fizzBuzz(){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%3==0){
            System.out.println("Fizz");
        }else if(n%5==0){
            System.out.println("Buzz");
        }
        else{
            System.out.println(n);
        }

    }

    public static boolean isAnagram(String str_1 , String str_2){

        if(str_1.length() !=  str_2.length()){
            return false;
        }

        char[] ch_1 = str_1.toCharArray();
        char[] ch_2 = str_2.toCharArray();

        Arrays.sort(ch_1);
        Arrays.sort(ch_2);

        return Arrays.equals(ch_1 , ch_2 );


    }

//    public static boolean isAnagram(String str_1 , String str_2){
//        String str_1 = "listen";
//        String str_2 = "silent";
//
//        boolean result = isAnagram(str_1 , str_2);
//
//        if(result){
//            System.out.println(str_1 +" and " + str_2  + " are anagrams");
//        }else{
//            System.out.println(str_1 +" and " + str_2 +  "are not anagrams");
//        }
//    }

    public static void  isUnique(){
        String str = "salman";
        boolean [] visited = new boolean[str.length()];
        for(int i=0 ; i<str.length() ; i++){
            char ch = str.charAt(i);
            if(visited[i]) {
                continue; // If visited, skip to next iteration
            }
            boolean dupOccur=false;
            for(int j = i+1 ; j<str.length() ; j++){
                if(ch == str.charAt(j)){
                    dupOccur=true;
                    visited[j] = true;
                }
            }
            if(!dupOccur){
                System.out.println(ch);
            }
            visited[i]=true;
        }

    }

    public static boolean isValidFloatPoint(String str){
        if(str==null || str.isEmpty()){
            return false;
        }
        try {
            Double.parseDouble(str);
            return true;
        }
        catch (NumberFormatException e){
            System.out.println("Exception Occur : " + e);
            return false;
        }
    }

    public static void startPatterns() {
        int n = 5;
        for (int x = 0; x < n; x++) {
            for (int y = 0; y < n; y++) {
                if (x == 0 || x == 4 || y == 4 || y == 0 || (x + y) == n - 1 || x == y) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }


    }



    public static void main1(String[] args) {
        //Hello World Program
//        firstProgram();

//        jdk - jdk stands for java development kit and its have set of libraries
//        and predefined class and interfaces with the help of those we can
//        develop java applications

//        jre - jre stands for java runtime environment , its also have some
//        predefined classes and methods like javac , with the help of those
//        we can execute java programs

//        jvm - jvm stands for java virtual machine , it is used to convert
//        byte code into machine code I mean low level language which machine
//        can understand for example binary code like 0 and 1

//          DataType
//          Data type is used to declare type of the value that variable can hold
//          we have these types of data types in java
//          byte , short , int , char , float , double , long , bool
//          dataTypes();

//          Operators
//          Operators is used to perform operations on values and
//          we have operators in java like
//          Arithmetic Operators , Assignment Operators , Comparison , Logical
//          bitwise , ternary , increment , decrement
//          operators();

//          Keywords also called reserved words , we can't use keywords as
//          a identifiers . examples are int , char ,switch , class , interface etc...


//            Control Statements
//            Control Statements is a block of code that is used to execute the program
//            based on condition

//            Reverse String
//        reverseString();

//            Length of the string
//            lengthOfString("Salman");

//            Vowels
//            findVowels("Hey GoodMorning");

//            String - Immutable , its stores data in string pool , efficiency is slow
//            StringBuffer - mutable , its stores data on heap memory , fastest compare to string and less compare builder
//            StringBuilder mutable , its stored data on heap memory , very fasted

//        String str = "this is string";
//        StringBuffer stringBuffer = new StringBuffer("this is string buffer");
//        StringBuilder stringBuilder = new StringBuilder("this is string builder");

//            Palindrome
//            palindrome("palindrome");

//            Swap Numbers Using Temp Var
//              swap();

//             Type Casting
//               typeCast();

//        Ascii value of given character
//          ascii();

//        findingLargerNum();

//         factorial();

//        fibonacci();

          occurences();
        // isAnagram();

//	isUnique();


//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        if(isValidFloatPoint(str.trim())){
//            System.out.println("Given string is a valid floating Point");
//        }else{
//            System.out.println("Given string is a not valid floating point");
//        }



    }
}