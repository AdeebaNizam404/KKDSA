package Arrays.LinearSearch;
import java.util.Scanner;
public class SearchInString {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
 
       System.out.println("Enter the statement in which u want to Search the character");
       String  n = in.nextLine();
       System.out.println("Enter an element you want to find");
       char target = in.next().charAt(0);
      System.out.println(Search(n,target)); 
    }
    static boolean Search(String str,char ch){
         if (str.length()==0){
         return false;
         }
         for( int i=0;i<str.length();i++){
            if(ch==str.charAt(i)){
                return true;
            }
         }
         return false;
    }
}
