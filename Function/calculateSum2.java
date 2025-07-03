import java.util.*;

public class calculateSum2 {
    public static int calculateSum(int a,int b) {
        int sum = a + b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st number : ");
        int a = sc.nextInt();
        System.out.print("Enter the 2nd number : ");
        int b = sc.nextInt();

        int sum = calculateSum(a, b);
        System.out.print("The sum of "+ a +" and "+ b +" is : " + sum);

    }
}