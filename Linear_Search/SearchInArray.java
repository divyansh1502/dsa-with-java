import java.util.*;

public class SearchInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.print("Enetr the elements of array using space tab : ");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target element : ");
        int target = sc.nextInt();
        int index = linearSearch(arr,target);

        if (index != -1) {
        System.out.print("The required target index is : " + index);
        }
        else {
            System.out.print("Target element is not found in the array");
        }
        
    }
    //Search in the array: return the index if the item found
    //otherwise if tem not found return -1
    static int linearSearch(int[] arr,int target) {
        if (arr.length == 0) {
            return -1;
        }

        //run a for loop
        for(int i = 0; i < arr.length; i++) {
            //Check for element for every index if it is = target
            if(arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}


