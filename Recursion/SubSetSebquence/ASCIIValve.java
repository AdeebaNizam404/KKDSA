package Recursion.SubSetSebquence;
import java.util.ArrayList;
public class ASCIIValve {
    public static void main(String[] args) {
       ;
      System.out.println( valueret("","abc"));

    }
    static void value(String p, String up ){
         if(up.isEmpty()){
            System.out.println(p);
            return;
         }
         char ch =up.charAt(0);
         value(p,up.substring(1));
         value(p+ch,up.substring(1));
         value(p+(ch+0),up.substring(1));

    }
    static ArrayList<String> valueret(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch =up.charAt(0);
        ArrayList<String> left = valueret(p,up.substring(1));
        ArrayList<String> right = valueret(p+ch,up.substring(1));
        ArrayList<String> mid = valueret(p+(ch+0),up.substring(1));
        left.addAll(right);
        left.addAll(mid);
        return left;
    }

}
