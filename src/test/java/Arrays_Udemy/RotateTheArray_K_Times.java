package Arrays_Udemy;

import java.util.Arrays;

/**
 * Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
 */
public class RotateTheArray_K_Times {

    /**
     * Reverses a portion of the array from start to end indices.
     *
     * @param arr   the array to be reversed
     * @param start the starting index
     * @param end   the ending index
     */
    static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4};
        int rotations = 1;
        int k = rotations % array.length;

        // Reverse the entire array
        reverseArray(array, 0, array.length - 1);
        // Reverse the first k elements
        reverseArray(array, 0, k - 1);
        // Reverse the remaining elements
        reverseArray(array, k, array.length - 1);

        System.out.println(Arrays.toString(array));
    }
}