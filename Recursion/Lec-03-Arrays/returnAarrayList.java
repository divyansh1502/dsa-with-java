
import java.util.ArrayList;

public class returnAarrayList {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 4, 4, 5};
        System.out.println(findAllIndex2(arr, 4, 0));
    }   
    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length) {
            return list;
        }
        // this will contain answer for that fn  call only 
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> answerFromBelowCalls = findAllIndex2(arr, target, index + 1);

        list.addAll(answerFromBelowCalls);
        return list;
    } 
}
