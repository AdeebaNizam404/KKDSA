package Arrays.ArraysQuestions;
//import java.util.Scanner;
import java.util.Arrays;
public class Swap {
    public static void main(String[] args){
       // Scanner in = new Scanner(System.in);
        int[] arr = {2,5,6,7,1};
        swap(arr ,1,2);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int index1, int index2){
      int temp = arr[index1];
      arr[index1]  =  arr[index2];
      arr[index2] = temp;
    }

    
}
