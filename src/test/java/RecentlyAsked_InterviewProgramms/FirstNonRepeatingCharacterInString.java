package RecentlyAsked_InterviewProgramms;

public class FirstNonRepeatingCharacterInString {
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        int[] count = new int[256];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)]++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i)] == 1) {
                System.out.println("First non-repeating character is: " + s.charAt(i));
                break;
            }
        }
    }
}
