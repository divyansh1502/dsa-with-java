import java.util.Scanner;
public class inverseRAtriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of lines : ");
        int n = sc.nextInt();
        pattern(n);
    }
    static void pattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("* ");
            }
            // when one row is printed we have to add new line
            System.out.println();
        }
    }
}
// output
/*
* * * * * 
* * * *
* * *
* *
*
*/
