package Sorting;
import java.util.Scanner;
import java.util.Arrays;
public class SelectionSort {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();//taking  array size
        int[] arr =  new int[n];
        for(int i=0;i<arr.length;i++){
        arr[i]=in.nextInt();
        }
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] ar){
        for(int i=0;i<ar.length;i++){
        int last=ar.length-i-1;
         int maxIndex=getMaxIndex(ar, 0, last);
         //swap
         int temp=ar[maxIndex];
         ar[maxIndex]=ar[last];
         ar[last]=temp;
    }

}
 static int getMaxIndex(int[] aray,int start,int  end){
    int maxm =start;
    for(int i=start;i<=end;i++){
      if(aray[maxm]<aray[i]){
        maxm=i;
      }
    }
    return maxm;
 }
};
