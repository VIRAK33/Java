package gic.i4;

import java.io.IOException;
import java.util.Scanner;


public class TP08_05 {

    public static void main(String[] args) throws IOException {

        Product products = new Product();
        boolean Codition = true;
        Scanner sc = new Scanner(System.in);
        int option = 0;
        do{

            System.out.println("*************************************");
            System.out.println("1. List all products");
            System.out.println("2. Add new product to the list");
            System.out.println("3. Remove product from list by index");
            System.out.println("4. Update product in list");
            System.out.println("5. Quit");
            System.out.println("*************************************");

            try {
                System.out.print("Choose an option: ");
                option = Integer.parseInt(sc.nextLine());
                System.out.println("\n________________________________");

            } catch (NumberFormatException e) {
                System.out.println("Wrong input!");
                continue;
            }

            switch (option){
                case 1:
                    products.showProduct();
                    System.out.println("Press Enter to continue...");
                    System.in.read();
                    break;
                case 2:
                    products.addNewProduct();
                    System.out.println("Press Enter to continue...");
                    System.in.read();
                    break;
                case 3:
                    products.removeProduct();
                    System.out.println("Press Enter to continue...");
                    System.in.read();
                    break;
                case 4:
                    products.updateProduct();
                    System.out.println("Press Enter to continue...");
                    System.in.read();
                    break;
                case  5:
                    Codition =false;
                    break;

            }

        }while(Codition);

    }
}
