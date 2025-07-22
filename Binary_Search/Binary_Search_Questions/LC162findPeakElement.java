//https://leetcode.com/problems/find-peak-element/
public class LC162findPeakElement {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 2, 4, 5, 6, 3, 1};
            System.out.println(findPeakElement(nums));
    }
    static int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < nums[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }
}
    

