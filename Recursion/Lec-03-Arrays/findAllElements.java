import java.util.ArrayList;

public class findAllElements {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 9, 4, 4, 5, 17, 15};
        findAll(arr, 5, 0);
        System.out.println(list);
    }
    static ArrayList<Integer> list = new ArrayList<>();
    static void findAll(int[] arr, int target, int i) {
        if (i == arr.length) {
            return;
        }
        if (arr[i] == target) {
            list.add(i);
        }
        findAll(arr, target, i + 1);
    }
}
