import java.util.Scanner;
public class MoveNegativeNumbers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] nums = {1, -2, 3, -4, 5, -6};
        int[] temp = new int[nums.length];
        int index = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] < 0){
                temp[index] = nums[i];
                index++;
            }
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] >= 0){
                temp[index] = nums[i];
                index++;
            }
        }
        for(int i = 0; i < temp.length; i++){
        System.out.print(temp[i] + " ");
        }
    }
}