package Recursion.ArrayQue;

public class LinearSearch {
    public static void main(String[] args) {
       int[] ar={1,7,99,88,56};
       System.out.println(isFound(ar,66,0)); 
       System.out.println(isFoundIndex(ar,56,0)); 
    }
    static boolean isFound(int[] arr, int target, int index){
        if(index==arr.length){
            return false;
        }
            return arr[index]==target||isFound(arr,target,index+1);
        
    }
    static int isFoundIndex(int[] arr, int target, int index){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        else{
            return isFoundIndex(arr,target,index+1);
        }
          
        
    }
}

