package ProblemSolvingQuestions;

import java.util.Scanner;

public class IntegerPalindrome {
    public static void main(String[] args){
        /**
         * This is the program to print Integer is a palindrome or not
         */
        System.out.println("Enter the number");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int n1=n;
        int rev=0;
        while(n1>0){
            int ld=n1%10;
            rev=rev*10+ld;
            n1=n1/10;
        }

        if(rev==n){
            System.out.println("Entered Number is Palindrome: "+n);
        }else{
            System.out.println("Entered Number is not Palindrome: "+n);
        }
    }
}
