package Recursion.SubSetSebquence;
public class SkipWord {
    public static void main(String[] args) {
       // String wrd="abccappledcch";
        String wrd="abccappdcch";
       // String ans=skipApple(wrd);
        String ans=SkipAppNotApple(wrd);
        System.out.println(ans);
        
    }
    static String  skipApple(String word){
        if(word.isEmpty()){
            return word;
        }
        char ch = word.charAt(0);
        if(word.startsWith("apple")){
            return skipApple(word.substring(5));
        }
        else{
     return ch+skipApple(word.substring(1));

        }
    }
    static String SkipAppNotApple(String s){
        if(s.isEmpty()){
            return s;
        } 
        char ch = s.charAt(0); 
        if(s.startsWith("app")&!s.startsWith("apple")){
            return SkipAppNotApple(s.substring(3));
        }
       
        else
        return ch+ SkipAppNotApple(s.substring(1));
    }
}
