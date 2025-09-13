import java.util.Scanner;
public class solidRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int n = sc.nextInt();
        System.out.print("Enter the number of column : ");
        int m = sc.nextInt();
        pattern(n,m);
    }
    static void pattern(int n, int m) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print("* ");
            }
            // when one row is printed we have to add new line
            System.out.println();
        }
    }
}
// Output
/*
* * * * 
* * * *
* * * *
* * * *
* * * *
 */
