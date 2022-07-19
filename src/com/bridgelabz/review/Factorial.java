package com.bridgelabz.review;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int fact = 1;

        System.out.println("Enter a number find its factorial");
        int n = scr.nextInt();
        int num = n;
        while(n>0){
            fact = fact*(n);
            n--;
        }
        System.out.println("Factorial of "+num+" is "+fact);
    }
}
