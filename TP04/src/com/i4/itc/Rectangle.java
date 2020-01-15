package com.i4.itc;

import java.util.Scanner;

public class Rectangle {
    static int width;
    static int height;

    Rectangle(int width, int height){
        this.height = height;
        this.width = width;
    }
    public static int perimeter(){
        return (height+width)*2;
    }
    public static int surface(){
        return height * width;
    }

    public static void main(String [] args){
        int y; int z;
        System.out.print("Please input width (in meter): ");
        Scanner scy = new Scanner(System.in);
        y  = Integer.parseInt(scy.nextLine());

        System.out.print("Please input height (in meter): ");
        Scanner scz = new Scanner(System.in);
        z  = Integer.parseInt(scz.nextLine());

        new Rectangle(y,z);

        perimeter();
        surface();

        System.out.print("Perimeter = ( " +y + "+" +z +" )  x 2 = " +perimeter()+"m\n") ;
        System.out.print("Surface = ( " +y + "*" +z +" )= " +surface()+ "m^2") ;

    }
}
