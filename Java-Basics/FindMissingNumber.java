import java.util.Scanner;
public class FindMissingNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] nums = {3, 0, 1};
        int sum = 0;
        int n = nums.length;
        int expectedsum = n * (n + 1) / 2;

        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            }
        int difference = expectedsum - sum;
        System.out.println("Missing number: " + difference);
    }
}
