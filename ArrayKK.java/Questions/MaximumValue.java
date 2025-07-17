public class MaximumValue {
    public static void main(String[] args) {
        int[] arr = {12, 22, 32, 14, 6, 38, 04};
        System.out.println(max(arr));
    }
    static int max(int[] arr) {
        int maxVal = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;

    }

    
}
