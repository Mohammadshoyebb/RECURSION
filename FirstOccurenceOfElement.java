public class FirstOccurenceOfElement {
    public static void main(String[] args) {
        int arr[] = {1,2,3,6,8,4,3,5,7,8,5,3};
       int key = 5;
       System.out.println(firstOccurence(arr, key, 0));
    }
    public static int firstOccurence(int arr[], int key, int i){
        if(i == arr.length-1){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return  firstOccurence(arr, key, i+1);

    }
}

    /*
     * public class LastOccurrenceOfElement {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 6, 8, 4, 3, 5, 7, 8, 5, 3};
        int key = 5;
        System.out.println(lastOccurrence(arr, key, 0));
    }

    public static int lastOccurrence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        
        // Recursively find in the rest of the array
        int indexInRest = lastOccurrence(arr, key, i + 1);
        
        // If found in the rest, return that index
        if (indexInRest != -1) {
            return indexInRest;
        }
        
        // Otherwise, check the current element
        if (arr[i] == key) {
            return i;
        }
        
        return -1;
    }
}

     */