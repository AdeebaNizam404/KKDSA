package ImportantQuestion ;
import java.util.Scanner;

public class LastAndFirstElement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LastAndFirstElement finder = new LastAndFirstElement();
        System.out.println("Enter the size of array");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        } 
        System.out.println("Enter the target");
        int target = in.nextInt();
        int[] result = finder.searchRange(arr, target);
        System.out.println("First Position: " + result[0]);
        System.out.println("Last Position: " + result[1]);
    }

    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        // Check for the first and last occurrences of the target
        ans[0] = search(nums, target, true);  // First occurrence
        ans[1] = search(nums, target, false); // Last occurrence
        return ans;
    }

    // This function returns the index of the target based on findStartIndex
    int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            // Find the middle element
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                // Potential answer found
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1; // Narrow the search to the left half
                } else {
                    start = mid + 1; // Narrow the search to the right half
                }
            }
        }

        return ans;
    }
}