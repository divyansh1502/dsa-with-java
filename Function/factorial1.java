import java.util.Scanner;
public class factorial1 {

    static void fact(int n) {
        if(n<0){
            System.out.println("Factorial is not defined for negative numbers");
            return;
        }
        int fact = 1;
        for(int i = n; i>=1; i--) {
            fact = fact*i;
        }
        System.out.println(fact);

    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();

        fact(n);
        
    }
}
