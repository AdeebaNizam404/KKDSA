package Recursion.ArrayQue;
public class RBs {
    public static void main(String[] args) {
        int[] ar={5,6,7,8,9,1,2,3};
       int array=search(ar, 2, 0, ar.length-1);
        System.out.println(array);
    }
    static int search(int[] arr,int target,int s,int e){
        if(s>e){
            return -1;
        }
         int m=s+(e-s)/2;
         if(arr[m]==target){
            return m;
         }
         if(arr[s]<=arr[m]){
            if(target>=arr[s]&&target<=arr[m]){
             return search(arr,target,m+1,e);
            }
            else{
                return search(arr,target,m+1,e);
            }
         }
         if(target>=arr[m]&&target<=arr[e]){
            return search(arr,target,m+1,e);
         }
         return search(arr,target,s,m-1);
    }
}
