package Course_JAVA;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

public class FirstPGM{
    public static void main(String[] args) {
        String input="helloworld";
        // Create a map to store character counts
        Map<Character, Integer> charCountMap =new LinkedHashMap<>();
        // Iterate over each character in the string
        for(char c : input.toCharArray()) {
            // Use getOrDefault to count the occurrences of each character
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        // Print the result
        for(Map.Entry<Character, Integer> entry : charCountMap.entrySet())
        {
            System.out.println(entry.getKey() +": "+ entry.getValue());
        }
        int pivotIndex = 0 + new Random().nextInt(5 - 0 + 1);
        System.out.println(pivotIndex);
    }
}
