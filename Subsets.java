public class Subsets {
    public static void findSubstes(String str,int index, String sb){
        //base case
        if(str.length() == index){
            System.out.println(sb);
            return;
        }

        //PICK
        char ch = str.charAt(index);
        findSubstes(str, index+1, sb + ch);

        // No Pick
        findSubstes(str, index+1, sb);
    }
    public static void main(String[] args) {
        findSubstes("abc", 0, "");
    }
}
