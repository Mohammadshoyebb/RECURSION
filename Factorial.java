public class Factorial {
    public static void main(String[] args) {
        int ans = fact(6);
        System.out.println(ans);

    }
    public static int fact(int n){

        //Base Case
        if(n<=0){
          return 1; 
        }
        int fnm1 = fact(n-1);    // works same  if Exclude this line of code
        int ans = n * fact(n-1);
        return ans;
    }
}
