package Arrays;
//import java.util.Scanner;
//import java.util.Arrays;
public class Maximum {
    public static void main(String[] args){
    // Scanner in = new Scanner(System.in);
     int[] arr = {1,23,44,5,6,78};
     System.out.println(max(arr));
    }
    static int max(int[] arr){
        int maxVal = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
