import java.util.Arrays;
class Solution {
    public static int totalways(int[] dp, int n) {
        if (n <= 1) {
            return 1;
        }
        if (dp[n] != -1) {
            return dp[n];
        }
        int total = totalways(dp, n - 1) + totalways(dp, n - 2);
        dp[n] = total;
        return dp[n];
    }
    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return totalways(dp, n);
    }
}