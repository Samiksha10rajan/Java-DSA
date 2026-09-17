import java.util.Scanner;
public class RunningSumof1dArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] numbers = {1, 2, 3, 4};
        int sum = 0;

        for(int i = 0; i < numbers.length; i++){
            sum += numbers[i];
            System.out.println("Running sum: " + sum);
        }
    }
}