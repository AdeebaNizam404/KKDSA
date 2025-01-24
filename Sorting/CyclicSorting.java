package Sorting;
import java.util.Scanner;
import java.util.Arrays;
public class CyclicSorting {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();//taking array size
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] =in.nextInt();
        }
        
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclic(int[] ar){
        int i=0;
         while(i<ar.length){
            int correct=ar[i]-1;
           if(ar[i]!=ar[correct]){
            //swap
            int tem=ar[i];
            ar[i]=ar[correct];
            ar[correct]=tem;

           }
           else i++; 
        }
         }
        }
    

 