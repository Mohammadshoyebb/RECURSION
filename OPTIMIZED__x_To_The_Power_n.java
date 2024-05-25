public class OPTIMIZED__x_To_The_Power_n {
   public static void main(String[] args) {
    System.out.println(power(2,6));
   } 
   public static int power(int x,int n){
    //BASE CASE
    if(n==0)
    return 1;


    //LOGIC
    int halfPower =  power(x , n/2) * power(x , n/2);

    if(n%2 == 0){
        return  halfPower;
    }
    else{
        return x * halfPower;
    }

}
}
