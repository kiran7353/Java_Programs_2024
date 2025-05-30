package RecentlyAsked_InterviewProgramms;

import java.util.ArrayList;
import java.util.List;

public class MaximumConsucutiveOnesInAnGiven2DArray {
    /*
    give me the java programm for the same requirement as above for the two dimentional array :     test_cases = (
        []
        [1, 1, 0, 1, 1, 1],
        [1, 0, 1, 1, 0, 1],
        [1, 1, 1, 1, 1, 1],
        [0, 0, 0, 0, 0, 0],
        [0, 1, 0, 1, 0, 1],
    )
    expected_output = (0, 3, 2, 6, 0, 1)
     */

    public static void main(String[] args) {
        // Define the 2D array of test cases
        int[][] testCases = {
                {},                              // Expected output: 0
                {1, 1, 0, 1, 1, 1},              // Expected output: 3
                {1, 0, 1, 1, 0, 1},              // Expected output: 2
                {1, 1, 1, 1, 1, 1},              // Expected output: 6
                {0, 0, 0, 0, 0, 0},              // Expected output: 0
                {0, 1, 0, 1, 0, 1}               // Expected output: 1
        };
        List<Integer> l=new ArrayList<>();
        // Iterate through each test case
        for (int i = 0; i < testCases.length; i++) {
            int maxConsecutive = findMaxConsecutiveOnes(testCases[i]);
            l.add(maxConsecutive);
        }
        System.out.println("Max consecutive 1s in Array= " + l);
    }

    // Function to calculate maximum consecutive 1s in a single array
    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int currentCount = 0;

        for (int num : nums) {
            if (num == 1) {
                currentCount++;
                maxCount = Math.max(maxCount, currentCount);
            } else {
                currentCount = 0;
            }
        }

        return maxCount;
    }
}
