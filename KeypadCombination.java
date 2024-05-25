public class KeypadCombination {
    
    // Array representing the possible characters for each digit on a phone keypad
        public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    
        // Recursive function to print all possible combinations for the given string of digits
        public static void printComb(String str, int idx, String combination) {
            // ********************BASE CASE***************************
            // When the index reaches the end of the string
            if (idx == str.length()) {
                // Print the current combination
                System.out.println(combination);
                return; // End the recursion here
            }
    
            // Get the current character from the string
            char currChar = str.charAt(idx);
            // Get the corresponding mapping from the keypad array
            String mapping = keypad[currChar - '0'];
    
            // ********************RECURSIVE CASE***************************
            // Loop through each character in the mapping string
            for (int i = 0; i < mapping.length(); i++) {
                // Recursive call to add the next character to the combination
                printComb(str, idx + 1, combination + mapping.charAt(i));
            }
        }
    
    public static void main(String[] args) {
            // Input string representing the digits
            String str = "23";
            // Call the printComb method with initial parameters
            printComb(str, 0, "");
     }
}
    

