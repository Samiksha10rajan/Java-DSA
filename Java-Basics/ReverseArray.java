import java.util.Scanner;
public class ReverseArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] numbers = {10, 20, 30, 40, 50};
        int n = numbers.length;
        System.out.println("Original array:");
        
        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\n Reversed array: ");
        for(int i = n - 1; i >= 0; i--){
            System.out.print(numbers[i] + " ");
        }
    }
}
