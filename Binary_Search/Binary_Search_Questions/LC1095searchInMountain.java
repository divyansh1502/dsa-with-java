public class LC1095searchInMountain {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 1};
        int target = 3;
        int index = search(arr, target);
        System.out.println("Target found at index: " + index);
    }

    static int search(int[] arr, int target) {
        int peak = findPeakIndex(arr);

        // Search in the first (ascending) half
        int index = orderAgnosticBS(arr, target, 0, peak);
        if (index != -1) return index;

        // If not found, search in the second (descending) half
        return orderAgnosticBS(arr, target, peak + 1, arr.length - 1);
    }

    static int findPeakIndex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }

    static int orderAgnosticBS(int[] arr, int target, int start, int end) {
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
// This is how I solve this code 
/*public class LC1095searchInMountain {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int target = 3;
        int index = search(arr ,target);
        System.out.println(index);
    }
    static int search(int[] arr,int target) {
        int peak = peakElement(arr);
        int index = firstHalfBS(arr,target,peak);
        if (index == -1) {
            index = secondHalfBS(arr, target, peak + 1);
        }
        return index;
    }
    static int firstHalfBS(int[] arr,int target, int peakElement) {
        int start = 0;
        int end = peakElement;
        while(start <= end) {
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
    static int secondHalfBS(int[] arr,int target, int endOfFirstHalf) {
        int start = endOfFirstHalf;
        int end = arr.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                end = mid - 1;
            } else if (target < arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
    static int peakElement(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while  (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }
    
} */
