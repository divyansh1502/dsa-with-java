import java.util.*;

public class tablePrinting {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for table : ");
        int n = sc.nextInt();

        for(int i = 1;i <= 10;i++) {
            System.out.println(n + "X" + i + "="+( n*i));
        }
    }
}