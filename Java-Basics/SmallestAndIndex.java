import java.util.Scanner;
public class SmallestAndIndex{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] numbers = {34, 12, 56, 7, 89, 21};
        int smallest = numbers[0];
        int smallestIndex = 0;

        for(int i = 1; i < numbers.length; i++){
            if(numbers[i] < smallest){
                smallest = numbers[i];
                smallestIndex = i;
            }
        }
        System.out.println("The smallest number is: " + smallest);
        System.out.println("The index of smallest number is: " + smallestIndex);
    }
}