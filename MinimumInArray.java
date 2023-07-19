package com.adarsh;
public class MinimumInArray {
    public static void main(String[] args) {
        int[] arr={10,-12,520,85,96,-96,32};
        System.out.println("Minimum is :" + min(arr));
        System.out.println("Maximum is :"+ max(arr));
    }

    static int min(int[] arr){
        int ans = arr[0];
        for(int i=0;i< arr.length;i++){
            if(arr[i]<ans){
                ans =arr[i];
            }
        }
        return  ans;
    }

    static int max(int[] arr){
        int ans = arr[0];
        for(int i=0;i< arr.length;i++){
            if(arr[i]>ans){
                ans =arr[i];
            }
        }
        return  ans;
    }
}
