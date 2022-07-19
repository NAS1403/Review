package com.bridgelabz.review;

import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {

        Scanner scr =new Scanner(System.in);
        System.out.println("Enter any Number to find its prime factors  ");
        int n = scr.nextInt();

        System.out.println("Prime Factors are : " );
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                System.out.println(i + " ");
                n = n / i;
            }
        }
    }
}
