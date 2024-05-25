public class FriendsPairingProblem {
    public static int friendspair(int n){

        // Base Case
        if(n==1 || n==2){
            return n;
        }

        //Actual Logic

        /*
         * there are two cases:-
         * 1. Single person
         * 2. person in pair(only 2 people in a pair)
         */

         // single person
         int single = friendspair(n-1);


         // for pair there is (n-1) choices because a single person can make pair with (n-1) persons

         int pair = (n-1) * friendspair(n-2);

         return single + pair;



         // we can do it in one line
         // return friendspair(n-1) + (n-1) * friendspair(n-2)
    } 

    public static void main(String[] args) {
        System.out.println(friendspair(4));
    }
}
