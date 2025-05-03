package Arrays.BinarySearch;
//floor-greater element in an array smaller or equal ro target 
import java.util.Scanner;
public class Floor {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        System.out.println("Enter the target");
        int t = in.nextInt();
        System.out.println(floor(arr,t));
        in.close();
    }
    static int floor(int[] ar,int target){
        if(target>ar[ar.length-1]){
            return -1;
          }
         int start = 0;
         int end = ar.length-1;
         while(start<=end){
            int mid = start+(end-start)/2;
            if(target<ar[mid]){
                end = mid-1;
            }else if(target>ar[mid]){
                start = mid+1;
            }
            else 
            return mid;
         }
         return end;
    }
}
