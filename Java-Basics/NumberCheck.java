import java.util.Scanner;
public class NumberCheck{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number x: ");
        int x = sc.nextInt();

        if (x > 0){
            System.out.println("X is a positive number.");
        } else if(x < 0){
            System.out.println("X is a negative number.");
        } else {
            System.out.println("X is Zero.");
        }
        sc.close();
    }
}