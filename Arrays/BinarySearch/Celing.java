package Arrays.BinarySearch;
import java.util.Scanner;
public class Celing {
   public static void main(String[] args){
   try( Scanner in = new Scanner(System.in);){
    System.out.println("Enter the sixe of array");
      int n=in.nextInt();
      int arr[]=new int[n];
      System.out.println("Enter array elements");
      for(int i=0;i<arr.length;i++){
        arr[i]=in.nextInt();
      }
      System.out.println("Enter the target to be find");
      int t = in.nextInt();
      System.out.println(CelingBS(arr,t));
    }
   } 
   
}
