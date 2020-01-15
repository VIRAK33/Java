package com.i4.itc;

import java.util.Scanner;

public class Cheater {
    public static void main(String[] args){
        System.out.print("Please input a positive number:");
        Scanner sc = new Scanner(System.in);

        int value = Integer.parseInt(sc.nextLine()) + 1;

        System.out.println("I got " + value + ". I am luckier.");
    }
}
