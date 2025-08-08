package com.training;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WorkPlace {

//    static void methodOne(int[] arr){
//        arr[2] = 300;
//        arr[6] = 700;
//    }

    private static final String regularExpression = "^[a-zA-Z][^?]{7,}$\n";

    //welcometojava
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);
        for (int i = 0; i <= s.length()-k; i++) {
            String stub = s.substring(i, i + k);
            if(stub.compareTo(smallest) < 0) {
                smallest = stub;
            }
            if(stub.compareTo(largest) > 0) {
                largest = stub;
            }
        }

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {

//        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
//        arr1[2] = 30;
//        arr1[6] = 70;
//        methodOne(arr1);
//        System.out.println(arr1[2]);
//        System.out.println(arr1[6]);

//    -------------------------
//        String regex = "\\b(\\w+)(\\s+\\1\\b)+";
//        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
//
        Scanner in = new Scanner(System.in);
//        int numSentences = Integer.parseInt(in.nextLine());
//
//        while (numSentences-- > 0) {
//            String input = in.nextLine();
//
//            Matcher m = p.matcher(input);
//
//            // Check for subsequences of input that match the compiled pattern
//            while (m.find()) {
//                input = input.replaceAll(m.group(0), m.group(1));
//            }
//
//            // Prints the modified sentence.
//            System.out.println(input);
//        }
//
//        in.close();
//        -------------------------
//        int n = Integer.parseInt(in.nextLine());
//        while (n-- != 0) {
//            String userName = in.nextLine();
//
//            if (userName.matches(WorkPlace.regularExpression)) {
//                System.out.println("Valid");
//            } else {
//                System.out.println("Invalid");
//            }
//        }
//        -------------------------
//        String a=in.next();
//        String b=in.next();
        /* Enter your code here. Print output to STDOUT. */
//        String length = a+b;
//        System.out.println(length.length()); // System.out.println(a.length() + b.length());
//        System.out.println(a.compareTo(b) > 0 ? "Yes" : "No");
//        System.out.println(a.substring(0,1).toUpperCase() + a.substring(1) + " " + b.substring(0,1).toUpperCase() + b.substring(1));

        String s = in.next();
        int k = in.nextInt();
        System.out.println( getSmallestAndLargest(s, k) );


    }
}
