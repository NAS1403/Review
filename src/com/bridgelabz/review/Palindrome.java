package com.bridgelabz.review;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String rev = "";
        System.out.println("Enter the string to check for palindrome");
        String str = scr.next();
        for(int i=str.length()-1;i>=0;i--){
            rev = (rev + str.charAt(i));
        }
        System.out.println(rev);
        if(str.equals(rev)){
            System.out.println("String is palindrome");
        }
        else{
            System.out.println("String is not palindrome");
        }
    }
}
