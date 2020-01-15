package gic.i4;

public class TP10_06 {
    public static void main(String[] args) {
        int count = 0;
        for(int i =100; i<1000; i++){
            String value = Integer.toString(i);

            int first = Character.getNumericValue(value.charAt(0));
            int second = Character.getNumericValue(value.charAt(1));
            int third = Character.getNumericValue(value.charAt(2));

            if(first != second && first != third && second != third){
                count ++;
            }


        }
        System.out.println("The number difference digit is: "+count);
    }
}
