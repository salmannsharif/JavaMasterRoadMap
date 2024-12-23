package com.training.basics.datatypes.type_casting;

public class TypeCasting {
    public static void main(String[] args) {

        // === Implicit Type Casting (Widening) ===
        System.out.println("=== Implicit Type Casting (Widening) ===");
        int intValue = 10;
        long longValue = intValue; // int to long
        float floatValue = longValue; // long to float
        double doubleValue = floatValue; // float to double
        System.out.println("int to long: " + longValue);
        System.out.println("long to float: " + floatValue);
        System.out.println("float to double: " + doubleValue);

        // === Explicit Type Casting (Narrowing) ===
        System.out.println("\n=== Explicit Type Casting (Narrowing) ===");
        double largeDoubleValue = 1234.56;
        float floatValue2 = (float) largeDoubleValue; // double to float
        long longValue2 = (long) floatValue2; // float to long
        int intValue2 = (int) longValue2; // long to int
        System.out.println("double to float: " + floatValue2);
        System.out.println("float to long: " + longValue2);
        System.out.println("long to int: " + intValue2);

        // === int to String and String to int ===
        System.out.println("\n=== String and Numeric Conversions ===");
        int intToString = 42;
        String stringValue1 = String.valueOf(intToString); // int to string
        System.out.println("int to String: " + stringValue1);
        String stringToInt = "42";
        int parsedInt = Integer.parseInt(stringToInt); // string to int
        System.out.println("String to int: " + parsedInt);

        // === String to float and float to String ===
        String stringToFloat = "3.14";
        float parsedFloat = Float.parseFloat(stringToFloat); // string to float
        System.out.println("String to float: " + parsedFloat);
        String floatToString = String.valueOf(parsedFloat); // float to string
        System.out.println("float to String: " + floatToString);

        // === char to int and int to char ===
        System.out.println("\n=== char to int and int to char ===");
        char charValue = 'A';
        int charToInt = (int) charValue; // char to int
        System.out.println("char to int: " + charToInt);
        int intToChar = 66;
        char intToCharacter = (char) intToChar; // int to char
        System.out.println("int to char: " + intToCharacter);

        // === Implicit Type Casting Examples ===
        System.out.println("\n=== Implicit Type Casting Examples ===");
        byte byteValue = 50;
        short shortValue = byteValue; // byte to short
        int implicitInt = shortValue; // short to int
        double implicitDouble = implicitInt; // int to double
        System.out.println("byte to short: " + shortValue);
        System.out.println("short to int: " + implicitInt);
        System.out.println("int to double: " + implicitDouble);

        // === Explicit Type Casting Examples ===
        System.out.println("\n=== Explicit Type Casting Examples ===");
        double preciseDouble = 12345.6789;
        long narrowedLong = (long) preciseDouble; // double to long
        int narrowedInt = (int) preciseDouble; // double to int
        System.out.println("double to long: " + narrowedLong);
        System.out.println("double to int: " + narrowedInt);
    }
}
