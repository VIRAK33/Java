import java.util.Scanner;

public class TP06_6_Shipping {
    public static void main(String[] args){
        float AB, BC;
        float weight;
        float remainPetroAB;
        float petroNeed = 0;
        float needAb=0;
        float needBc=0;


        Scanner sc = new Scanner(System.in);
        System.out.println("Input the distance from A to B");
        AB = sc.nextFloat();

        System.out.println("Input the distance from B to C");
        BC = sc.nextFloat();

        System.out.println("Input the weight");
        weight = sc.nextFloat();

        if(weight <= 5000){

            needAb = (AB) / 5;
            needBc = (BC) / 5;

        }
        else if(weight <= 10000){

            needAb = (AB)*2 / 5;
            needBc = (BC)*2 / 5;

        }
        else if(weight <= 20000){

            needAb = (AB);
            needBc = (BC);
        }
        else if(weight <= 30000){

            needAb = (AB) * 2;
            needBc = (BC) * 2;

        }
        else{
            System.out.println("cannot be loaded");
        }


        if(needAb>300){
            System.out.print("The petro not enough from A to B!");
        }else{
            remainPetroAB = 300 - needAb;
            petroNeed = needBc - remainPetroAB;
            System.out.println("Ship need petro " + petroNeed + " liter");
        }

    }
}
