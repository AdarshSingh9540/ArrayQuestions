package com.adarsh;
public class LinearSearch2 {
    public static void main(String[] args) {
        int[] num = {12,85,76,36,91,76,21,103};
        int target =76;
        boolean ans = linearsearch3(num,target);

        System.out.println(ans);

    }
    // return index
    static  int linearsearch(int[] arr, int target){
        if(arr.length==0){
            return  -1;
        }

        for(int index=0; index<arr.length;index++){
            int element = arr[index];
            if(element==target){
                return index;
            }
        }
        return  -1;
    }
    // return element

    static  int linearsearch2(int[] arr, int target){
        if(arr.length==0){
            return  -1;
        }

        for(int index=0; index<arr.length;index++){
            int element = arr[index];
            if(element==target){
                return element;
            }
        }
        return  -1;
    }

    // return true or false
    static  boolean linearsearch3(int[] arr, int target){
        if(arr.length==0){
            return  false;
        }

        for(int index=0; index<arr.length;index++){
            int element = arr[index];
            if(element==target){
                return true;
            }
        }
        return  false;
    }



}