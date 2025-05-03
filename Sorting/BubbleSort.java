package Sorting;
import java.util.Scanner;
import java.util.Arrays;
public class BubbleSort {
   //with each paas the largest is at end 
 public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();//taking array input;
    int[] arr = new int[n];
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
     sc.close();
    bubble(arr);  
      System.out.println(Arrays.toString(arr));
     

 }
 static void bubble(int[] ar){
    boolean swapped;
    //run the step n-1 times;
    for (int i=0;i<ar.length;i++){
        swapped=false;
        //for every step max item will come at the last respective index
       for(int j=1;j<ar.length-i;j++){
        //swap if the item is smaller than the previous
     if(ar[j]<ar[j-1]){
        //swap
        int temp=ar[j];
        ar[j]=ar[j-1];
        ar[j-1]=temp;
        swapped = true;
     }
   } 
   //if u did not swap for a perticular value of i;it means the array is sorted hence stop theloop
   if(!swapped){
    break;
   }
}
 }
 
}
