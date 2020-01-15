package com.i4.itc;

public class TP03_3_a {
    public static void triangle(int a, int b){
        for(int row=0; row<b; row++){
            for(int col =0; col<a; col++){
                    if(row == 0 || row == b-1){
                        System.out.printf("*");
                    }else{
                        if(col == 0 || col == a-1){
                            System.out.printf("*");
                        }
                        else{
                            System.out.printf(" ");
                        }
                    }
                }
            System.out.println("");
            }


        }




    public static void main(String[] a){
//        System.out.println("******************************");
//        System.out.println("*                            *");
//        System.out.println("*                            *");
//        System.out.println("*                            *");
//        System.out.println("*                            *");
//        System.out.println("******************************");


        System.out.println(" ");
        triangle(30,7);
    }


}
