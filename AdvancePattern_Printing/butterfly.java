import java.util.*;

public class butterfly{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        // upper half of butterfly
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print("* ");
            }
            for(int j=1;j<=2*(n-i);j++) {
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++) {
                System.out.print("* ");
        }
        System.out.println();
        }
        // Lower half of butterfly
        for(int i=n;i>=1;i--) {
            for(int j=1;j<=i;j++) {
                System.out.print("* ");
            }
            for(int j=1;j<=2*(n-i);j++) {
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++) {
                System.out.print("* ");
        }
        System.out.println();
        }

    }
}