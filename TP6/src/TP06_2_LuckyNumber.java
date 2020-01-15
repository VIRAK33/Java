import java.util.Scanner;

public class TP06_2_LuckyNumber {
    public static void main(String[] args){
        int second = 0;
        int first = 0; int  third=0; int fourth = 0; int fith =0; int six=0;

        int [] arr = new int[4];
        Scanner sc = new Scanner(System.in);
        System.out.println("Program for testing for lucky number.\n" +
                "Please input 6 digits number: 2020");
        String input = sc.nextLine();

        if(input.length()== 6){
            first = Integer.parseInt(input.substring(0,1));
            second = Integer.parseInt(input.substring(1,2));
            third = Integer.parseInt(input.substring(2,3));
            fourth = Integer.parseInt(input.substring(3,4));
            fith = Integer.parseInt(input.substring(4,5));
            six = Integer.parseInt(input.substring(5,6));

            if( (first + second + third) == (fourth+ fith + six)){
                System.out.println( input+" is lucky number");
            }else {
                System.out.println( input+" is not lucky number");
            }

        }else{
            System.out.println("Invalid input number, please input only 6 digits number.");
        }








    }
}
