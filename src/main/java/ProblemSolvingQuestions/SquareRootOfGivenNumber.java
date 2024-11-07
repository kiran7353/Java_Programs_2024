package ProblemSolvingQuestions;

import java.util.Scanner;

public class SquareRootOfGivenNumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n= sc.nextInt();
        int i=1, count=0;
        while(n>0){
            n=n-i;
            i=i+2;
            count++;
        }
        System.out.println("Squeare root of given number is: "+count);
    }
}
