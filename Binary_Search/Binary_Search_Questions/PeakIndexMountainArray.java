//https://leetcode.com/problems/peak-index-in-a-mountain-array/submissions/1706061685/
public class PeakIndexMountainArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7, 9, 4, 2, 1};
        System.out.println(searchPeakIndex(arr));
        
    }
    static int searchPeakIndex(int[] arr) {
            int start = 0;
            int end = arr.length-1;

            while (start < end) {
                //start < end as because when start become == end the while loop will terminate
                int mid = start + (end - start) / 2;

                if (arr[mid] < arr[mid + 1]) {
                    //you are in incresing part of the array so mid cannot be the answer so we take start as mid + 1 and search on right side of array
                    start = mid + 1;
                } else {
                    //you are in decresing part of the array but here the mid can be the answer so we take end = mid and search on left side of array
                    end = mid;
                } 
            }
            return start; // or end as both are equal
            //when start == end loop will terminate and we will find the peak value index
            //Start and end are always try to find max element in above 2 checks
            //hence, when they are pointing to just one element that was rhe maximum one because that is what the check say
            //more elaboration: at every time of start and end, they have the best possilbe answer till that time
            //and if we are saying that only one item is remaining,hence cuz of above line that is best possible answer
        }
    
}
