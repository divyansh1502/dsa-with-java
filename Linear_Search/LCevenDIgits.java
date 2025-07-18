public class LCevenDIgits {
    public static void main(String[] args) {
        // Step 1: Create an integer array with multiple numbers
        int[] arr = {12, 6, 2542, 455, 958};

        // Step 2: Call the method that counts numbers with even digits and print the result
        System.out.println(digit(arr));  // Expected output: 2 (12 and 2542 have even number of digits)
    }

    // Method to count how many numbers in the array have an even number of digits
    static int digit(int[] arr) {

        int countEvenNumber = 0;  // This will store the final count of numbers with even digits

        // Step 3: Loop through each number in the array
        for (int i = 0; i < arr.length; i++) {

            int count = 0;        // Reset digit counter for each number
            int num = arr[i];     // Take the current number for processing

            // Step 4: Count how many digits are in the current number
            while (num > 0) {
                count++;         // Increase the digit count
                num /= 10;       // Remove the last digit (e.g., 2542 → 254 → 25 → 2 → 0)
            }

            // Step 5: Check if digit count is even
            if (count % 2 == 0) {
                countEvenNumber++;  // Increase final counter if it has even digits
            }
        }

        // Step 6: Return total count of numbers with even number of digits
        return countEvenNumber;
    }
}
