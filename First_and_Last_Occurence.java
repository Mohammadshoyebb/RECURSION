public class First_and_Last_Occurence {
    public static int first = -1;
    public static int last = -1;
    public static void firstLast(String str, int index,char key){
        // Base Case
        if(index == str.length()){
            System.out.println("First Index is: "+ first);
            System.out.println("Last index is: "+last);
            return;
        }

        // LOGIC
        char ch = str.charAt(index);
        if(ch == key){
            if(first == -1){
                first = index;
                last = index;
            }
            last = index;
        }
        firstLast(str, index+1, key);
    }
    public static void main(String[] args) {
        String s = "abcaabxchababb";
        firstLast(s, 0, 'b');
    }
}
