/*
 * we can move rigth or downwards only 
 */
public class CountPathInMAZE {
    public static int countMove(int i, int j, int n, int m){
        if(i==n || j==m){
            return 0;
        }
        if(i==n-1 && j == m-1){
            return 1;
        }

        int downWard = countMove(i+1, j, n, m);

        int rightMove = countMove(i, j+1, n, m);

        return downWard + rightMove;
    }
    public static void main(String[] args) {
        System.out.println(countMove(0,0,3,3));
    }
}
