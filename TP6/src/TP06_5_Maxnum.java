import java.util.Scanner;

public class TP06_5_Maxnum {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[8];
        int tmp = 0;
        System.out.println("Find max number of eight element.");
        for(int i=0; i<8; i++){
            System.out.print("Please input the "+ (i +1) + " element: ");
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<8; i++){
            if(tmp < arr[i]){
                tmp = arr[i];
            }
        }
        System.out.print("The max number is " +tmp);

    }
}
