package com.i4.itc;

public class TP07_3_Even_Numbers {
    static void even_Number(int a, int b){
        for(int i=a+2; i<= b; i+=2){
            System.out.print((i) + " ");
        }
    }


    public static void main(String[] args){
        even_Number(0,500);
    }
}
