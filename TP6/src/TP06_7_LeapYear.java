import java.util.Scanner;

public class TP06_7_LeapYear {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Input year: ");
        int year = sc.nextInt();

        if(year >0 && year < 100 ){
            if(year % 4 == 0){
                System.out.print(year +" is leap year! ");
            }
        }else if(year >= 100){
            if(((year % 4) == 0) && (year % 100 != 0)){
                System.out.print(year +" is leap year! ");
            }else{
                System.out.print(year +" is not leap year! ");
            }
        }else{
            System.out.print("Error year!");
        }

    }
}
