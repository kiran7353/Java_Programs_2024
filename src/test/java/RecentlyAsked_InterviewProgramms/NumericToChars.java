package RecentlyAsked_InterviewProgramms;

public class NumericToChars {
    public static void main(String[] args) {
        String s="a6b3c4";
        for(int i=0;i<s.length();i++) {
            if (Character.isAlphabetic(s.charAt(i))) {
                System.out.print(s.charAt(i));
            } else {
                int n = Character.getNumericValue(s.charAt(i));
                for (int j = 1; j <= n; j++) {
                    System.out.print(s.charAt(i - 1));
                }
            }
        }
    }
}
