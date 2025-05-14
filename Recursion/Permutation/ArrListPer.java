package Recursion.Permutation;

import java.util.ArrayList;

public class ArrListPer {
    public static void main(String[] args) {
         ArrayList<String> ans =  perList("","abc");
         System.out.println(ans);
        
    }
    static ArrayList<String> perList(String p,String up){
            if(up.isEmpty()){
                ArrayList<String> list = new ArrayList<>();
                list.add(p);
                return list;
            }
            char ch = up.charAt(0);
             ArrayList<String> ans = new ArrayList<>();
            for (int i = 0; i <= p.length(); i++) {
     String first = p.substring(0,i);
     String second = p.substring(i, p.length());
      ans.addAll(perList(first+ch+second, up.substring(1)));
            }
            return ans;
    }
}
