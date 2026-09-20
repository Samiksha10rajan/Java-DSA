import java.util.Scanner;
public class CheckIfArrayIsSorted{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] nums = {1, 2, 3, 4, 5};

        for(int i = 1; i < nums.length; i++){
            if(nums[i] < nums[i - 1]){
                System.out.println("Array is not sorted.");
                return;
            }
        }
        System.out.println("Array is sorted.");
    }
}