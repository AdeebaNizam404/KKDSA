package Recursion.SubSetSebquence;
import java.util.Scanner;
public class SkipA {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a String");
        String str=in.nextLine();
        skip(" ",str);
        System.out.println(str);
   in.close();
    }
    static void skip(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
        }
        char ch=up.charAt(0);
        if(ch=='a'){
            skip(p,up.substring(1));
        }
        else{
            skip(p+ch,up.substring(1));
        }
    }
}
