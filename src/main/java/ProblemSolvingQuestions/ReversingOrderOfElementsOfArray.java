package ProblemSolvingQuestions;

import java.util.Scanner;

public class ReversingOrderOfElementsOfArray {
    public static void main(String args[]){
        /**
         * This is the program to reverse the order of a array element
         *
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array Size: ");
        int size= sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the array elements: ");
        for(int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0; i<size-1; i++){
            for(int j=i+1;j<size;j++) {
                int t=arr[i];
                arr[i] = arr[j];
                arr[j]=t;
            }
        }

        System.out.println("Reverse ordered Array: ");
        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
