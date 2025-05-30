package RecentlyAsked_InterviewProgramms;

public class AddIntegersInAString {
    public static void main(String[] args) {
        String s = "K1i2r3a44n5";
        int sum = 0;
        String numStr = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch >= '0' && ch <= '9') {
                numStr += ch;  // build the number string
            } else {
                if (!numStr.isEmpty()) {
                    sum += Integer.parseInt(numStr);
                    numStr = ""; // reset for next number
                }
            }
        }

        // Add last number if string ends with digit(s)
        if (!numStr.isEmpty()) {
            sum += Integer.parseInt(numStr);
        }

        System.out.println("Sum of integers: " + sum);
    }
}
