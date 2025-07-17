import java.util.*;

public class InputMultidimensionalArray {
    public static void main(String[] args) {
        //input
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter the element use space  : ");
        int[][] arr = new int[3][3];
        //arr.length give the number of rows always not column
        for(int row = 0; row < arr.length; row++) {
            for(int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }
        //#1 output
        // for(int row = 0; row < arr.length; row++) {
        //     for(int col = 0; col < arr[row].length; col++) {
        //         System.out.print(arr[row][col] + " ");        
        //     }
        //     System.out.println();
        //     }
        //#2 Output
        // for(int row  = 0; row < arr.length; row++) {
        //     System.out.println(Arrays.toString(arr[row])); 
        // }
        //#3 Output
        for(int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }
        
        }        
    }