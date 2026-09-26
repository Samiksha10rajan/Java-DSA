import java.util.Scanner;
public class IntersectionOfArrays{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] nums1 = {1, 2, 2, 3};
        int[] nums2 = {2, 2, 4};
        int[] result = new int[nums1.length];
        int index = 0;

        for(int i = 0; i < nums1.length; i++){
            for(int j = 0; j < nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    result[index] = nums1[i];
                    index++;
                    break;
                }
            }
        }
        for(int i = 0; i < index; i++){
            System.out.print(result[i] + " ");
            }
    }
}