import java.util.Scanner;
public class SecondLargest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] numbers = {10, 45, 23, 78, 32};
        int largest = numbers[0];
        int secondlargest = numbers[0];

        for(int i = 1; i < numbers.length;i++){
            if(numbers[i] > largest) {
                secondlargest = largest;
                largest = numbers[i];
                }
                else if(numbers[i] < largest && numbers[i] > secondlargest) {
                    secondlargest = numbers[i];
                    }
        }
        System.out.println("The second largest number: " + secondlargest);
    }
}