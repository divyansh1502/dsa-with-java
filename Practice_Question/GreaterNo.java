import java.util.Scanner;

public class GreaterNo {
    public static int greaterNo(int a,int b) {
        if(a>b) {
            return a;
        } else {
            return b;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = greaterNo(a, b);
        System.out.println("THe Greater number is : " + result);
    }
}
    

