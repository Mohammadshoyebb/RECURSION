public class x_To_The_Power_n {
    public static void main(String[] args) {
        System.out.println(power(2, 5));
    }
    public static int power(int x,int n){
        //BASE CASE
        if(n==0)
        return 1;
        //LOGIC
        return x * power(x, n-1);
    }
}
