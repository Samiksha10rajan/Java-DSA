import java.util.Scanner;
public class ShuffleTheArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;

        int[] result = new int[nums.length];
        int index = 0;

        for(int i = 0; i < n; i++){
            result[index] = nums[i];
            index++;

            result[index] = nums[i+n];
            index++;
        }
        for(int i = 0; i < result.length; i++){
            System.out.print(result[i] + " ");
        }
    }
}