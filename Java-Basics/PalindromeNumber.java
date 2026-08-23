import java.util.Scanner;
public class PalindromeNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        int OriginalNumber = number;
        int reverse = 0;
        while(number != 0){
            int digit = number % 10;
            number /= 10;
            reverse = reverse * 10 + digit;
        }
        if(OriginalNumber == reverse){
            System.out.println(OriginalNumber + " is a palindrome number.");    
        }else{
            System.out.println(OriginalNumber + " is not a palindrome number.");
        }

    }
}