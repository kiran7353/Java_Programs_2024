package ProblemSolvingQuestions;

import java.util.Scanner;

public class FactorialOfGivenNumber {
    public static void main(String[] args){
        /**
         * This is the program to print factorial of a given number
         */
        System.out.println("Enter the number: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int res=factorial(n);
        System.out.println("Factorial of a given number "+n+" is "+res);
    }

    private static int factorial(int n) {
        if(n==0){
            return 1;
        }else{
            return n*factorial(n-1);
        }
    }
}
