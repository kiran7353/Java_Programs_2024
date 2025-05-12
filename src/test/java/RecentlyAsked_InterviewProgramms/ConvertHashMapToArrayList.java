package RecentlyAsked_InterviewProgramms;

public class ConvertHashMapToArrayList {
    public static void main(String[] args) {
        // Create a HashMap
        java.util.HashMap<String, Integer> map = new java.util.HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        // Print the HashMap
        System.out.println("HashMap: " + map);

        // Convert HashMap to ArrayList
        java.util.ArrayList<String> list = new java.util.ArrayList<>(map.keySet());

        // Print the ArrayList
        System.out.println("Keys ArrayList: " + list);

        // Convert HashMap values to ArrayList
        java.util.ArrayList<Integer> valuesList = new java.util.ArrayList<>(map.values());
        // Print the values ArrayList
        System.out.println("Values ArrayList: " + valuesList);
    }
}
