import java.util.Scanner;
public class FindNumbersWithEvenNumberOfDigits{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] nums = {12, 345, 2, 6, 7896};
        int count = 0;

        for(int i = 0; i < nums.length; i++){
            int digits = 0;
            int number = nums[i];

            while(number > 0){
                digits++;
                number = number/10;
            }

            if(digits % 2 == 0){
                count++;
            }

        }
        System.out.println("Count of numbers: " + count);
    }
}