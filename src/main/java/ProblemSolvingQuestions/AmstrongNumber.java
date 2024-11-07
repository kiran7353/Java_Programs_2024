package ProblemSolvingQuestions;

import java.util.Scanner;

import static java.lang.Math.pow;

public class AmstrongNumber {
    public static void main(String[] args){
        /**
         * This is the program to print given number is a palindrome or not
         */
        System.out.println("Enter the number");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int n1=n;
        int rev=0;
        int sum=0;

        while(n1>0){
            int ld=n1%10;
            sum+=pow(ld,3);
            n1=n1/10;
        }

        if(sum==n){
            System.out.println("Entered Number is Amstrong number: "+n);
        }else{
            System.out.println("Entered Number is not Amstrong number: "+n);
        }
    }
}
