import java.util.Arrays;

public class LC32FlipImage {

    // method that flips horizontally and inverts the image
    public static int[][] flipAndInvertImage(int[][] image) {
        for (int[] row : image) {
            int n = row.length;
            for (int i = 0; i < (n + 1) / 2; i++) {
                int j = n - 1 - i;
                if (i == j) {
                    // middle element in odd-length row: just invert
                    row[i] ^= 1;
                } else {
                    // swap and invert both
                    int tmp = row[i] ^ 1;
                    row[i] = row[j] ^ 1;
                    row[j] = tmp;
                }
            }
        }
        return image;
    }

    // utility to print 2D array
    private static void printMatrix(int[][] mat) {
        for (int[] row : mat) {
            System.out.println(Arrays.toString(row));
        }
    }

    // main method (psvm) with a LeetCode example
    public static void main(String[] args) {
        // LeetCode example input:
        // [[1,1,0],[1,0,1],[0,0,0]]
        int[][] image = {
            {1, 1, 0},
            {1, 0, 1},
            {0, 0, 0}
        };

        System.out.println("Input:");
        printMatrix(image);

        int[][] result = flipAndInvertImage(image);

        System.out.println("\nOutput:");
        printMatrix(result);

        // Expected Output for the example:
        // [1, 0, 0]
        // [0, 1, 0]
        // [1, 1, 1]
    }
}
