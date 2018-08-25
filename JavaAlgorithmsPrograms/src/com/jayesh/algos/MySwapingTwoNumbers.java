package com.jayesh.algos;
/**How to swap two numbers without using temporary variable?

Description:
Write a program to swap or exchange two numbers. You should
not use any temporary or third variable to swap.*/

public class MySwapingTwoNumbers {
 
    public static void main(String a[]){
        int x = 30;
        int y = 20;
        System.out.println("Before swap:");
        System.out.println("x value: "+x);
        System.out.println("y value: "+y);
        x = x+y;
        y=x-y;
        x=x-y;
        System.out.println("After swap:");
        System.out.println("x value: "+x);
        System.out.println("y value: "+y);
    }
}