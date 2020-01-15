package gic.i4.TP09_02;

import java.util.ArrayList;
import java.util.Scanner;

public class SMSList {
    ArrayList<SMS> smsArrayList = new ArrayList<SMS>();
    static int max_characters_per_sms = 0;

    public SMSList(ArrayList<SMS> smsArrayList) {
        this.smsArrayList = smsArrayList;
    }

    void sendSMS(){
        String subject;
        String fromNumber, receiveNumber;
        Boolean text = false;
        String content;
        Boolean _new = false;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the subject: ");
        subject = sc.nextLine();
        System.out.println("Enter your number: ");
        fromNumber = sc.nextLine();
        System.out.println("Sent to (Number): ");
        receiveNumber = sc.nextLine();
        System.out.println("Type of message: Text | MMS?");
    }

}
