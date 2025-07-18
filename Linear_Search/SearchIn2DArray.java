import java.util.*;

public class SearchIn2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = {
            {18, 25, 10},
            {60, 36, 45, 6},
            {13, 17, 23, 19},
            {55, 99}   
        };
        System.out.print("Enter the Target number : ");
        int target = sc.nextInt();
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }          
        }
        return new int[]{-1, -1};
    }
}

