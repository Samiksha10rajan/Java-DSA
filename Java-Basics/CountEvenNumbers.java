import java.util.Scanner;
public class CountEvenNumbers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        int count = 0;

        for(int i = 1; i <= number; i ++){
            if ( i % 2 == 0){
                count++;
            }
        }
        System.out.println("Count of even numbers: " + count);
    }
}