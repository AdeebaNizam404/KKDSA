package Arrays.LinearSearch;
import java.util.Scanner;
import java.util.Arrays;
public class Program {
    public static void main(String[] args){
       Scanner in = new Scanner(System.in);
       int[] ar = new int[10];
       System.out.println("Enter 10 elements in an array");
       for (int i = 0; i < ar.length; i++) {
        ar[i] = in.nextInt();
       }
       Arrays.toString(ar);
       System.out.println("Enter an element youn want to find");
         int target = in.nextInt();
         int ans = linearSearch(ar, target);
         System.out.println(ans);
    }
    static int linearSearch(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        for (int index=0;index<arr.length;index++){
            int element=arr[index];
            if(element==target){
                return index;
            }
        }
        return -1;
    }
}
