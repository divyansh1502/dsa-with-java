import java.util.*;

public class PrintOddNo {
    public static void printOdd(int n) {
        int a = 0;
        for(int i = 1;i<=n;i=i+2) {
            a = a+ i;    
        }
        System.out.println("Sum of odd numbers is : " + a);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printOdd(n);
    }
}
    

