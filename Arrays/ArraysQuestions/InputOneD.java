package Arrays.ArraysQuestions;
import java.util.Arrays;
import java.util.Scanner;
public class InputOneD {
    
    public static void main(String[] args){
     try (Scanner in = new Scanner(System.in)) {
        System.out.println("Enter an array");
         int arr[] = new int[5];
         for(int i=0;i<5;i++){
            arr[i]=in.nextInt();
         }
         //for(int i=0;i<5;i++){
         System.out.println(Arrays.toString (arr));
    }
    }
}
