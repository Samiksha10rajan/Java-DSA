public class CountEvenOdd{
    public static void main(String[] args){
        int[] numbers = {10, 23, 45, 68, 12, 7, 90};
        int evencount = 0;
        int oddcount = 0;

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] % 2 == 0){
                evencount++;
            } else {
                oddcount++;
            }
        }
        System.out.println("The number of even numbers in the array: " + evencount);
        System.out.println("The number of odd numbers in the array: " + oddcount);
    }
}
