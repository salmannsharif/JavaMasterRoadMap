package com.training;

public class forClass {

    static int count = 10;

    static {
        System.out.println("the count value : " +count);
        count += 10;
        System.out.println("This is static block 1 and the count value is : "+count);
    }

    static {
        count += 10;
        System.out.println("This is static block 2 and the count value is : "+count);
    }

    public static void main(String[] args) {
        System.out.println("Count value : "+count);
    }

}
