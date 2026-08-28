import java.util.Scanner;
public class CountOccurrences{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] numbers = {10, 20, 30, 20, 40, 20, 50};
        int count = 0;
        System.out.println("Enter the number: ");
        int target = sc.nextInt();

        for(int i =0; i < numbers.length; i++){
            if(numbers[i] == target){
                count++;
            }
        }
        System.out.println("The number of times it occurs in the array: " + count);
    }
}