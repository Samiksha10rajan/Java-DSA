import java.util.Scanner;
public class ReverseArrayInPlace{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] numbers = {10, 20, 30, 40, 50};
        int left = 0;
        int right = numbers.length - 1;

        for(int i = 0; i < numbers.length/2; i++){
            int temp = numbers[left];
            numbers[left] = numbers[right];
            numbers[right] = temp;
            left++;
            right--;

        }
        System.out.print("Reversed array: ");
        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
    }
}