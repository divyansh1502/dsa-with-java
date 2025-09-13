import java.util.Scanner;
public class numberRAtriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of lines : ");
        int n = sc.nextInt();
        pattern(n);
    }
    static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            // when one row is printed we have to add new line
            System.out.println();
        }
    }
}
// output
/*
1 
1 2
1 2 3
1 2 3 4
1 2 3 4 5
*/