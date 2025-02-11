package Strings;

public class SB {
    public static void main(String[] args){
        StringBuilder builder=new StringBuilder();
        for (int i = 0; i <26; i++) {
            char ch= (char)('a'+i);
            builder.append(ch);
        }
        System.out.println(builder.toString());
        builder.deleteCharAt(0);
        builder.reverse();
        System.out.println(builder);
        String a="Adeeba";
        System.out.println(reverse(a));
    }
    static String reverse(String strr){
        int ch=strr.length()-1;
        String n=" ";
        while(ch>=0){
        char c=strr.charAt(ch);
          n=n+c;
          ch--;  
        }
        return n;
    }
   
}
