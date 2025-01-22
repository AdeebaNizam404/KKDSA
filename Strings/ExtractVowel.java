package Strings;
import java.util.Scanner;
public class ExtractVowel {
    public static void main(String[] args){
     Scanner in=new Scanner(System.in);
     String str;
     System.out.println("Enter a String");
     str=in.nextLine().toUpperCase();
     StringBuilder Vowel=new StringBuilder();
     int count=0;
    //  boolean isVowel=true;
     for(int i=0;i<str.length();i++){
      char ch=str.charAt(i);
      if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
        Vowel.append(ch);
        // isVowel=false;
        count++;
      }
     }
     System.out.println(Vowel+"\n"+count);
    }
}
