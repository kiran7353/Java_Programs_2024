package ProblemSolvingQuestions;

import java.util.Scanner;

public class Fibonaci_Series {
    static int a = 0, b = 1, c = 0;
    public static void main(String[] args) {

        System.out.println("This is the programm to print Fibonacci series upto a given count of numbers -" +
                "How many number of Fibonaci series you want to print: ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        fibonaci(n);
    }

    /**
     * Using recurssion function in fibonacci series
     * @param n
     */
    /*private static void fibonaci(int n) {
        if (n > 0) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(a + " ");
            fibonaci(n - 1);
        }
    }*/

    /**
     * Normal Fibonaci series function
     * @param n
     */
    public static void fibonaci(int n) {
        int a = 1, b = 1, c = 0;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }



}


