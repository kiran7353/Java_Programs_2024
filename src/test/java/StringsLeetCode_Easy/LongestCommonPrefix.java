package StringsLeetCode_Easy;

public class LongestCommonPrefix {
    /*
    Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".
     */
    public static void main(String[] args) {
        String[] strs = {"Kiran", "Ki", "Kira"};
        if (strs.length == 0) {
            System.out.println("Longest common prefix is : " + "\"\"");
        } else {
            String prefix = strs[0];
            for (int i = 1; i < strs.length; i++) {
                while (strs[i].indexOf(prefix) != 0) {
                    prefix = prefix.substring(0, prefix.length() - 1);
                }
            }
            System.out.println("Longest common prefix: " + prefix);
        }
    }
}
