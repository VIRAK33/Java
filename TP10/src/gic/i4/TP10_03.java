package gic.i4;

import java.util.Scanner;

public class TP10_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the price: ");
        float price = sc.nextFloat();

        if(price < 50){
            System.out.println("You need to paid: "+ (price-2));
        }else if (price >= 50 && price < 100){
            System.out.println("You need to paid: "+ (price * 0.97));
        }else if(price >= 100 && price < 200){
            System.out.println("You need to paid: "+ (price * 0.93));
        }else if(price >= 200 && price < 500){
            System.out.println("You need to paid: "+ (price * 0.88));
        }else if(price >= 500){
            System.out.println("You need to paid: "+ (price * 0.75));
        }
    }
}
