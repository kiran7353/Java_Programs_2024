package ProblemSolvingQuestions;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args){
        /**
         * This is the program to print string is a palindrome or not
         */
        System.out.println("Enter the string");
        Scanner s=new Scanner(System.in);
        String n=s.nextLine();
        n=n.replace(" ","").toLowerCase();
        String rev="";
        for(int i=n.length()-1;i>=0;i--){
            rev=rev+n.charAt(i);
        }

        if(!rev.equals(n)){
            System.out.println("String is not Palindrome: "+n);
        }else{
            System.out.println("String is Palindrome: "+n);
        }
    }
}
