import java.util.Scanner;
public class DifferenceEvenOdd{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] numbers = {10, 15, 20, 7, 8, 25};
        int evensum = 0;
        int oddsum = 0;

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] % 2 == 0){
                evensum += numbers[i];
            } else {
                oddsum += numbers[i];
            }
        }
        int difference = evensum - oddsum;
        System.out.println("Difference between even and odd sum: " + difference);
    }
}