public class DecreasingNumber{
    public static void printDecreasingNumber(int n){
        //Base Case
        if(n == 1){
            System.out.println(n);
            return;
        }
        // Recursive Call
        System.out.print(n+ "  ");
        printDecreasingNumber(n-1);
    }
    public static void main(String[] args) {
        printDecreasingNumber(10);
    }
}