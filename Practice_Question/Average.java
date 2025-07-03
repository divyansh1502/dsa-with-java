import java.util.*;

public class Average {
    public static float myAvg(float a, float b, float c ) {
    float average = (a+b+c)/3;
    return average;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("The average of given numbers is : "+ myAvg(a,b,c));
    }
}
