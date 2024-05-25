// Characters will be from 'a' to 'z'


import java.util.HashSet;

public class RemoveDuplicatesFromString {


    // ********************** RECURSION *************************
    public static String rmDuplicate(String s, int index,StringBuilder sb,HashSet hs){
        //Base Case
        if(index == s.length()){
            return sb.toString();
        }

        //LOGIC
        char c = s.charAt(index);
        if(!hs.contains(c)){
            hs.add(c);
            sb.append(c);
        }
        rmDuplicate(s, index+1, sb, hs);

        return sb.toString();

        

    }







    public static String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        HashSet<Character> hs = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!hs.contains(c)) {
                hs.add(c);
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates("abcbdhvbbbshshsbbbsaadsfs"));
        System.out.println(rmDuplicate("abcbdhvbbbshshsbbbsaadsfs",0,new StringBuilder(), new HashSet<>()));
    }
}
