package ImportantQuestion;
import java.util.Scanner;
public class RotatedArrayWithDuplicate {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Read the size of the array
        System.out.println("Enter the size of the array:");
        int n = in.nextInt();
        int[] arr = new int[n];

        // Read the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        // Read the target value
        System.out.println("Enter the target element:");
        int target = in.nextInt();

        // Call search and print the result
        int result = search(arr, target);
        if (result != -1) {
            System.out.println("Target found at index: " + result);
        } else {
            System.out.println("Target not found in the array.");
        }
    }

    static int search(int[] nums, int t) {
        int pivot = findPivot(nums);

        // If pivot is not found, the array is not rotated; do normal binary search
        if (pivot == -1) {
            return bs(nums, t, 0, nums.length - 1);
        }

        // If target is at the pivot
        if (nums[pivot] == t) {
            return pivot;
        }

        // If target is in the left sorted portion
        if (t >= nums[0]) {
            return bs(nums, t, 0, pivot - 1);
        }

        // If target is in the right sorted portion
        return bs(nums, t, pivot + 1, nums.length - 1);
    }

    static int bs(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Check if mid is the pivot
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
               if(arr[mid]==arr[start]&&arr[mid]==arr[end]){
                if(arr[start]>arr[start+1]){
                    return start;
                } 
                start++;
                if(arr[end]>arr[end-1]){
                    return end-1;
                } 
                   end--;
               }
               else if(arr[start]<arr[mid]||(arr[start]==arr[mid]&&arr[mid]>arr[end])){
                start=mid+1;
               }
               else{
                end=mid-1;
               }
    }
       
            return -1;
}
    }