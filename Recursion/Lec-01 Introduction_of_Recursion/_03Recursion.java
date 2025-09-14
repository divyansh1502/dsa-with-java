
public class _03Recursion {
    public static void main(String[] args) {
        print(1);
    }
    static void print(int n) {
        // Base conditin
        if (n == 6) {
            return; // this base condition is use to break the fn.If it is not present stack overflow error happen.
        }
        System.out.println(n);
        // Recursive call
        // If we are calling a fn again and again, you can treat it as a seperate call in the stack

        print(n + 1); // this is called tail recursion, This is the last fn call
    }
}
