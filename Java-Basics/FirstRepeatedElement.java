public class FirstRepeatedElement{
    public static void main(String[] args){
        int[] numbers = {10, 20, 30, 20, 40, 30};
        boolean found = false;
        int repeated = 0;

        for(int i = 0; i < numbers.length; i++){
            for(int j = i + 1; j < numbers.length; j++){
                if(numbers[i] == numbers[j] && !found){
                    repeated = numbers[i];
                    found = true;
                }
            }
        }
        if(found){
            System.out.println("The first repeated element is: " + repeated);
        } else {
            System.out.println("No repeated element found");
        }
    }
}
