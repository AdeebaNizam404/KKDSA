package Arrays.BinarySearch;
//ceiling = smallest element in an array greater or equal to a target
import java.util.Scanner;
public class Celing {
   public static void main(String[] args){
    @SuppressWarnings("resource")
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the size of array");
      int n=in.nextInt();
      int ar[]=new int[n];
      System.out.println("Enter array elements");
      for(int i=0;i<ar.length;i++){
        ar[i]=in.nextInt();
      }
      System.out.println("Enter the target to be find");
      int t = in.nextInt();
      System.out.println(CeilingBS(ar,t));
   }
   
     static int  CeilingBS(int[]arr,int target){
      //target is greater than the greatest number in the array
        if(target>arr[arr.length-1]){
          return -1;
        }
        int start = 0;
        int end = arr.length-1; 
        while(start<=end){
          int mid=start+(end-start)/2;
          if(target<arr[mid]){
            end=mid-1;
          }
          else if (target>arr[mid]){
            start=mid+1;
          }
          else{
            return mid;
          }
        }
        return start;
     
}
}
