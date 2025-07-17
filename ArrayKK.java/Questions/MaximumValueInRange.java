public class MaximumValueInRange {
   
    public static void main(String[] args) {
        int[] arr = {12, 22, 32, 14, 6, 38, 04};
        System.out.println(maxRange(arr,1,4));
    }
    static int maxRange(int[] arr, int start, int end) {
        int maxVal = arr[start];
        for(int i = start; i < end; i++) {
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;

    }

    
}

    
