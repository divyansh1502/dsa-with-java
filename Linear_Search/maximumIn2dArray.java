
public class maximumIn2dArray {
    public static void main(String[] args) {
        int[][] arr = {
            {18, 25, 10},
            {60, 36, 45, 6},
            {13, 17, 23, 19},
            {55, 9}   
        };
        int ans = max(arr);
        System.out.println(ans);
    }
    static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > max) {
                    max = arr[row][col];
                }
            }          
        }
        return max;
    }
    
}
