import java.util.Scanner;
public class ContainsDuplicate{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] numbers = {10, 20, 30, 40, 20};
        boolean duplicate = false;

        for(int i = 0; i < numbers.length; i++){
            for(int j = i + 1; j < numbers.length; j++){
                if(numbers[i] == numbers[j]){
                    duplicate = true;
                }
            }
        }
        if(duplicate){
            System.out.println("Array contains duplicate");
        } else {
            System.out.println("Array doesnot contains duplicate");
        } 
    }
}