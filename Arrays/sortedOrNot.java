
import java.util.*;

public class sortedOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];

        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        boolean isAscending = true;

        for(int i = 0; i < arr.length-1; i++) {
            if(arr[i] > arr[i+1]) {
                isAscending = false;
            }
        }
        if(isAscending) {
            System.out.println("The array is sorted in ascending order");
        } else {
            System.out.println("The array is not sorted in ascending order");
        }
    }
    
    
}
