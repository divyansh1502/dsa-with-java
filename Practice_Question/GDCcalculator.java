import java.util.Scanner;

public class GDCcalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st number : ");
        int a = sc.nextInt();
        System.out.print("Enter the 2nd number : ");
        int b = sc.nextInt();

        while(a != b) {   
            if(a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        System.out.println("The GDC is : " + b);
    }
    
}
