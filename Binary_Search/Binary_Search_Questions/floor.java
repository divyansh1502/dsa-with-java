import java.util.*;
public class floor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {-18, -12, -6, 0, 3, 13, 17, 25, 55, 99};
        System.out.print("Enter the target number : ");
        int target = sc.nextInt();
        int ans = floor(arr, target);
        System.out.println(ans);
    }
        // return the index of greatest no <= target
        static int floor(int[] arr, int target) {
            int start = 0;
            int end = arr.length-1;

            while (start <= end) {
                // find the middle element
                // int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of integer  in java 
                //so better way is to find mid
                int mid = start + (end - start) / 2;

                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    // answer found
                    return mid;
                }
            }
            return end;
        
        }

    
}
