package Arrays.BinarySearch;

public class Solution {
    public static void main(String[] args) {
        Solution finder = new Solution();
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] result = finder.searchRange(nums, target);
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
