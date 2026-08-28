import java.util.Scanner;
public class SmallestInArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] numbers = {45, 12, 78, 23, 9, 56};
        int smallest = numbers[0];

        for(int i = 1; i < numbers.length; i++){
            if(numbers[i] < smallest){
                smallest = numbers[i];
            }
        }
        System.out.println("The smallest number in the array is: " + smallest);
    }
}