package com.training.basics.datatypes;

public class DataTypes {
    public static void main(String[] args) {
        byte a = 127; // range -128 to 127
        System.out.println(a);
        short b = 32767;  // range -32767 to 32767
        System.out.println(b);
        int c = 1000000000; // range  -2,147,483,648 to 2,147,483,647
        System.out.println(c);
        char ch = 'c'; // Stores a single character/letter or ASCII values
        System.out.println(ch);
        float e = 10.12345678f; // Sufficient for storing 6 to 7 decimal digits
        System.out.println(e);
        double d = 10.3433d; //  Sufficient for storing 15 to 16 decimal digits
        System.out.println(d);
        long f = 1000003123; // range  -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        System.out.println(f);
    }
}
