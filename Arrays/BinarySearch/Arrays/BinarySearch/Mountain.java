package Arrays.BinarySearch;
import java.util.Scanner;
class Mountain{
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n =  in.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        System.out.println(peakIndexInMountainArray( arr) );
    }
    public static  int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
//decreasing part of array
            end = mid;
            } 
            else{
                //increasing  part of array
                start = mid+1;
            }
        }
        return start;
    }
}
