import java.util.Scanner;
public class SecondSmallest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] numbers = {45, 12, 78, 23, 9, 56};
        int smallest = numbers[0];
        int Secondsmallest = numbers[0];

        for(int i = 0; i < numbers.length; i++){
            if (numbers[i] < smallest){
                Secondsmallest = smallest;
                smallest = numbers[i];
            }
            else if(numbers[i] > smallest && numbers[i] < Secondsmallest){
                Secondsmallest = numbers[i];
            }
        }
        System.out.println("The second smallest number: " + Secondsmallest);
    }
}