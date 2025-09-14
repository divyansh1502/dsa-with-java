import java.util.Scanner;

public class _04Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        System.out.println(fibo(n)); // print the nth Fibonacci number
    }

    
    static int fibo(int n) {
        if (n < 2) {                // base case: stop recursion here
            return n;              // directly return 0 or 1 to the caller
        }
        return fibo(n - 1) + fibo(n - 2);// recursive case: compute two smaller subproblems,
        // receive their returned values, add them, and return the sum to the caller.
    }
}
/*
     * Return logic (6 lines):
     * - If n < 2: return n directly (base cases: fibo(0)=0, fibo(1)=1).
     * - Otherwise, recursively compute fibo(n-1) and fibo(n-2).
     * - Each recursive call finishes by returning an int result to its caller.
     * - The current call adds those two returned ints together.
     * - That sum is then returned to the previous stack frame, and this bubbles up until fibo(n) is returned.
     */
