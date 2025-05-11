package Recursion.SubSetSebquence;
import java.util.ArrayList;
public class SubSet {
    public static void main(String[] args) {
         
         ArrayList<String> ans = subseq("","abc");
         System.out.println(ans);
     
  
    }
    static void subsetans(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);

            return ;
        }
         char ch = up.charAt(0);
         subsetans(p+ch,up.substring(1));
         subsetans(p,up.substring(1));
    }
    static ArrayList<String> subseq(String p, String up){
          if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
          }
          char ch = up.charAt(0);
         ArrayList<String> left = subseq(p+ch,up.substring(1));
         ArrayList<String> right = subseq(p,up.substring(1));
 left.addAll(right);
 return left;
    }
   
    }

