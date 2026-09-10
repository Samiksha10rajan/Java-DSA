import java.util.Scanner;
public class SumEvenIndices{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] numbers = {10, 20, 30, 40, 50, 60};
        int sum = 0;

        for(int i = 0; i < numbers.length; i++){
            if(i % 2 == 0){
                sum += numbers[i];
            }
        }
        System.out.println("Sum of even indices is: " + sum);
    }
}