package Strings.StringRecursion;

public class SkipCharacter {
    public static void main(String[] args) {
     String ar="adeeba";
     skip(" ","adeeba");
     System.out.println(ar);
     System.out.println(skipRet("Aysha"));
        
    }
    static void skip(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return ;
        }
        char ch=up.charAt(0);
        if(ch=='a'){
          skip(p,up.substring(1));
        }
        else{
            skip(p+ch,up.substring(1));
        }
    }
    //if want to return the string 
    static String skipRet(String up){
        if(up.isEmpty()){
          
            return "" ;
        }
        char ch=up.charAt(0);
        if(ch=='a'){
         return  skipRet(up.substring(1));
        }
        else{
          return  ch+ skipRet(up.substring(1));
        }
    }
   
}
