package com.i4.itc;

import java.util.Scanner;

public class HundredCounter {
    static int count;
    public static void main(String[] args){
        System.out.print("Please input a positive number: ");
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        count = n / 100;

        System.out.print("There are "+ count +" hundred in number " + n);
    }
}
