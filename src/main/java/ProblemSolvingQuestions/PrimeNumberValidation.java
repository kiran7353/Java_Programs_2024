package ProblemSolvingQuestions;

import java.util.Scanner;

public class PrimeNumberValidation {
    public static void main(String[] args) {
        /**
         * This programm will verify that wheather a given number is a Prime or not
         */
        System.out.println("Enter the number: ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(n==0 || n==1){
            System.out.println(n+" is not a prime number");
        } else if (n%2==0) {
            System.out.println(n+" is not a prime number");
        }else{
            System.out.println(n+" is a prime number");
        }
    }
}
