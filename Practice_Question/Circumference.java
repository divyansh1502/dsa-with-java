import java.util.Scanner;

public class Circumference {
    public static float circumference(int r){
        float c = 2 * 3.14f * r;
        return c;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        float result = circumference(r);
        System.out.println("THe circumference of the circle is : " + result);
    }
    
}
