import java.util.Arrays;

public class msInPlace {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        mergeSortInPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr)); // [1, 2, 3, 4, 5]
    }

    // Sorts arr in range [s, e) in-place (uses a temporary mix array during merge)
    static void mergeSortInPlace(int[] arr, int s, int e) {
        if (e - s <= 1) { // zero or one element is already sorted
            return;
        }
        int mid = s + (e - s) / 2;

        // recursive calls on left and right halves (same array, different ranges)
        mergeSortInPlace(arr, s, mid);
        mergeSortInPlace(arr, mid, e);

        mergeInPlace(arr, s, mid, e);
    }

    // Merge sorted subarrays arr[s..mid-1] and arr[mid..e-1] into arr[s..e-1]
    static void mergeInPlace(int[] arr, int s, int m, int e) {
        int[] mix = new int[e - s];

        int i = s;   // pointer into left half
        int j = m;   // pointer into right half
        int k = 0;   // pointer into mix

        while (i < m && j < e) {
            if (arr[i] <= arr[j]) {   // stable: take left when equal
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        // copy remaining from left half
        while (i < m) {
            mix[k] = arr[i];
            i++;
            k++;
        }

        // copy remaining from right half
        while (j < e) {
            mix[k] = arr[j];
            j++;
            k++;
        }

        // write back to original array
        for (int l = 0; l < mix.length; l++) {
            arr[s + l] = mix[l];
        }
    }
}
