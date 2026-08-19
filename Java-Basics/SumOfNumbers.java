import java.util.Scanner;
public class SumOfNumbers{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println ("Enter the number: ");
    int number = sc.nextInt();
    int Sum = 0;
    for(int i  = 1; i <= number; i++){
        Sum += i;
    }
    System.out.println("Sum of numbers from 1 to " + number + " is: " + Sum);
    }
}