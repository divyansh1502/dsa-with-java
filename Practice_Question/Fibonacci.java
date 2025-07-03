import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int n = sc.nextInt();
        int a=0,b=1,c;

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            c = a + b; // Calculate the next term
            a = b; // Update a to the next term
            b = c; // Update b to the next term
        }
    }
}
