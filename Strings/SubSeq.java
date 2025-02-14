package Strings;
import java.util.ArrayList;
public class SubSeq {
    public static void main(String[] args) {
        String s="abc";
        subset("",s);
        System.out.println(subsetret("","ads"));
  
    }
    static void subset(String p,String up){
     if(up.isEmpty()){
        System.out.println(p);
        return;
     }
     char ch=up.charAt(0);
     subset(p+ch,up.substring(1));
     subset(p,up.substring(1));
    }
    static ArrayList<String> subsetret(String p,String up){
     if(up.isEmpty()){
        ArrayList<String> list=new ArrayList<>();
        list.add(p);
        return list;
     }
     char ch=up.charAt(0);
     ArrayList<String> left =subsetret(p+ch,up.substring(1));
     ArrayList<String> right= subsetret(p,up.substring(1));
     left.addAll(right);
     return left;
    }
}
