public class LC410splitArrayLargestSum {
    public static void main(String[] args) {
        int[] nums = {7, 2, 5, 10, 8};
        int m = 2;
        System.out.println(splitArray(nums, m)); // Output should be 18
    }

    public static int splitArray(int[] nums, int m) {
        int start = 0;
        int end = 0;

        for (int num : nums) {
            start = Math.max(start, num); // largest single element
            end += num; // total sum
        }

        // Binary Search
        while (start < end) {
            int mid = start + (end - start) / 2;

            int sum = 0;
            int pieces = 1;

            for (int num : nums) {
                if (sum + num > mid) {
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }

            if (pieces > m) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return end; // start == end
    }
}
