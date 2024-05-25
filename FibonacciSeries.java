public class FibonacciSeries {
    public static void main(String[] args) {
        int n = fibonacci(25);
        System.out.println(n);
    }
    public static int fibonacci(int n){
        if(n==0 || n==1){
            return n;
        }
        int a = fibonacci(n-1) + fibonacci(n-2);
        return a;


        //Another way to understand it more easily  **same as above one**;

        // int fib1 = fibonacci(n-1);
        // int fib2 = fibonacci(n-2);
        // int a = fib1 + fib2;
        // return a;

    }
}
