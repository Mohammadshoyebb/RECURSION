import java.util.HashSet;

public class UniqueSubSequence {

    // Recursive function to generate all unique subsets of the given string
    public static void uniqueSubsets(String str, int index, HashSet<String> hs, String s) {

        // ********************BASE CASE***************************
        // When index reaches the end of the string
        if (index == str.length()) {
            // If the subset is not already in the HashSet, add it and print it
            if (!hs.contains(s)) {
                System.out.println(s);
                hs.add(s); // Add the unique subset to the HashSet
            }
            return; // End the recursion here
        }

        // Get the current character from the string
        char ch = str.charAt(index);

        // ********************LOGIC (PICK and NO PICK)***************************
        // Pick the current character
        uniqueSubsets(str, index + 1, hs, s + ch);

        // Do not pick the current character
        uniqueSubsets(str, index + 1, hs, s);
    }

    public static void main(String[] args) {
        String s = "aaa"; // Input string
        // Call the uniqueSubsets method with initial parameters
        uniqueSubsets(s, 0, new HashSet<String>(), "");
    }
}

