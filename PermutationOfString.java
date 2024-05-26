public class PermutationOfString{
    public static void printPerm(String str, String permutation){
        if(str.length() == 0){
            System.out.println(permutation);
            return;
        }
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            String newStr = str.substring(0, i)+str.substring(i+1);
            printPerm(newStr, permutation+ch);
        }
    }
    public static void main(String[] args) {
     printPerm("ABC","");
    }
}


/*
 * Let's go through the correct output step by step:

Initial call: printPerm("abc", "")

str = "abc", permutation = ""
Since str is not empty, we enter the loop.
Iteration 1: Character 'a' is selected.

i = 0, currChar = 'a', newStr = "bc"
Recursively call printPerm("bc", "a")
Recursive call 1: printPerm("bc", "a")

str = "bc", permutation = "a"
Since str is not empty, we enter the loop.
Iteration 1: Character 'b' is selected.

i = 0, currChar = 'b', newStr = "c"
Recursively call printPerm("c", "ab")
Recursive call 2: printPerm("c", "ab")

str = "c", permutation = "ab"
Since str has length 0, we print the permutation: "ab".
Backtracking: We return from the recursive call.

Iteration 2: Character 'c' is selected.

i = 1, currChar = 'c', newStr = "b"
Recursively call printPerm("b", "ac")
Recursive call 3: printPerm("b", "ac")

str = "b", permutation = "ac"
Since str is not empty, we enter the loop.
Iteration 1: Character 'a' is selected.

i = 0, currChar = 'a', newStr = "b"
Recursively call printPerm("b", "ac")
Recursive call 4: printPerm("b", "ac")

str = "b", permutation = "ac"
Since str has length 0, we print the permutation: "ac".
Backtracking: We return from the recursive call.

Back to the original call:

The loop continues with the next iteration.
Iteration 2: Character 'b' is selected.

i = 1, currChar = 'b', newStr = "ac"
Recursively call printPerm("ac", "b")
This process repeats similarly for the other recursive calls until all permutations are printed.

So, the correct output of the program is:

Copy code
abc
acb
bac
bca
cab
cba
This output represents all possible permutations of the string "abc". Each line represents a unique permutation. Thank you for your patience!
 */