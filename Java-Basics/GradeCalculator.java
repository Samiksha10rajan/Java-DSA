import java.util.Scanner;
public class GradeCalculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks: ");
        int marks = sc.nextInt();

        if(marks >= 85){
            System.out.println("Grade: O");
        } else if(marks >= 75){
            System.out.println("Grade: A+");
        } else if(marks >= 65){
            System.out.println("Grade: A");
        } else if(marks >= 55){
            System.out.println("Grade: B+");
        } else if(marks >= 45){
            System.out.println("Grade: B");
        } else{
            System.out.println("Grade: Fail");
        }
    }
}