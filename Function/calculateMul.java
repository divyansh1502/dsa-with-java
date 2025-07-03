import java.util.*;

public class calculateMul {
    public static int calculateMul(int a,int b) {
        int mul = a * b;
        return mul;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st number : ");
        int a = sc.nextInt();
        System.out.print("Enter the 2nd number : ");
        int b = sc.nextInt();
        int mul = calculateMul(a, b);
        System.out.print("The multiplication of " + a + " and " + b + " is " + mul);

    }
}