import java.util.Scanner;
public class StudentInfo {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Enter your percentage: ");
        double percentage = sc.nextDouble();

        System.out.println("\nName: " + name);
        System.out.println("Age: " + age);
        System.out.println("Percentage: " + percentage);
        sc.close();
    }
}