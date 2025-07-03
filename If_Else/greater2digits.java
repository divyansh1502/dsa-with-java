import java.util.*;

public class greater2digits {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("The greater number is: " + a);
        } else if (b > a) {
            System.out.println("The greater number is: " + b);
        } else {
            System.out.println("Both numbers are equal.");
        }
    }
}