package com.training.basics.datatypes;

public class PrimitiveDatatypes {
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

    /*DataType  DefaultValue	    DefaultSize	            Range
    byte	        0	        1 byte or 8 bits	    -128 to 127
    short	        0     	    2 bytes or 16 bits	    -32,768 to 32,767
    int	            0           4 bytes or 32 bits	    2,147,483,648 to 2,147,483,647
    long	        0	        8 bytes or 64 bits	    9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
    float	        0.0f	    4 bytes or 32 bits	    1.4e-045 to 3.4e+038
    double	        0.0d	    8 bytes or 64 bits	    4.9e-324 to 1.8e+308
    char	        ‘u0000’	    2 bytes or 16 bits	    0 to 65536
    boolean	        FALSE	    1 byte or 2 bytes	    0 or 1*/
}
