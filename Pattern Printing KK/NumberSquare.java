import java.util.Scanner;

public class NumberSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of lines : ");
        int n = sc.nextInt();
        pattern(n);
    }

    static void pattern(int n) {
        int size = 2 * n - 1; // matrix size
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                int minDist = Math.min(
                    Math.min(i - 1, j - 1),
                    Math.min((2 * n - 1) - i, (2 * n - 1) - j)
                );
                int atEveryIndex = n - minDist;
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }
}
