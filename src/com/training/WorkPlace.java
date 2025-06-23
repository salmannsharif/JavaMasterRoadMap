package com.training;

public class WorkPlace {

    static void methodOne(int[] arr){
        arr[2] = 300;
        arr[6] = 700;
    }

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        arr1[2] = 30;
        arr1[6] = 70;
        methodOne(arr1);
        System.out.println(arr1[2]);
        System.out.println(arr1[6]);
    }
}
