import java.util.*;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is prime:");
        int n = sc.nextInt();

        for(int i = 2; i < n; i++) {
            if(n%i == 0) {
                System.out.println(n + " is not a prime number.");
                return; // Exit the method if a divisor is found
            } else {
                System.out.println(n + " is a prime number.");
                return; // Exit the method if no divisors are found
            }
        }
    }
    
}
