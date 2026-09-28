import java.util.Scanner;
public class RightRotateArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] nums = {1, 2, 3, 4, 5};
        int last = nums[nums.length - 1];

        for(int i = nums.length - 1; i > 0; i--){
            nums[i] = nums[i - 1]; 
        }
        nums[0] = last;
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }
}