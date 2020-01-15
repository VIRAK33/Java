package com.i4.itc;

import java.util.Scanner;

public class TP07_4_Company_Profits {

    static float profits(){
        Scanner sc = new Scanner(System.in);
        float [] arr = new float[12];
        float total = 0;
        for (int i = 0; i<12; i++){
            System.out.print("Profit for month " + (i+1) + " : ");
            arr[i] = sc.nextInt();
            total += arr[i];
        }
        return total;
    }


    public static void main(String [] args){
        System.out.print("\nTotal profits for 12 months: "+profits());
    }
}
