package Sorting;
import java.util.Scanner;
import java.util.Arrays;
public class InsertionSort {
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int n= in.nextInt();//taking array size
    int[]arr = new int[n];
    for(int i=0;i<arr.length;i++){
      arr[i]=in.nextInt();
    }    
    insertion(arr);
        System.out.println(Arrays.toString(arr));
        in.close();
  }  
  static void insertion(int[] ar){
    for(int i=0;i<ar.length-1;i++){
        for(int j=i+1;j>0;j--){
            if(ar[j]<ar[j-1]){
              //swap
              int temp = ar[j];
              ar[j] =ar[j-1];
              ar[j-1]=temp;
            }
            else{
                break;
            }
        }
    }
  }
}
