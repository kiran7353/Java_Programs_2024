package Arrays_Udemy;

import java.util.Arrays;

/* Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
 */

public class RotateTheArray_K_Times {

    static void reverseArray(int[] arr, int start, int end){
        int i=start,j=end;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4};
        int r=1;
        int k = r% a.length;
        reverseArray(a,0,a.length-1);
        reverseArray(a,0,k-1);
        reverseArray(a,k,a.length-1);
        System.out.println(Arrays.toString(a));
    }
}
