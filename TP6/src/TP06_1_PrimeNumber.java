import java.util.Scanner;

public class TP06_1_PrimeNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int isPrime =0;
        int num = 0;
        String divisibleNumber = "";
        System.out.print("Input number to check whether it is prime number: ");
        int value = Integer.parseInt(sc.nextLine());

        if(value<=2){
            System.out.println(value + " is not prime number, because it is less than or equals to 2.");
        }else{
            int halfNumber = value /2;
            for(int i=2; i<= halfNumber; i++){
                if(value % i == 0) divisibleNumber += " " + i;
            }
            if(divisibleNumber.length() > 0){
                System.out.println("It is now a prime number, " +
                        "because it is divisible by "+ divisibleNumber);
            }
            else {
                System.out.println("It is a prime number.");
            }
        }


        if(!(isPrime == 1)){
            System.out.println(value + " is not prime number, because it is divisible to " + num + ".");
        }else{
            System.out.println(value + " is prime number");
        }
    }
}
