package com.adarsh;
import java.util.Scanner;
public class Array12 {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
        int a=5,b=14 ,c=3;
//        a= in.nextInt();
//        b = in.nextInt();
//        c = in.nextInt();

        if(a*a == b*b + c*c || b*b == a*a + c*c || c*c == a*a + b*b){
            System.out.println("Pythagoras number");
        }
        else{
            System.out.println("no");
        }
    }

}
