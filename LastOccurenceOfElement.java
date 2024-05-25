public class LastOccurenceOfElement {
    
        public static void main(String[] args) {
            int arr[] = {1,2,3,6,8,4,3,5,7,8,5,3};
           int key = 5;
           System.out.println(lastOccurence(arr, key, 0));
        }
        public static int lastOccurence(int arr[], int key, int i){
            
    
            if(i == arr.length-1){
                return -1;
            }
            int isFound = lastOccurence(arr, key, i+1);
            if(arr[i]==key && isFound == -1){
                return i;
            }
            return isFound;    
    }
}
