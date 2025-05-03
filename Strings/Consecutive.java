package Strings;
// input - she is a little feeding a rabbit with an apple 
// output- Count: 4
import java.util.Scanner;
public class Consecutive {
  public static void main(String args[]){
 Scanner in = new Scanner(System.in);
 String str=in.nextLine();
 wordCount(str);
 in.close();
  }
 
  static  void  wordCount(String n){
    int count=0;
      String[] word=n.split("\\s+");
      for(String words:word){
        if(Consecutivecount(words)){
            count ++;
            System.out.print((words+" "));
        }
      }
      System.out.println(" "+count);

  }
  static boolean Consecutivecount(String n){
    for(int i=0;i<n.length()-1;i++){
    if(n.charAt(i)==n.charAt(i+1))
       return true;
    }
    return false;
  }
  
}
