package Recursion.ArrayQue;


import java.util.Scanner;
public class SortedOrNot {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        int[] arr=new int[6];
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        System.out.println(sorted(arr,0));
    }
    static boolean sorted(int[] ar,int index){
        if(index==ar.length-1){
            return true;
        }
        return  ar[index]<ar[index+1]&& sorted(ar,index+1);
    }
  
}
