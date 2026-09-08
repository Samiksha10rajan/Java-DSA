public class CountNegative{
    public static void main(String[] args){
        int[] numbers = {-5, 10, -2, 7, 0, 15, -8};
        int count = 0;

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] < 0){
                count++;
            }
        }
        System.out.println("Number of negative numbers: " + count);
    }
}