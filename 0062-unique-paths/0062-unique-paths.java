class Solution {
    public int rat(int sr, int sc, int er, int ec, int[][] dp) {
        if(sr > er || sc > ec) return 0;
        if(sr == er && sc == ec) return 1;
        if(dp[sr][sc] != -1) return dp[sr][sc];
        int rigthway = rat(sr + 1, sc, er, ec, dp);
        int downway = rat(sr, sc + 1, er, ec, dp);
        int ways = rigthway + downway;
        return dp[sr][sc] = ways;
    }
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int i = 0; i < m; i++) {
            Arrays.fill(dp[i], -1);
        }
        int total_ways = rat(0, 0, m - 1, n - 1, dp);
        return total_ways;
    }
}