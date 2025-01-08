package Arrays_Udemy;

public class MaximumProductSubArray {
    //https://confluence.atlassian.com/bitbucketserver/basic-git-commands-776639767.html
    /*Maximum product of the subArray is so far
Given an integer array nums, find a
subarray
 that has the largest product, and return the product.

The test cases are generated so that the answer will fit in a 32-bit integer.
*/
    public static void main(String[] args) {
        int[] a = new int[]{2,3,-2,4};

        int maxProdSoFar = a[0];
        int minProdSoFar = a[0];
        int result = a[0];

        for(int i=1;i<a.length;i++){
            if(a[i]>=0) {
                maxProdSoFar = Math.max(a[i],maxProdSoFar*a[i]);
                minProdSoFar = Math.min(a[i],minProdSoFar*a[i]);
            }else{
                int tem=maxProdSoFar;
                maxProdSoFar = Math.max(a[i],minProdSoFar*a[i]);
                minProdSoFar = Math.min(a[i],a[i]*tem);
            }
            result=Math.max(result,maxProdSoFar);
        }

        System.out.print("Maximum Product of Subarray is: "+result);
    }

}
