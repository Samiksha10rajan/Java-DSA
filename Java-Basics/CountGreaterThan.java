import java.util.Scanner;
public class CountGreaterThan{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int[] numbers = {10, 25, 40, 15, 60, 30};
        int count = 0;

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > target){
                count++;
            }
        } 
        System.out.println("Count of numbers greater than target is: " + count);
    }
}