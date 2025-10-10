public class NoOfDigits {
    public static void main(String[] args) {
        int n = 34567;
        int b = 10;
        // replace n by any number like 10 and replace b by 2 to get number of digits in binary in this case its 4 
        int ans = (int)(Math.log(n) / Math.log(b)) + 1;

        System.out.println(ans);
    }
}
