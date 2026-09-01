import java.util.Scanner;
public class DifferenceMaxMin{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] numbers = {12, 45, 7, 23, 89, 34};
        int largest = numbers[0];
        int smallest = numbers[0];

        for(int i = 0; i < numbers.length;i++){
            if(numbers[i] > largest){
                largest = numbers[i];
            } 
            if(numbers[i] < smallest){
                smallest = numbers[i];
            }
        }
        int difference = largest - smallest;
        System.out.println("The difference between the largest and the smallest is: " + difference);
    }
}