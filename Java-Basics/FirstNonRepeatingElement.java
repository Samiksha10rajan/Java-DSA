import java.util.Scanner;
public class FirstNonRepeatingElement{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] nums = {4, 5, 1, 2, 1, 4, 5};

        for(int i = 0; i < nums.length; i++){
            int count = 0;
            for(int j = 0; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            if(count == 1){
                System.out.println("First Non Repeating Element: " + nums[i]);
                break;
            }
        }
    }
}