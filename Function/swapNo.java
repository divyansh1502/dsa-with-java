import java.util.Scanner;
public class swapNo {

    static void swap(int a,int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("First number after swapping is : "+ a);
        System.out.println("Second number after swapping is : "+ b);

    }
    
        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();
        
        System.out.println("First number before swapping is : "+ a);
        System.out.println("Second number before swapping is : "+ b);
        swap(a,b);
    }
        
}