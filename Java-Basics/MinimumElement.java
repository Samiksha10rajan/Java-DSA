import java.util.Scanner;
public class MinimumElement{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] nums = {8, 3, 12, 5, 1, 9};
        int smallest = nums[0];

        for(int i = 1; i < nums.length; i++){
            if(nums[i] < smallest){
                smallest = nums[i];
            }
        }
        System.out.println("Minimum Element: " + smallest);
    }
}