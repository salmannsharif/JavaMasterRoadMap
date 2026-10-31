package com.training.leetcodeissues;

import java.util.Arrays;
import java.util.Scanner;

class Solution{

    public int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length; j++){
                if(i!=j){
                    if(nums[i]+nums[j] == target){
                        return new int[]{i, j};
                    }
                }
            }
        }
        return new int[]{-1,-1};
    }

}

public class TwoSum {
    public static void main(String[] args) {

        Solution s = new Solution();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [] nums = new int[n];

        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        int[] ints = s.twoSum(nums, target);

        System.out.println(Arrays.toString(ints));

    }
}
