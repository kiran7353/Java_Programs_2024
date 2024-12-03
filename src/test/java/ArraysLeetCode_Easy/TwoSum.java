package ArraysLeetCode_Easy;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoSum {
   public static void main(String[] args){
        /* Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
         */
        int[] a={3,3};
        System.out.println(Arrays.toString(twoSum(a, 6)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] a=new int[2];
        int i=0;
        while(i<nums.length){
            for(int j=i+1;j<nums.length;j++){
                int sum=nums[i]+nums[j];
                if(sum==target){
                    a[0]=i;
                    a[1]=j;
                }
            }
            i++;
        }
        return a;
    }
}
