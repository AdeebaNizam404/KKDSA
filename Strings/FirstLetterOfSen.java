package Strings;
import java.util.Scanner;
public class FirstLetterOfSen {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String s;
        System.out.println("string");
        s=in.nextLine();
      StringBuilder firstLetter = new StringBuilder();
      boolean isWordStart=true;
        for(int i=0;i<s.length();i++){
             char  ch=s.charAt(i);
              if(ch==' '){
              isWordStart=true;
              }
              else if(isWordStart){
                firstLetter.append(ch);
                isWordStart=false;
              }
            }
        System.out.println(firstLetter) ;   
     
    }
}
