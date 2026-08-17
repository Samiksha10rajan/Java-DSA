import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number x: ");
        int x = sc.nextInt();

        if (x % 2 == 0){
            System.out.println("X is an even number");
        } else {
            System.out.println("X is an odd number");
        }

    }
}