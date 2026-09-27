import java.util.Scanner;
public class CheckIfArraysAreEqual{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] nums1 = {1, 2, 3, 4};
        int[] nums2 = {1, 2, 3, 4};
        boolean equal = true;

        for(int i = 0; i < nums1.length; i++){
            if(nums1[i] != nums2[i]){
                equal = false;
                break;
            }
        }
        if(equal){
            System.out.println("Arrays are equal");
        }else{
            System.out.println("Arrays are not equal");
        }
    }
}