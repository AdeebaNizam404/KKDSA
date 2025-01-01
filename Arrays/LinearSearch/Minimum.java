package Arrays.LinearSearch;
import java.util.Scanner;
import java.util.Arrays;
public class Minimum {
    public static void main(String[] args){
     Scanner in = new Scanner(System.in);
     int[] arr = new int[10];
       System.out.println("Enter 10 elements");
       for(int i=0;i<arr.length;i++){
        arr[i]=in.nextInt();
       }
       Arrays.toString(arr);
      
        System.out.println("Minimum element"+ minimum(arr));

    }
    static int  minimum(int[] ar ){
        int min=ar[0];
        for(int i=0;i<ar.length;i++){
         if(ar[i]<min){
            min=ar[i];
         }
        }
                return min;
    }
}
