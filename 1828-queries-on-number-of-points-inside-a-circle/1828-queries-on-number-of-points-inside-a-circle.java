class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int x = queries[i][0];
            int y = queries[i][1];
            int r = queries[i][2];
            int count = 0;
            for (int j = 0; j < points.length; j++) {
                int px = points[j][0];
                int py = points[j][1];
                int dx = px - x;
                int dy = py - y;
                if (dx * dx + dy * dy <= r * r) {
                    count++;
                }
            }
            ans[i] = count;
        }
        return ans;
    }
}
