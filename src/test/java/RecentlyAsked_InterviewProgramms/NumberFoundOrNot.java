package RecentlyAsked_InterviewProgramms;

import java.util.*;
public class NumberFoundOrNot{
    public static void main(String[] args) {
        int[] num = {1,2,2,3,4,3,5,6,6,9};

        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number to search: ");
        int n=s.nextInt();
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<num.length;i++){
            if(num[i]==n){
                l.add(i);
            }
        }

        if(l.size()==0){
            System.out.println("Number not found");
        }
        else{
            System.out.println("Number found at index: "+l);
        }

    }
}
