import java.util.Scanner;

public class inputSize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : "); 
        int size = sc.nextInt();
        int numbers[] = new int[size];

        // Input numbers into the array
        for(int i = 0; i < size; i++) {
            System.out.print("Enter number : ");
            numbers[i] = sc.nextInt();
        }

        // Display the numbers in the array
        for(int i = 0; i < size; i++) {
            System.out.println(numbers[i]);
        }
    }
    
}
