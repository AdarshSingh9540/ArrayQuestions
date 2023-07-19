package com.adarsh;

import java.util.Arrays;

public class Array3Qe {
    public static int[] calculateRunningSum(int[] nums) {
        int[] runningSum = new int[nums.length];
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            runningSum[i] = sum;
        }

        return runningSum;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int[] runningSum = calculateRunningSum(nums);

//        System.out.println("Running Sum:");
//        for (int sum : runningSum) {
//            System.out.print(sum + " ");
//        }
        System.out.println(Arrays.toString(runningSum));
    }

};

