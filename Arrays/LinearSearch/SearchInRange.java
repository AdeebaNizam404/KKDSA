package Arrays.LinearSearch;
import java.util.Scanner;
import java.util.Arrays;
public class SearchInRange {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter 10 Elements in an array");
        for(int i=0;i<arr.length;i++){
            arr[i]= in.nextInt();
        }
        Arrays.toString(arr);
        System.out.println("Enter the range");
        int s = in.nextInt();
        int e = in.nextInt();
        System.out.println("Enter the element you want to find");
         int ele = in.nextInt();
       System.out.println(linearSearch(arr,ele,s,e));
    }
    static boolean linearSearch(int[]ar,int target, int start,int end){
        if(ar.length==0){
            return false;
        }
        for(int i=start;i<end;i++){
            if(target==ar[i]){
               return true; 
            }
        }
        return false;
    }
}
