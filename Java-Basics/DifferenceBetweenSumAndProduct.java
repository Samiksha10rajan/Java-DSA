import java.util.Scanner;
public class DifferenceBetweenSumAndProduct{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] nums = {1, 2, 3, 4};
        int sum = 0;
        int product = 1;

        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            product *= nums[i];
        }
        int difference = product - sum;
        System.out.println("Difference: " + difference);
    }
}