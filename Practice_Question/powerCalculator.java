import java.util.Scanner;

public class powerCalculator {

    public static int power(int x,int n) {
        int result = 1;
        for (int i = 0; i < n; i++) {
            result *= x;
        }
        return result;
    }
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);

         System.out.print("Enter the base number: ");
         int x = sc.nextInt();
         System.out.print("Enter the exponent: ");
         int n = sc.nextInt();
         
         int ans = power(x, n);
        System.out.println("The result of " + x + " raised to the power of " + n + " is: " + ans);
    }
    
}
