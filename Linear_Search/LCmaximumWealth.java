//https://leetcode.com/problems/richest-customer-wealth/
public class LCmaximumWealth {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {3, 2, 2}
        };
        System.out.println(maximumWealth(arr));
    }
    public static int maximumWealth(int[][] accounts) {
        //person = row
        //account = column
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            //When you start a new col, take a new sum for that row
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum += accounts[person][account];      
            }
            // now we have sum of account of person
            //Check with overall answer
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}
