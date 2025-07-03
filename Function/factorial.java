import java.util.*;

public class factorial {
    public static void printFactorial(int n) {
        if(n < 0) {
            System.out.print("Factorial is not defined for negative numbers.");
            return;
        }
        int fact = 1;
        for(int i = n; i >= 1; i--) {
            fact = fact * i;
        }
        System.out.print(fact);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to find factorial : ");
        int n = sc.nextInt();
        printFactorial(n);
    }
}