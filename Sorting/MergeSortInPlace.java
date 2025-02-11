package Sorting;

import java.util.Arrays;

public class MergeSortInPlace {
      public static void main(String[] args) {
        int[] ar={8,3,4,12,5,6};
      mergeSortInPlace(ar,0,ar.length);
        System.out.println(Arrays.toString(ar));
    }
    static void mergeSortInPlace(int[] arr,int s,int e){
       if(e-s==1){
        return;
       }
       int mid =(s+e)/2;
        mergeSortInPlace(arr,s,mid);
        mergeSortInPlace(arr,mid,e);
        merge(arr,s,mid,e);
    }
    private static void  merge(int[] arr, int s,int m,int e){
        int[] mix=new int[e-s];
        int i=s;
        int j=m;
        int k=0;
        while(i<m&&j<s){
            if(arr[i]<arr[j]){
                
                    mix[k]=arr[i];
                    i++;
             } else{
                    mix[k]=arr[j];
                    j++;
                }
                k++;
            }
            //it may be possible that one of array is not complete
            //coppy the remaning element 
            while(i<m){
                mix[k]=arr [i];
                i++;
                k++;
            }
            while(j<e){
                mix[k]=arr[j];
                j++;
                k++;
            }
           for (int l = 0; l < mix.length; l++) {
           arr[s+1]=mix[l];
           }
        }

}
