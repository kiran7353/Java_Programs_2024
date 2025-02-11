package Arrays_Udemy;
import java.util.Arrays;

public class SortColors {
    /*
    Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.
Example 1:

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
     */
    public static void main(String[] args) {
        int[] nums={2,0,1};
        int left=0,right=nums.length-1;
        int i=0;
        while(i<=right){
            if(nums[i]==0){
                int temp=nums[left];
                nums[left]=nums[i];
                nums[i]=temp;
                left++;
                i++;
            } else if (nums[i]==2) {
                int temp=nums[right];
                nums[right]=nums[i];
                nums[i]=temp;
                right--;
            }else{
                i++;
            }
        }
        System.out.println("Sorted Array:"+ Arrays.toString(nums));
    }
}
