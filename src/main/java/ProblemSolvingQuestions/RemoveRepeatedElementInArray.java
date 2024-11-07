package ProblemSolvingQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class RemoveRepeatedElementInArray {
    public static void main(String[] args){
        /**
         * This is the program to remove repeated element from an array
         *
         */
        System.out.println("Enter the size of an array: ");
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);

        int size= sc.nextInt();
        int[] arr= new int[size];
        System.out.println("Enter the Elements to place inside the array: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int i=0;
        while(i<size){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }else{
                int oldval=map.get(arr[i]);
                int newval=oldval+1;
                map.put(arr[i],newval);
            }
            i++;
        }

        Set<Map.Entry<Integer, Integer>> set = map.entrySet();
        for(Map.Entry<Integer, Integer> data:set){
            System.out.print(data.getKey()+" ");
        }

    }
}
