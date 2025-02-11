package ArraysLeetCode_Easy;

import java.util.ArrayList;
import java.util.Arrays;

public class SearchInsertPosition {
    /*Given a sorted array of distinct integers and a target value,
      return the index if the target is found. If not,
      return the index where it would be if it were inserted in order.

     You must write an algorithm with O(log n) runtime complexity.
     */

    public static int searchInsert(int[] nums, int target) {
        int s = 0, end = nums.length - 1;
        while (s <= end) {
            int mid = (s + end) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                s = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return s;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,4,2};
        Arrays.sort(nums);
        System.out.print(searchInsert(nums, 2));
    }

}
