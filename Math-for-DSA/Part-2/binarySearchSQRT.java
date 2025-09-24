public class binarySearchSQRT {
    public static void main(String[] args) {
        int n = 40;
        int p = 3; // precision

        System.out.println(sqrt(n, p));
    }

    static double sqrt(int n, int p) {
        int s = 0;
        int e = n;
        double root = 0.0;

        // Step 1: Binary Search for integer part
        while (s <= e) {
            int m = s + (e - s) / 2;

            if (m * m == n) {
                root = m;
                break;
            }

            if (m * m < n) {
                s = m + 1;
                root = m; // store closest root
            } else {
                e = m - 1;
            }
        }

        // Step 2: Precision for decimals
        double increment = 0.1;
        for (int i = 0; i < p; i++) {
            while (root * root <= n) {
                root += increment;
            }
            root -= increment; // step back
            increment /= 10;
        }

        return root;
    }
}
