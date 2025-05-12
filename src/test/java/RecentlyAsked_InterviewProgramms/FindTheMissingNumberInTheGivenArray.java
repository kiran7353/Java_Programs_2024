package RecentlyAsked_InterviewProgramms;

public class FindTheMissingNumberInTheGivenArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 7, 8, 9};
        int n = arr.length + 1;
        int total = (n * (n + 1)) / 2;
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println("The missing number is: " + (total - sum));
    }
}
