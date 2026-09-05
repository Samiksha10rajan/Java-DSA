import java.util.Scanner;
public class SumEvenElements{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] numbers = {10, 15, 20, 7, 8, 25};
    int sum = 0;

    for(int i = 0; i < numbers.length; i++ ){
        if(numbers[i] % 2 == 0){
            sum += numbers[i];
        }
    }
    System.out.println("The sum of even elements is: " + sum);
    }
}