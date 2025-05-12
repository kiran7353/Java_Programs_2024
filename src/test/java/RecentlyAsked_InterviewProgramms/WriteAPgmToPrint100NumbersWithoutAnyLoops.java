package RecentlyAsked_InterviewProgramms;

public class WriteAPgmToPrint100NumbersWithoutAnyLoops {
    public static void main(String[] args) {
        int i = 1;
        printNumbers(i);
    }

    static void printNumbers(int i) {
        if (i <= 100) {
            System.out.print(i + " ");
            printNumbers(i + 1);
        }
    }
}
