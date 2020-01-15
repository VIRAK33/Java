package com.i4.itc;

import java.util.Scanner;

public class EquationXyz {
    static double x; static int y; static int z;
    public static void main(String[] args){
        System.out.print("Please input y: ");
        Scanner scy = new Scanner(System.in);
        y  = Integer.parseInt(scy.nextLine());

        System.out.print("Please input z: ");
        Scanner scz = new Scanner(System.in);
        z  = Integer.parseInt(scz.nextLine());

        x = (double)(y+z)/(y*z);

        System.out.print("Result x: " + x);
    }
}
