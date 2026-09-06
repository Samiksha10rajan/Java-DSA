public class MoveZeros{
    public static void main(String[] args){
        int[] numbers = {0, 1, 0, 3, 12};
        int index = 0;

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] != 0){
                numbers[index] = numbers[i];
                index++;
            }
        }
        for(int i = index; i < numbers.length; i++){
            numbers[i] = 0;
        }
        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
    }
}