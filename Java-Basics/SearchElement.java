import java.util.Scanner;
public class SearchElement{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("Enter the number: ");
        int target = scanner.nextInt();

        boolean found = false;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == target){
                found = true;
                System.out.println("Element is at index: " + i);
            }
        }  
        if(!found){
            System.out.println("Element not found");
        }
    }
}