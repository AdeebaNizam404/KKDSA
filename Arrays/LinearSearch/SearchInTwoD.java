package Arrays.LinearSearch;
import java.util.Scanner;

public class SearchInTwoD {
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
       int arr[][] = new int[4][4];
        System.out.println("Enter elements in array");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
             arr[i][j]=in.nextInt();
            }   

                System.out.println("Enter Element you are looking for");
                int t = in.nextInt();
                System.out.println(search(arr,t));
                                }
                                in.close();
            }
            static boolean search(int[][] ar,int target){
        if(ar.length==0){
            return false;
        }
        for(int i=0;i<ar.length;i++){
             i++;
            for(int j=0;j<ar[i].length;j++){
            j++;
            if(ar[i][j]==target)  {
                return true;
            }
            }
        }
        return false;
    }
    
}
