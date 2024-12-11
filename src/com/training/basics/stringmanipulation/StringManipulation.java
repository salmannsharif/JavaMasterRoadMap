package com.training.basics.stringmanipulation;

import java.util.Arrays;

public class StringManipulation {

    String str = "Hey, this is a sample string for testing";

    public static void main(String[] args) {

        StringManipulation obj = new StringManipulation();

        System.out.println("Original String: " + obj.str);
        System.out.println("Uppercase: " + obj.toUpperCase());
        System.out.println("Lowercase: " + obj.toLowerCase());
        System.out.println("Concatenated: " + obj.conCat());
        System.out.println("Split: " + String.join(", ", obj.split()));
        System.out.println("Length: " + obj.length());
        System.out.println("Substring: " + obj.substring(5, 10));
        System.out.println("Replace: " + obj.replace("this", "that"));
        System.out.println("Starts with 'Hey': " + obj.startsWith("Hey", 0));
        System.out.println("Ends with 'g': " + obj.endsWith("g"));
        System.out.println("Equals: " + obj.equals("Hey, this is a sample string for testing"));
        System.out.println("Equals Ignore Case: " + obj.equalsIgnoreCase("hey, this is a sample string for testing"));
        System.out.println("Trim: '" + obj.trim() + "'");
        System.out.println("Split by Comma: " + String.join(", ", obj.splitByComma()));
        System.out.println("Index of 'sample': " + obj.indexOf("sample"));
        System.out.println("Last Index of 's': " + obj.lastIndexOf("s"));
        System.out.println("Character at index 0: " + obj.charAt(0));
        System.out.println("Get Byte: " + Arrays.toString(obj.getBytes()));
//        System.out.println("Repeat 2 times: " + obj.repeat(5));
        System.out.println("Formatted String: " + obj.format("Hello %s", "World"));
        System.out.println("Contains 'sample': " + obj.contains("sample"));

    }

    public String toUpperCase() {
        return str.toUpperCase();
    }

    public String toLowerCase() {
        return str.toLowerCase();
    }

    public String conCat() {
        return str.concat(" concat");
    }

    public String[] split() {
        return str.split(" ");
    }

    public int length() {
        return str.length();
    }

    public String substring(int start, int end) {
        return str.substring(start, end);
    }

    public String replace(String oldStr, String newStr) {
        return str.replace(oldStr, newStr);
    }

    public boolean startsWith(String prefix, int offset) {
        return str.startsWith(prefix, offset);
    }

    public boolean endsWith(String suffix) {
        return str.endsWith(suffix);
    }

    public boolean equals(String otherStr) {
        return str.equals(otherStr);
    }

    public boolean equalsIgnoreCase(String otherStr) {
        return str.equalsIgnoreCase(otherStr);
    }

    public byte[] getBytes() {
        return str.getBytes();
    }

    public String trim() {
        return str.trim();
    }

    public String[] splitByComma() {
        return str.split(", ");
    }

    public int indexOf(String substring) {
        return str.indexOf(substring);
    }

    public int lastIndexOf(String substring) {
        return str.lastIndexOf(substring);
    }

    public String charAt(int index) {
        return String.valueOf(str.charAt(index));
    }

//        public String repeat(int count) {
//            return str.repeat(count);
//        }

    public String valueOf(Object obj) {
        return String.valueOf(obj);
    }

    public String format(String format, Object... args) {
        return String.format(format, args);
    }

    public boolean contains(String sequence) {
        return str.contains(sequence);
    }
}
