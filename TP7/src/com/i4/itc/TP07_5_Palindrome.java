package com.i4.itc;

import java.util.Scanner;

public class TP07_5_Palindrome {
    static void palindrome(String word){
        int leangth = word.length();
        String revers = "";
        for(int i=leangth - 1; i>= 0; i--){
            revers = revers + word.charAt(i);
        }


        if(word.equals(revers)){
            System.out.print("Palindrome");
        }else{
            System.out.print("Is not palindrome");
        }
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input string: ");
        String word = sc.nextLine();
        palindrome(word);
    }
}
