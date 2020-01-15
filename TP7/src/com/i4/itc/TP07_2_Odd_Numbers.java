package com.i4.itc;

public class TP07_2_Odd_Numbers {

    static void odd_Number(int a, int b){
        for(int i=a; i< b; i+=2){
            System.out.print((i+1) + " ");
        }
    }


    public static void main(String[] args){
        odd_Number(0,500);
    }
}
