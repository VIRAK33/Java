import java.io.IOException;
import java.util.Scanner;

public class TP06_4_MoneyExchange {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int option = 0;
        float input = 0;
        Boolean flage = true;
        while (flage){
            float result = 0;
            System.out.print("1. Riels to Dollar\n" +
                    "2. Riels to Thai Baht\n" +
                    "3. Dollar to Riels\n" +
                    "4. Dollar to Thai Baht\n" +
                    "5. Thai Baht to Riels\n" +
                    "6. Exit\n" +
                    "Choose an option: ");
            option = sc.nextInt();
            switch (option){
                case 1:
                    System.out.print("Input money in Riels: ");
                    input = sc.nextFloat();
                    result = input / 4000;
                    System.out.print(input + " RIELS = " + result+" USD \n");
                    System.out.println("Press Enter to continue...");
                    System.in.read();
                    break;
                case 2:
                    System.out.print("Input money in Riels: ");
                    input = sc.nextFloat();
                    result = (input * 10)/ 1300;
                    System.out.print(input + " RIELS = " + result+" Baht \n");
                    System.out.println("Press Enter to continue...");
                    System.in.read();
                    break;
                case 3:
                    System.out.print("Input money in Dollar: ");
                    input = sc.nextFloat();
                    result = (input * 4000 );
                    System.out.print(input + " Dollar = " + result+" Reils \n");
                    System.out.println("Press Enter to continue...");
                    System.in.read();
                    break;
                case 4:
                    System.out.print("Input money in Dollar: ");
                    input = sc.nextFloat();
                    result = (input * 31 );
                    System.out.print(input + " Dollar = " + result+" Baht \n");
                    System.out.println("Press Enter to continue...");
                    System.in.read();
                    break;
                case 5:
                    System.out.print("Input money in Baht: ");
                    input = sc.nextFloat();
                    result = (input * 130 );
                    System.out.print(input + " Baht = " + result+" Reils \n");
                    System.out.println("Press Enter to continue...");
                    System.in.read();
                    break;
                case 6:
                    System.out.print("Bye Bye");
                    flage = false;
                    break;
                    default:
                        System.out.println("Please input only number 1 to 6");

            }
        }
    }
}
