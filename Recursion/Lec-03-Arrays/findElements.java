
public class findElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 4, 16, 58, 33, 65, 9};
        System.out.println(find(arr, 16, 0));
    }
    static boolean find(int[] arr, int target, int index) {
        if(index == arr.length) {
            return false;
        }
        return arr[index] == target || find(arr, target, index + 1);
    }

}
