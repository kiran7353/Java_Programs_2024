package RecentlyAsked_InterviewProgramms;

import java.lang.reflect.Array;
import java.util.Arrays;

public class JavaProgramToPrintSecondLargetElementInArray {
    public static void main(String[] args) {
        int[] a={1,2,3,3,4,4};
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        int large=a[a.length-1];
        for(int i=a.length-2;i>=0;i--){
            if(a[i]<large){
                System.out.println("Second largest element is: "+a[i]);
                break;
            }
        }
    }
}
