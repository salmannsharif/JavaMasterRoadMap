package com.training.basics.arrays;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Arrays are one of the most commonly used data structures in Java
 * for storing a collection of elements.
 *
 * - An array can hold both primitive data types (int, char, double, etc.)
 *   as well as objects.
 *
 * - The elements of an array are stored in contiguous (continuous) memory
 *   locations, which makes accessing elements very efficient.
 *
 * - Each element in the array can be accessed directly using its index.
 *   (Indexing in Java arrays starts from 0).
 *
 * - The size of an array is fixed at the time of creation.
 *   Once defined, its length cannot be changed, which means
 *   we cannot increase or decrease the array size dynamically.
 *
 * Arrays are useful when we know the exact number of elements
 * in advance and need fast access based on index.
 */

public class ArraysClass {

    // Operation on Arrays

    public static void printingArray(int[] arr) {
        for (int j : arr) {
            System.out.println(j);
        }
    }

    public static int findingLengthOfAnArray(int[] arr) {
        return arr.length;
    }

    public static void accessFirstLastAndMiddle(int[] arr) {
        System.out.println(arr[0]);
        int last = arr.length - 1;
        System.out.println(arr[last]);
        int middle = arr.length / 2;
        System.out.println(middle);
    }

    public static void sumOfArray(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        System.out.println(sum);
    }

    public static void findingDuplicate(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                System.out.println(arr[i]);
            }
        }
    }

    public static void reverseArray(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void findingLargestAndSmalledNum(int[] arr) {
        int max = arr[0];
        int min = arr[0];

        for (int j : arr) {
            if (j > max) {
                max = j;
            }
            if (j < min) {
                min = j;
            }
        }

        System.out.println("Largest number : " + max);
        System.out.println("Smallest number : " + min);
    }

    public static void countingFrequency(int[] arr) {
        int target = 11;
        int count = 0;
        for (int num : arr) {
            if (num == target) count++;
        }
        System.out.println("2 appears " + count + " times");
    }

    public static void sortingAnArray(int[] arr) {
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.print(arr[i] + " ");
        }
    }

    public static void palindrome(String strArr) {
        boolean isPalindrome = true;
        int length = strArr.length() / 2;
        for (int i = 0; i < length; i++) {
            if (strArr.charAt(i) != strArr.charAt(strArr.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("Given array is palindrome");
        } else {
            System.out.println("Given array is not an palindrome");
        }
    }

    public static void removingDuplicates(int[] arr) {
        Set<Integer> collect = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.toSet());
        System.out.println(collect);
    }

    public static void mergingTwoArray(int[] arr) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] merge = new int[arr.length + arr1.length];

        for (int i = 0; i < arr.length; i++) {
            merge[i] = arr[i];
        }
        for (int j = 0; j < arr1.length; j++) {
            merge[arr.length + j] = arr1[j];
        }

        System.out.println("Merged Array: " + Arrays.toString(merge));
    }

    // ---------------- Extra Array Operations ----------------

    // Linear Search
    public static void linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Element " + target + " found at index: " + i);
                return;
            }
        }
        System.out.println("Element " + target + " not found");
    }

    // Binary Search (sorted array required)
    public static void binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                System.out.println("Element " + target + " found at index: " + mid);
                return;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println("Element " + target + " not found");
    }

    // Rotate array left
    public static void leftRotate(int[] arr) {
        int first = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = first;

        System.out.println("Array after left rotation: " + Arrays.toString(arr));
    }

    // Rotate array right
    public static void rightRotate(int[] arr) {
        int last = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = last;

        System.out.println("Array after right rotation: " + Arrays.toString(arr));
    }

    // Second largest and second smallest
    public static void secondLargestAndSmallest(int[] arr) {
        Arrays.sort(arr);
        System.out.println("Second Smallest: " + arr[1]);
        System.out.println("Second Largest: " + arr[arr.length - 2]);
    }

    // Check if array is sorted
    public static void isArraySorted(int[] arr) {
        boolean sorted = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                sorted = false;
                break;
            }
        }
        System.out.println("Is array sorted? " + sorted);
    }

    // Intersection of two arrays
    public static void intersectionOfArrays(int[] arr1, int[] arr2) {
        Set<Integer> set1 = Arrays.stream(arr1).boxed().collect(Collectors.toSet());
        Set<Integer> set2 = Arrays.stream(arr2).boxed().collect(Collectors.toSet());
        set1.retainAll(set2);
        System.out.println("Intersection: " + set1);
    }

    // Union of two arrays
    public static void unionOfArrays(int[] arr1, int[] arr2) {
        Set<Integer> set = Arrays.stream(arr1).boxed().collect(Collectors.toSet());
        set.addAll(Arrays.stream(arr2).boxed().collect(Collectors.toSet()));
        System.out.println("Union: " + set);
    }

    // Clone array
    public static void cloneArray(int[] arr) {
        int[] clone = arr.clone();
        System.out.println("Cloned array: " + Arrays.toString(clone));
    }

    // Split array into two halves
    public static void splitArray(int[] arr) {
        int mid = arr.length / 2;
        int[] firstHalf = Arrays.copyOfRange(arr, 0, mid);
        int[] secondHalf = Arrays.copyOfRange(arr, mid, arr.length);

        System.out.println("First half: " + Arrays.toString(firstHalf));
        System.out.println("Second half: " + Arrays.toString(secondHalf));
    }

    // Copy array manually
    public static void manualCopy(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        System.out.println("Copied array: " + Arrays.toString(newArr));
    }

    public static void main(String[] args) {

        int[] intArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] intArr2 = {5, 6, 7, 20, 30};

        // Uncomment the methods you want to test
//        findingDuplicate(intArr);
//        printingArray(intArr);
//        System.out.println(findingLengthOfAnArray(intArr));
//        accessFirstLastAndMiddle(intArr);
//        sumOfArray(intArr);
//        findingLargestAndSmalledNum(intArr);
//        reverseArray(intArr);
//        countingFrequency(intArr);
//        sortingAnArray(intArr);
//        palindrome("madam");
//        removingDuplicates(intArr);
//        mergingTwoArray(intArr);
//
//        linearSearch(intArr, 7);
//        binarySearch(intArr, 8);
//        leftRotate(intArr);
//        rightRotate(intArr);
//        secondLargestAndSmallest(intArr);
//        isArraySorted(intArr);
//        intersectionOfArrays(intArr, intArr2);
//        unionOfArrays(intArr, intArr2);
//        cloneArray(intArr);
//        splitArray(intArr);
//        manualCopy(intArr);

    }
}
