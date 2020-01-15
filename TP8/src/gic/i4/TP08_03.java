package gic.i4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

class PC{

    String pName;
    String pQuality;
    int pYear;

    PC(String pName, String pQuality, int pYear){

        this.pName = pName;
        this.pQuality = pQuality;
        this.pYear = pYear;
    }
    public String getpQuality(){
        return  pQuality;
    }
    public String getpName(){
    return pName;
    }
    public int getpYear(){
        return  pYear;
    }
}

public class TP08_03 {

    static ArrayList<PC> allPC = new ArrayList<PC>();
    static ArrayList<PC> damagePC = new ArrayList<PC>();
    static ArrayList<PC> goodPC = new ArrayList<PC>();
    static int amountPC = 0;
    static void addGoodPc(){
        for(int i =1 ;i <=5;i++){
            PC pc = new PC("PC0"+amountPC, "Good", 2019);
            goodPC.add(pc);
            amountPC +=1;
        }
    }
    static void addDamagePC(){
        for(int i =1 ;i <=5;i++){
            PC pc = new PC("PC0"+amountPC, "Damage", 2015);
            damagePC.add(pc);
            amountPC +=1;
        }
    }
    static void allPC(){
        allPC.clear();
        allPC.addAll(goodPC);
        allPC.addAll(damagePC);
    }

    public static void listAllPCs() throws IOException {
        Iterator itr=allPC.iterator();
        //traversing elements of ArrayList object
        if(itr.hasNext()){
            System.out.println("PCno.\tQuality\tYear");
            while(itr.hasNext()){
                PC st=(PC)itr.next();
                System.out.println(st.pName + "\t"+ st.pQuality+ "\t" + st.pYear);
            }
        }else{
            System.out.println("There are no pc!");
        }

        System.out.println("Press Enter to continue...");
        System.in.read();
    }
    public static void listAllDamagePC() throws IOException {
        Iterator itr=damagePC.iterator();
        //traversing elements of ArrayList object
        if(itr.hasNext()){
            System.out.println("PCno.\tQuality\tYear");
            while(itr.hasNext()){
                PC st=(PC)itr.next();
                System.out.println(st.pName + "\t"+ st.pQuality+ "\t" + st.pYear);
            }
        }else{
            System.out.println("There are no pc!");
        }

        System.out.println("Press Enter to continue...");
        System.in.read();
    }
    public static void listAllGoodPC() throws IOException {
        Iterator itr=goodPC.iterator();
        //traversing elements of ArrayList object
        if(itr.hasNext()){
            System.out.println("ID.\tPCno.\tQuality\tYear");
            while(itr.hasNext()){
                PC st=(PC)itr.next();
                System.out.println(st.pName + "\t"+ st.pQuality+ "\t" + st.pYear);
            }
        }else{
            System.out.println("There are no pc!");
        }

        System.out.println("Press Enter to continue...");
        System.in.read();
    }

    public static void markAsDamaged() throws IOException {
        Scanner sc = new Scanner(System.in);
        String inputName;
        int count = 1;
        if(amountPC>0) {
            System.out.print("Enter PC's name that you want to mark: ");
            inputName = sc.nextLine();

            for (PC st : goodPC) {

                if (st.getpName().equals(inputName)) {
                    PC pc = new PC(st.getpName(), "Damage", st.getpYear());
                    damagePC.add(pc);

                    if(count == goodPC.size()){
                        goodPC.remove( goodPC.size());
                    }else{
                        goodPC.remove(st);
                    }
                    allPC();
                }
                count +=1;
            }
        }
    }
    public static void markAsNoDamage() throws IOException {
        Scanner sc = new Scanner(System.in);
        String inputName;
        int count = 1;
        if(amountPC>0) {
            System.out.print("Enter PC's name that you want to mark: ");
            inputName = sc.nextLine();

            for (PC st : damagePC) {
                if (st.getpName().equals(inputName)) {
                    PC pc = new PC(st.getpName(), "Good", st.getpYear());
                    goodPC.add(pc);
                    if( count == damagePC.size()){
                        damagePC.remove( damagePC.size());
                    }else {
                        damagePC.remove(st);
                    }
                    allPC();
                }
                count +=1;
            }
        }
    }

    public static void main(String[] args) throws IOException {

        addGoodPc();
        addDamagePC();
        allPC();

        boolean Codition = true;
        Scanner sca = new Scanner(System.in);
        int option = 0;
        do{

            System.out.println("++++++++++++++++++++++++++++++++++++");
            System.out.println("1. List all PCs");
            System.out.println("2. List all damages PCs");
            System.out.println("3. List all good PCs");
            System.out.println("4. Mark a PC as damaged");
            System.out.println("5. Mark a PC as not damaged");
            System.out.println("6. Quit");
            System.out.println("++++++++++++++++++++++++++++++++++++");

            try {
                System.out.print("Choose an option: ");
                option = Integer.parseInt(sca.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Wrong input!");
                continue;
            }

            switch (option){
                case 1:
                    listAllPCs();
                    break;
                case 2:
                    listAllDamagePC();
                    break;
                case 3:
                    listAllGoodPC();
                    break;
                case 4:
                    markAsDamaged();
                    break;
                case 5:
                    markAsNoDamage();
                    break;
                case 6:
                    Codition =false;
                    break;
            }

        }while(Codition);



    }




}
