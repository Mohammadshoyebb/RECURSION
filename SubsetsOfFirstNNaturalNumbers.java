import java.util.ArrayList;
import java.util.List;

public class SubsetsOfFirstNNaturalNumbers {
    public static void main(String[] args) {
        int n = 3; // Change n to desired value

        // Method 1: Print subsets directly
        ArrayList<Integer> subset = new ArrayList<>();
        findSubsets(n, subset);

        // Method 2: Store subsets in a list and print them
        List<List<Integer>> subsets = new ArrayList<>();
        generateSubsets(1, n, new ArrayList<>(), subsets);

        // Print all subsets from the list
        for (List<Integer> s : subsets) {
            System.out.println(s);
        }
    }

    // Method 1: Find and print subsets directly
    public static void printSubset(ArrayList<Integer> subset) {
        for (int i = 0; i < subset.size(); i++) {
            System.out.print(subset.get(i) + " ");
        }
        System.out.println();
    }

    public static void findSubsets(int n, ArrayList<Integer> subset) {
        if (n == 0) {
            printSubset(subset);
            return;
        }

        // Include n
        subset.add(n);
        findSubsets(n - 1, subset);

        // Exclude n
        subset.remove(subset.size() - 1);
        findSubsets(n - 1, subset);
    }

    // Method 2: Generate and store subsets in a list
    private static void generateSubsets(int index, int n, List<Integer> current, List<List<Integer>> subsets) {
        if (index > n) {
            subsets.add(new ArrayList<>(current)); // Add the current subset to the list of subsets
            return;
        }

        // Include the current number in the subset
        current.add(index);
        generateSubsets(index + 1, n, current, subsets);

        // Exclude the current number from the subset
        current.remove(current.size() - 1);
        generateSubsets(index + 1, n, current, subsets);
    }
}
