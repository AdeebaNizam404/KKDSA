package Arrays.BinarySearch;
import java.util.Scanner;
public class Program {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the the size of array");
        int n= in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements");;
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
            System.out.println("Enter an element you want to find");
            int target = in.nextInt();
        
       System.out.println(binarySearch(arr,target)); 
    }
    static int binarySearch(int[]ar,int t){
      int start = 0;
      int end = ar.length-1;
      while(start<=end){
        int mid = start+(end-start)/2;
        if(t<ar[mid]){
         end = mid-1;
        }
        else if(t>ar[mid]){
            start = mid+1;
        }
        else{
            return mid;
        }
      }
      return -1;
    }
}
