package gic.i4;

import java.io.IOException;
import java.util.Scanner;

public class TP10_07 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Q1. You enter into the first room, here it is a lot of gold.\n" +
                "Whether you will take it? (A. Yes, B. No)");

        String option;
        option = sc.nextLine();
        if(option.equalsIgnoreCase("A")){
            System.out.println("Gold remains to you, but you have ruined test. GAME\n" +
                    "is over!!!");
            System.out.println("Press Enter to exit...");
            System.in.read();
        }else if(option.equalsIgnoreCase("B")){
            System.out.println("Congratulation, you have passed the first test honor!");

            System.out.println("Press Enter to next question...");
            System.in.read();

            System.out.println("Q1. You enter into the first room, here it is a lot of gold.\n" +
                    "Whether you will take it? (A. Yes, B. No)");


            option = sc.nextLine();
            if(option.equalsIgnoreCase("A")){
                System.out.println("A. Diamonds remain to you, but you have ruined the\n" +
                        "second test");
                System.out.println("Press Enter to exit...");
                System.in.read();
            }else if(option.equalsIgnoreCase("B")){
                System.out.println("B. Congratulation, you have passed the second test of\n" +
                        "honor!!!");
                System.out.println("Press Enter to next question...");
                System.in.read();
                System.out.println("Q3. You enter into the third room. A\n" +
                        "person was attacking by a dragon! To move further,\n" +
                        "not paying to them of attention? (A. Yes, B. No)");


                option = sc.nextLine();
                if(option.equalsIgnoreCase("A")){
                    System.out.println("A. You try to pass past, but a dragon notice your presence\n" +
                            "and transforms you into ashes. You are dead!!! GAME\n" +
                            "is over!!!");
                    System.out.println("Press Enter to exit...");
                    System.in.read();
                }else if(option.equalsIgnoreCase("B")){
                    System.out.println("B. Congratulation, you have pass all tests of honor.\n" +
                            "Princess gets to you!!!");

                    System.in.read();
                }
            }
        }
    }
}
