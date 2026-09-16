class Solution {
    public int min(int sr, int er, int sc, int ec, int[][] grid,int[][] dp) {
        if (sr > er || sc > ec) return Integer.MAX_VALUE;
        if (sr == er && sc == ec) return grid[sr][sc];
        if(dp[sr][sc]!=-1) return dp[sr][sc];
        int downways = min(sr, er, sc + 1, ec, grid,dp);
        int rightways = min(sr + 1, er, sc, ec, grid,dp);
        int ans = grid[sr][sc] + Math.min(downways, rightways);
        dp[sr][sc]=ans;
        return ans;
    }
    public int minPathSum(int[][] grid) {
        int sr = 0;
        int sc = 0;
        int er = grid.length;
        int ec = grid[0].length;
        int[][] dp=new int[er][ec];
        for(int i=0;i<er;i++){
            Arrays.fill(dp[i],-1);
        }
        int ans = min(sr, er-1, sc, ec-1, grid,dp);
        return ans;
    }
}