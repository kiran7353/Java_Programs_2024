package ProblemSolvingQuestions;

import java.util.Scanner;

public class GcdOfTwoNumbers {
    public static void main(String args[]){
        /**
         * This program will print GCD of two numbers
         */
        System.out.println("Enter two numbers: ");
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int min=Math.min(a,b);
        int i=1;
        int res=0;
        while(i<=min){

            if(a%i==0 && b%i==0){
                if(res < i){
                    res=i;
                }
            }
            i++;
        }
        System.out.println("GCD of given two numbers ("+a+","+b+") is "+res);

    }
}
