import java.util.Scanner;

public class orderAgnosticsBS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {-18, -12, -6, 0, 3, 13, 17, 25, 55, 99};
        System.out.print("Enter the target number : ");
        int target = sc.nextInt();
        int ans = orderAgnosticBS(arr, target);
        System.out.print(ans);
    }
    
    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // Find whether the array is sorted in ascending or decending 
        boolean isAsc = arr[start] < arr[end];
        
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            } else {
                if (target > arr[mid]) {
                end = mid - 1;
                } else {
                start = mid + 1;
                  }
            }

            }       
        return -1;
    }
}
