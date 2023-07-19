package com.adarsh;

import java.util.Arrays;

public class Array2Qu {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int[] brr = {4,5,6};

        int len1 = arr.length;
        int len2 = brr.length;
        int[] result = new int[len1+len2];

        System.arraycopy(arr,0,result,0,len1);
        System.arraycopy(brr,0,result,len1,len2);

        System.out.println(Arrays.toString(result));
    }

}
