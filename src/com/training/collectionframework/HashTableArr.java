package com.training.collectionframework;

import java.util.Arrays;
import java.util.Hashtable;

public class HashTableArr {
    public static void main(String[] args) {
//        Hashtable<String,Integer> hashtable  = new Hashtable();
//        hashtable.put("Salman",1);

        String[] names = new String[]{"Tahir", "Salman",
                "Riyaz", "Mohaideen"};
        String indexZero = names[0];

        for(int i=0; i<names.length; i++){
            String str = names[i];

            if(str.length()> indexZero.length()){
                indexZero = str;
            }
        }

        for(int i=indexZero.length()-1; i>=0; i--){
            System.out.print(indexZero.charAt(i));
        }


    }
}
