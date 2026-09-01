import java.util.Scanner;
public class CountPositiveNegativeZero{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] numbers = {10, -5, 0, 7, -2, 0, 15, -8};
        int positivecount = 0;
        int negativecount = 0;
        int zerocount = 0;

        for(int i=0; i < numbers.length; i++){
            if(numbers[i] > 0){
                positivecount++;
            }
            if(numbers[i] < 0){
                negativecount++;
            }
            if(numbers[i] == 0){
                zerocount++;
            }
        }
        System.out.println("The number of positive number: " + positivecount);
        System.out.println("The number of negative number: " + negativecount);
        System.out.println("The number of zero: " + zerocount);
    }

}
