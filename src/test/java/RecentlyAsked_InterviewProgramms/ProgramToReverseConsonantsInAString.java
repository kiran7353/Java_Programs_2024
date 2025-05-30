package RecentlyAsked_InterviewProgramms;

public class ProgramToReverseConsonantsInAString {
    public static void main(String[] args) {
        String s = "apple";
        System.out.println(reverseConsonants(s));  // Output: "alppe"
    }

    public static String reverseConsonants(String s) {
        char[] chars = s.toCharArray();
        int left = 0, right = s.length() - 1;

        while (left < right) {
            // Move left pointer until a consonant is found
            while (left < right && !isConsonant(chars[left])) {
                left++;
            }
            // Move right pointer until a consonant is found
            while (left < right && !isConsonant(chars[right])) {
                right--;
            }

            // Swap consonants
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }

        return new String(chars);
    }

    // Helper method to check if a character is a consonant
    private static boolean isConsonant(char c) {
        c = Character.toLowerCase(c);
        return Character.isLetter(c) && "aeiou".indexOf(c) == -1;
    }
}
