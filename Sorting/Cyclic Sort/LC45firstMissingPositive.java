public class LC45firstMissingPositive {
    public static void main(String[] args) {
        int[] arr = {7, 8, 9, 11, 12};
        System.out.println(firstMissingPositive(arr)); // expected: 1
    }

    public static int firstMissingPositive(int[] nums) {
        int n = nums.length;
        int i = 0;

        // Place each value v (1..n) at index v-1
        while (i < n) {
            int correctIndex = nums[i] - 1;
            if (nums[i] >= 1 && nums[i] <= n && nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }

        // Find first index where nums[index] != index+1
        for (int index = 0; index < n; index++) {
            if (nums[index] != index + 1) {
                return index + 1;
            }
        }

        // All 1..n present
        return n + 1;
    }

    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
