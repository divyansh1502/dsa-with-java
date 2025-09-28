public class triangle {
    public static void main(String[] args) {
        System.out.println("Inverted Triangle:");
        triangle(4, 0);

        System.out.println("\nNormal Triangle:");
        triangle1(4, 0);
    }

    // Inverted Triangle
    static void triangle(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            System.out.print("* ");
            triangle(r, c + 1);
        } else {
            System.out.println();
            triangle(r - 1, 0);
        }
    }

    // Normal Triangle
    static void triangle1(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            triangle1(r, c + 1);
            System.out.print("* ");
        } else {
            triangle1(r - 1, 0);
            System.out.println();
        }
    }
}
