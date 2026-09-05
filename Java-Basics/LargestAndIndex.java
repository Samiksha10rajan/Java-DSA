import java.util.Scanner;
public class LargestAndIndex{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] numbers = {23, 67, 12, 89, 45};
        int largest = numbers[0];
        int largestIndex = 0;

        for(int i = 1; i < numbers.length; i++){
            if(numbers[i] > largest){
                largest = numbers[i];
                largestIndex = i;
            }
        }
        System.out.println("The largest number is: " + largest);
        System.out.println("The index of largest number is: " + largestIndex);
    }
}