package ArraysLeetCode_Easy;

import java.util.ArrayList;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        ArrayList list=new ArrayList();
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[count]=nums[i];
                list.add(nums[i]);
                count++;
            }
        }
        System.out.println(list);
        return list.size();
    }

    public static void main(String[] args){
        int[] nums={0,1,2,2,3,0,4,2};
        System.out.print(removeElement(nums,2));
    }

    int k=0;
        for(int i=0;i<nums.length;i++){
        if(nums[i]==target){
            k=i;
        }else
    }
        return k;
}
