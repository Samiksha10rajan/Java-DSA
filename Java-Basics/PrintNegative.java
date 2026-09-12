import java.util.Scanner;
public class PrintNegative{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] numbers = {-5, 10, -2, 7, 0, 15, -8};

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] < 0){
                System.out.println("Negative Numbers:  " + numbers[i]);
            }
        }
    }
}