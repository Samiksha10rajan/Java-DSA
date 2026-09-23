import java.util.Scanner;
public class FrequencyOfElements{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] nums = {1, 2, 2, 3, 1, 1};
        boolean[] visited = new boolean[nums.length];

        for(int i = 0; i < nums.length; i++){
            if(visited[i]){
                continue;
            }
            int count = 0;
            
            for(int j = i; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println(nums[i] + " => " + count);
        }
    }
}