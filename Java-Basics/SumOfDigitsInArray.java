import java.util.Scanner;
public class SumOfDigitsInArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] nums = {12, 34, 56};

        for(int i = 0; i < nums.length; i++){
            int number = nums[i];
            int sum = 0;

            while(number > 0){
                int digit = number % 10;
                sum += digit;
                number /= 10;
            }
            System.out.println("Sum: " + sum);
        }
    }
}