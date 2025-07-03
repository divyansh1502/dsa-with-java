import java.util.*;

public class InputusingForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<arr.length;i++) {
            System.out.print("Enter " + (i+1) + " Element : ");
            arr[i] = sc.nextInt();
        }
        // for(int i=0;i<arr.length;i++) {
        //     System.out.println(arr[i] + " ");

        // for(int num : arr) { // for every element in array, print the element
        //     System.out.print(num + " "); // here num represents element of the array
        System.out.println(Arrays.toString(arr));
    }
}

    

