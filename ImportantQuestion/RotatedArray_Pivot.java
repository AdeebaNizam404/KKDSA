package ImportantQuestion;
import java.util.Scanner;
public class RotatedArray_Pivot {
    public static void main(String[] args){
        System.out.println("Enter the size of array");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements");
        for (int i = 0; i < arr.length; i++) {
           arr[i]=in.nextInt();
        }
        System.out.println(findPivot( arr));
    }
    

static int findPivot(int[] arr){
int start = 0;
int end =arr.length-1;
while(start<=end){
    int mid = start+(end-start)/2;
    if(mid<end&&arr[mid]>arr[mid+1]){
        return mid;
    }
    if(mid>start&&arr[mid]<arr[mid-1]){
        return mid-1;
    }
   if(arr[mid]<=arr[start]){
    end =mid-1;
   }
   else{
    start = mid+1;
   }

}
         return -1;
}
}
