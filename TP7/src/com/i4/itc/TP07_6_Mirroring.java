package com.i4.itc;

import java.util.Scanner;

public class TP07_6_Mirroring {
    static void mirroring(String word){
        char [] arr = new char[word.length()];
        System.out.print(word);
        for(int i=word.length()-1; i>=0; i--){
            arr[i] = word.charAt(i);
            System.out.print(arr[i]);
        }

    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a sentence: ");
        String word = sc.nextLine();
        mirroring(word);
    }
}
