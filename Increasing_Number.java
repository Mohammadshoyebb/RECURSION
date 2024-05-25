public class Increasing_Number {
    public static void printInc(int n,int k){
        if(n == k){
            System.out.println(n);
            return;
        }
        System.out.print(n+"  ");
        printInc(n+1, k);
    }



        // ANOTHER METHOD
    public static void printIncreasingNumber(int n){
        //Base Case
        if(n == 0){
            System.out.print(n+"  ");
            return;
        }
        // Recursive Call
        printIncreasingNumber(n-1);
        System.out.print(n+ "  ");
    }



    public static void main(String[] args) {
        printInc(0, 10);
        System.out.println();
        System.out.println();
        System.out.println();
        printIncreasingNumber(10);
    }
}
