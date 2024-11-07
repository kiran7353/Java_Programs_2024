package ProblemSolvingQuestions;

import java.util.Scanner;

public class ReversingOrderOfWordsInSentence {
    public static void main(String args[]){
        /**
         * This is the program to reverse the order of words in the given sentence
         *
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Sentence: ");
        String sentence= sc.nextLine();
        String arr[]=sentence.split(" ");
        System.out.println("Order of words in the sentence before reverse: ");
        System.out.println(sentence);
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1;j< arr.length;j++) {
                String t=arr[i];
                arr[i] = arr[j];
                arr[j]=t;
            }
        }

        System.out.println("Order of words in the sentence after reverse: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
