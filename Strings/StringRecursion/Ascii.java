package Strings.StringRecursion;
import java.util.ArrayList;
public class Ascii {
    public static void main(String[] args) {
   subseqAsciiret("","abc");
   System.out.println(subseqAsciiret("","abc"));
}
static void subseqAscii(String p,String  up){
 if(up.isEmpty()){
    System.out.println(p);
   return ;
 }
  char ch =up.charAt(0);
  subseqAscii(p+ch, up.substring(1));
  subseqAscii(p, up.substring(1));
  subseqAscii(p+(ch+0), up.substring(1));
 
}
static ArrayList<String> subseqAsciiret(String p,String  up){
 if(up.isEmpty()){
 
   ArrayList<String> list=new ArrayList<>();
   list.add(p);
   return list;
 }
  char ch =up.charAt(0);
  ArrayList<String> first= subseqAsciiret(p+ch, up.substring(1));
  ArrayList<String> second =subseqAsciiret(p, up.substring(1));
  ArrayList<String> third =  subseqAsciiret(p+(ch+0), up.substring(1));
  first.addAll(second);
  first.addAll(third);
  return first;
}
}