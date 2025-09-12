import java.util.Arrays;
public class toString {
    public static void main(String[] args) {
        System.out.println(58);
        System.out.println("Divyansh");
        System.out.println(new int[] {2, 3, 5, 66, 5});
        System.out.println(Arrays.toString(new int[] {2, 3, 5, 66, 5})); // function overriding 
        String name = null;
        System.out.println(name);
        
        // println() internally calls String.valueOf(obj) → uses toString() → 
        // converts value (e.g., 58) into a String, then prints it.



    }
}
