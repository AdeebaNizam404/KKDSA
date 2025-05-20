package Recursion.BacktrackingQuestions;
import java.util.ArrayList;
public class MazeDiagonal {
    public static void main(String[] args){
 System.out.println(pathDigonal("", 3, 3));
    }
    static ArrayList<String> pathDigonal(String p,int r,int c){
        if(r==1&&c==1){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list =   new ArrayList<>();
        if(r>1){
            list.addAll(pathDigonal(p+'V',r-1,c));
        }  
        if(r>1&&c>1){
            list.addAll(pathDigonal(p+'D',r-1,c-1));
        }  
        if(c>1){
            list.addAll(pathDigonal(p+'H',r,c-1));
        } 
        return list; 
     }
}
