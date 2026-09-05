import java.util.Scanner;
public class AverageOfArray{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] numbers = {10, 20, 30, 40, 50};
    int count = 0;
    int sum = 0;

    for(int i = 0; i < numbers.length; i++ ){
        sum += numbers[i];
        count++;
    }
    double average = (double) sum / count;
    System.out.println("The average of array is: " + average);
    }
}