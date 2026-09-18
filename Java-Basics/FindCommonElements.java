import java.util.Scanner;
public class FindCommonElements{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] nums1 = {1, 2, 3, 4};
        int[] nums2 = {3, 4, 5, 6};

        for(int i = 0; i < nums1.length; i++){
            for(int j = 0; j < nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    System.out.println("Common element: " + nums1[i]);
                }
            }
        }
    }
}