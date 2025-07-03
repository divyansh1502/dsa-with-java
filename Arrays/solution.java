import java.util.*;

public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Target : ");
        int target = sc.nextInt();
        System.out.print("Enter the length of the array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the elements : ");

        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < arr.length; i++) {
            if(arr[i]+arr[i+1]==target) {
                System.out.print(arr[i]);
                System.out.print(arr[i+1]);
            }
        }
        
    }
}