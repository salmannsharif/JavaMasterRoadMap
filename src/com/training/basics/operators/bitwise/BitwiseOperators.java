package com.training.basics.operators.bitwise;

public class BitwiseOperators {
    public void bitwiseOperators(){
        int a = 10;
        int b = 20;
        System.out.println(a & b); // 0010 (2)
        System.out.println(a | b); // 1010 (10)
        System.out.println(a ^ b); // 0000 (0)
        System.out.println(~a); // -11 (11111111111111111111111111110101)
        System.out.println(a << 1); // 20 (10100)
        System.out.println(a >> 1); // 5 (101)
    }
}
