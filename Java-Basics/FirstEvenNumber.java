import java.util.Scanner;
public class FirstEvenNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] numbers = {15, 21, 33, 18, 40, 12};
        boolean found = false;
        int evenNumber = 0;
        int evenIndex = -1;

        for(int i = 0; i < numbers.length; i++){
            if (numbers[i] % 2 == 0 && !found){
                evenNumber = numbers[i];
                evenIndex = i;
                found = true;
            }
        }
        System.out.println("First Even Number is: " + evenNumber);
        System.out.println("Index of the First Even Number is: " + evenIndex);
    }
}