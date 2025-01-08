package Arrays_Udemy;

public class MaximumSumSubArray {
    //https://confluence.atlassian.com/bitbucketserver/basic-git-commands-776639767.html
    public static void main(String[] args) {

        int[] a = new int[]{2, 3, -8, 7, -1, 2, 3};

        int maxSoFar = a[0];
        int currentSum = a[0];

        for(int i=1;i<a.length;i++){
            if(currentSum<0){
                currentSum=0;
            }
            currentSum+=a[i];
            if(currentSum > maxSoFar){
                maxSoFar = currentSum;
            }
        }

        System.out.print("Maximum Sum of Subarray is: "+maxSoFar);
    }

}
