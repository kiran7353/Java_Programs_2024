package Arrays_Udemy;

import java.util.Arrays;

/* Given a binary array nums, return the maximum number of consecutive 1's in the array.
 */

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] a = new int[]{1,0,1,1,0,1,0};
        int ans=0, count=0;

        for(int i=0;i<a.length-1;i++){
            if(a[i]==0){
                count=0;
            }else{
                count++;
            }

            if(count > ans){
                ans=count;
            }
            ans=Math.max(count,ans);
        }

        System.out.println("Maximum number of Consecutive ones "+ ans);
    }
}
