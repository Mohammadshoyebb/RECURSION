public class TilingProblem {
   public static int ways(int n){
    //Base case
    if (n==0 || n==1){
        return 1;
    }
    //Logic

    int verticalCase = ways(n-1);
    int horizontalCase = ways(n-2);

    return verticalCase+horizontalCase;

   } 
   public static void main(String[] args) {
    System.out.println(ways(7));
    System.out.println(ways(6));
    System.out.println(ways(5));
    System.out.println(ways(4));
    System.out.println(ways(3));
    System.out.println(ways(2));
    
   }
}
