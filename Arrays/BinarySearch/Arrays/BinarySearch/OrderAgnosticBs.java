package Arrays.BinarySearch;
import java.util.Scanner;
public class OrderAgnosticBs {
    public static void main(String[] args){
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter the the size of array");
            int n = in.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter array elements");
            for(int i=0;i<arr.length;i++){
                arr[i]=in.nextInt();
            }
            System.out.println("Enter the Element you want to find");
            int t = in.nextInt();
            System.out.println(orderAgnosticBS(arr,t));
        }

    }
    static int orderAgnosticBS(int[] ar,int target){
        int start = 0;
        int end = ar.length-1;
    boolean isAsc=ar[start]<ar[end];
    while(start<=end){
        int mid = start+(end-start)/2;
        if (ar[mid]==target){
          return mid;
        }
        if(isAsc){
            if(target<ar[mid]){
                end=mid-1;
            }
            else{
                start = mid+1;
            }
        }
        else{
            if(target>ar[mid]){
                end=mid-1;
            }
            else{
                start = mid+1;
            }
        }

    }
    return -1;
}
}
