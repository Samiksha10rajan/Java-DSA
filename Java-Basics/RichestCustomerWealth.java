import java.util.Scanner;
public class RichestCustomerWealth{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] accounts = {
            {1, 2, 3},
            {3, 2, 1},
            {4, 5, 6}
            };

        int richest = 0;
        for(int i = 0; i < accounts.length; i++){
            int sum = 0;
            for(int j = 0; j < accounts[i].length; j++){
                sum += accounts[i][j];
            }
            if(sum > richest){
                richest = sum;
            }
        }
        System .out.println("Richest customer wealth: " + richest);
    }
}