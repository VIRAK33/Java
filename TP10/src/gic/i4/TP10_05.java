package gic.i4;

import java.util.Scanner;

public class TP10_05 {
    public static void main(String[] args) {
        String value = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("Input number: ");
        value = sc.nextLine();
        int va = Integer.parseInt(value);

        char a = value.charAt(0);
        char b = value.charAt(1);

        int c = Character.getNumericValue(a);
        int d = Character.getNumericValue(b);

        if((Math.pow((c+d),3))==(Math.pow(va,2))){
            System.out.println("Equal");
        }else{
            System.out.println("Not equal");
        }
    }
}
