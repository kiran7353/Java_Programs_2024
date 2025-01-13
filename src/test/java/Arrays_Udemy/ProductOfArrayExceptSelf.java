package Arrays_Udemy;

public class ProductOfArrayExceptSelf {

    public static void main(String[] args) {

/* Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.
 */
        int[] a = new int[]{1,2,3,4};
        int[] left=new int[a.length];
        int[] right=new int[a.length];
        int n=a.length;
        left[0]=1;
        right[n-1]=1;

        int[] output=new int[n];

        for(int i = 1; i < n; i++) {
            left[i] = left[i-1]*a[i-1];
        }

        for(int i = n - 2; i >= 0; i--) {
            right[i] = right[i+1]*a[i+1];
        }

        for(int i = 0; i < n; i++) {
            output[i] = left[i]*right[i];
        }

        for (int j : output) {
            System.out.print(j + " ");
        }
    }

}
