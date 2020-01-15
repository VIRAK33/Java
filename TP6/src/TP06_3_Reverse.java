import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class TP06_3_Reverse {
    public static void main(String[] args){
        String input;
//        int [] result = new int[4];
        List<Integer> result = new ArrayList<>();
        int output = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Program for reversing a 4 digits number.");
        System.out.print("Please input 4 digits number: ");
        input = sc.nextLine();
        if(input.length() == 4){
            char[] try1 = input.toCharArray();
            for (int i = try1.length-1; i>=0; i--) {
                result.add( Integer.parseInt(String.valueOf(try1[i])));
                if(result.get(0) ==0){
                    result.remove(0);
                }
            }
            for (int i=0; i<result.size(); i++){
                System.out.print(result.get(i));
            }
        }else{
            System.out.print("Error: invalid number, please input only 4 digits number.");
        }
    }
}
