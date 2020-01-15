package gic.i4;

import jdk.jshell.Snippet;

import java.util.Scanner;

public class TP10_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;
        boolean isTrue = true;
        while (isTrue){
            try {
                System.out.print("Input the number between 1 and 7: ");
                option = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Wrong input!");
                continue;
            }

            switch (option){
                case 1:
                    System.out.println("Sunday for Red. Sunday refer to the sun, Sunlight bring bright and strong with seen as red.");
                    break;
                case 2:
                    System.out.println("Monday for Orange. It truly looks like a beautiful moon and bring a peaceful and victory.");
                    break;
                case 3:
                    System.out.println("uesday for Purple or Violet. In Khmer, Tuesday translate to Mars, which means hardness and nasty.");
                    break;
                case 4:
                    System.out.println("Wednesday for green of the plant (Blend of green and copper).");
                    break;
                case 5:
                    System.out.println("Thursday for green or yellowish green of the leaves of a banana palm.");
                    break;
                case 6:
                    System.out.println("Friday for Blue.");
                    break;
                case 7:
                    System.out.println("Saturday for ripe spine.");
                    break;
                default:
                    System.out.println("Error");
                    isTrue = false;
                    break;
            }

        }

    }
}
