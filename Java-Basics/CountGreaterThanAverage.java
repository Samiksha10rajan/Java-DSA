import java.util.Scanner;
public class CountGreaterThanAverage{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] numbers = {10, 20, 30, 40, 50};
        int sum = 0;
        int count = 0;
        int greaterthanAverageCount = 0;

        for(int i = 0; i < numbers.length;i++){
            sum += numbers[i];
            count++;
        }
        double average = (double)sum / count;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > average){
                greaterthanAverageCount++;
            }
        }
        System.out.println("Number of elements greater than average: " + greaterthanAverageCount);

    }
}