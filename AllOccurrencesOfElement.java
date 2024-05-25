import java.util.ArrayList;
import java.util.List;

public class AllOccurrencesOfElement {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 6, 8, 4, 3, 5, 7, 8, 5, 3};
        int key = 5;
        List<Integer> occurrences = findAllOccurrences(arr, key, 0, new ArrayList<>());
        System.out.println(occurrences);
    }

    public static List<Integer> findAllOccurrences(int arr[], int key, int i, List<Integer> result) {
        // Base Case: if i has reached the end of the array
        if (i == arr.length) {
            return result;
        }
        
        // If the current element matches the key, add the index to the result list
        if (arr[i] == key) {
            result.add(i);
        }
        
        // Recursive Case: check the next element
        return findAllOccurrences(arr, key, i + 1, result);
    }
}

