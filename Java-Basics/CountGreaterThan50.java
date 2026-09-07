import java.util.Scanner;
public class CountGreaterThan50{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] numbers = {23, 67, 45, 89, 12, 56, 34};
        int count = 0;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > 50){
                count++;
            }
        }
        System.out.println("Count of numbers greater than 50:  " + count);
    }
}