public class SumOfNaturalNumber {
    public static void main(String[] args) {
        int ans = sumNatural(6);
        System.out.println(ans);

    }
    public static int sumNatural(int n){

        //Base Case
        if(n==1){   
          return 1; 
        }
         
        int ans = n + sumNatural(n-1);
        return ans;
    }
}