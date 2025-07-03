import java.util.*;
public class sumByInput {
    public static void main(String [] args) {
        //Taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your 1st number : ");
        int a  = sc.nextInt();
        System.out.print("Enter your 2nd number : ");
        int b = sc.nextInt();
        //Performing Operations
        int sum = a + b;
        System.out.println("Sum is : " + sum);
    }
}