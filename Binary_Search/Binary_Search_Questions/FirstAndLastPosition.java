//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 7, 7, 8, 8, 10};
        int target = 7;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }

    static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};

        ans[0] = search(nums, target, true);  // First occurrence
        ans[1] = search(nums, target, false);   // Last occurrence

        return ans;
    }

    // Proper binary search for first or last occurrence
    static int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1; // ✅ Fix
            } else {
                // potential answer found
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1; // keep searching on left
                } else {
                    start = mid + 1; // keep searching on right
                }
            }
        }

        return ans;
    }
}
