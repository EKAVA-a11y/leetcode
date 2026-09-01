import java.util.Arrays;
class Solution {
    public static int mincost(int[] cost,int[] dp,int n){
        if(n<=1){
            return cost[n];
        }
        if(dp[n]!=-1) return dp[n];
        int total=cost[n]+Math.min(mincost(cost,dp,n-1),mincost(cost,dp,n-2));
        dp[n]=total;
        return total;
    }
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        int ans=Math.min(mincost(cost,dp,n-1),mincost(cost,dp,n-2));
        return ans;
    }
}