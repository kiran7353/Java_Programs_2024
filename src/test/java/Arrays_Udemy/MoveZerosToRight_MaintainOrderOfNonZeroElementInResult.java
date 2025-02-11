package Arrays_Udemy;

import java.util.Arrays;

public class MoveZerosToRight_MaintainOrderOfNonZeroElementInResult {
    /* Here you have to move all zerors to the left of the array and maintain the order of non zero elements.

     */
    public static void main(String[] args){
        int[] arr={1,0,12,4,0,0,13};
        int k=0;
        for(int i=0; i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[k];
                arr[k]=arr[i];
                arr[i]=temp;
                k++;
            }
        }
        System.out.println("After moving zeros to the right and maintaining the order of non zero elements"+ Arrays.toString(arr));
    }
}
