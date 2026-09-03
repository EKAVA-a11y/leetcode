class Solution {
    public static int amount(int[] dp, int[] nums, int i, int end) {
        if (i > end) {
            return 0;
        }
        if (dp[i] != -1) {
            return dp[i];
        }
        int take = nums[i] + amount(dp, nums, i + 2, end);
        int skip = amount(dp, nums, i + 1, end);
        int ans = Math.max(take, skip);
        dp[i] = ans;
        return ans;
    }
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return nums[0];
        }
        int[] dp1 = new int[n];
        Arrays.fill(dp1, -1);
        int case1 = amount(dp1, nums, 0, n - 2);
        int[] dp2 = new int[n];
        Arrays.fill(dp2, -1);
        int case2 = amount(dp2, nums, 1, n - 1);
        return Math.max(case1, case2);
    }
}