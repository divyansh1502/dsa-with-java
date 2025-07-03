
import java.util.Arrays;

public class PassinginFunction {
    public static void main(String[] args) {
        int[] arr = {22,55,32,11,14};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] arr) {
        arr[0] = 69;
    }
}
