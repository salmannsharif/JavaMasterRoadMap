package com.training.java8features.base64;

import java.util.Base64;

public class EncodeDecode {
    public static String encode(String str){
        Base64.Encoder encoder = Base64.getEncoder();
        byte[] encoded = encoder.encode(str.getBytes());
        return new String(encoded);
    }

    public static String decode(String str){
        Base64.Decoder decoder = Base64.getDecoder();
        byte[] decoded = decoder.decode(str);
        return new String(decoded);

    }

    public static void main(String[] args)  {
        String data = "this is secret message from american agent vladimir to american officials ,We are f***ed , Russians launched their nuclear weapons toward U.S";
        String encodedString = encode(data);
        System.out.println("Encoded format : " + encodedString);
        System.out.println("Decoded format : "+(decode(encodedString)));
    }
}
