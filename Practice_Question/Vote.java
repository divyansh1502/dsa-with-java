import java.util.*;

public class Vote {
    static int voteOrNot(int age){
        if(age<18){
            return 0;
        } else {
            return 1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        int result = voteOrNot(age);
        if(result == 1) {
            System.out.println("You are eligible for vote");
        } else {
            System.out.println("You are not eligible for vote");
        }
        
    }
}
    

