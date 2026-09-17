public class KidsWithTheGreatestNumberOfCandies{
    public static void main(String[] args){
        int[] candies = {2, 3, 5, 1, 3};
        int extracandies = 3;
        int max = 0;

        for(int i = 0; i < candies.length; i++){
            if(candies[i] > max){
                max = candies[i];
            }
        }

        for(int i = 0; i < candies.length; i++){
            if(candies[i] + extracandies >= max){
                System.out.println("True");
            }else{
                System.out.println("False");
            }
        }
    }
}