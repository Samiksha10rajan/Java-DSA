import java.util.Scanner;
public class RemoveDuplicates{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] nums = {1, 2, 2, 3, 1, 4};
        int[] result = new int[nums.length];
        int index = 0;

        for(int i = 0; i < nums.length; i++){
            boolean exists = false;
            for(int j = 0; j < index; j++){
                if(nums[i] == nums[j]){
                    exists = true;
                    break;
                }
            }
            if(!exists){
                result[index] = nums[i];
                index++;
            } 
        }
        for(int i = 0; i < index; i++){
            System.out.print(result[i] + " ");
        }
    }
}