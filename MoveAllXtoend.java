public class MoveAllXtoend {
    public static int count = 0;
    public static void move(String str,int index,String s){

        //BASE CASE
        if(index == str.length()){
            for(int i=0;i<count;i++){
                s+='x';
            }
            System.out.println(s);
            return;
        }
        //LOGIC PART
        char ch = str.charAt(index);

        if(ch == 'x'){
            count++;
        }else{
            s += ch;
        }
        move(str, index+1, s);
    }
    public static void main(String[] args) {
        move("axbcxxbdex", 0, "");
    }
}
