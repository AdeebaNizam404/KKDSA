package Arrays.ArraysQuestions;
//import java.util.Scanner;
import java.util.Arrays;
public class Reverse {
    public static void main(String[] args){
        //Scanner in = new Scanner(System.in);
        int[] arr = {1,2,99,88,3,4};
       // swap(arr,0,4);
       reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] arr){
     int start=0;
     int End=arr.length-1;
     while(start<End){
        swap( arr,start,End);
        start++;
        End--;
     }
    }

    static void swap(int[] arr,int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2] ;
        arr[index2] = temp;
    }
}
