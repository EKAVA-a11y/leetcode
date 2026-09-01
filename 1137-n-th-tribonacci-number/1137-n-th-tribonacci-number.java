class Solution {
    public static int helper(int[] dp,int n){
        if(n==0) return 0;
        if(n==1 || n==2) return 1;
        if(dp[n]!=-1) return dp[n];
        int ans=helper(dp,n-1)+helper(dp,n-2)+helper(dp,n-3);
        dp[n]=ans;
        return ans;
    }
    public int tribonacci(int n) {
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        int ans=helper(dp,n);
        return ans;
    }
}