import java.util.Scanner;

public class findingElement {
    
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
        System.out.print("Enter the number to find it's index: ");
        int x = sc.nextInt();
        // Display the numbers in the array
        for(int i = 0; i < size; i++) {
            if (numbers[i] == x) {
                System.out.println("x is found at index " + i);
            }
            
        }
    }
    
}

    

