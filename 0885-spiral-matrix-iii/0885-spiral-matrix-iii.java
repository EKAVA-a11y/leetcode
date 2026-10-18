class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] ans = new int[rows * cols][2];
        int index = 0;
        int r = rStart, c = cStart;
        int steps = 1;
        ans[index][0] = r;
        ans[index++][1] = c;
        while (index < rows * cols) {
            for (int i = 0; i < steps; i++) {
                c++;
                if (r >= 0 && r < rows && c >= 0 && c < cols) {
                    ans[index][0] = r;
                    ans[index++][1] = c;
                }
            }
            for (int i = 0; i < steps; i++) {
                r++;
                if (r >= 0 && r < rows && c >= 0 && c < cols) {
                    ans[index][0] = r;
                    ans[index++][1] = c;
                }
            }
            steps++;
            for (int i = 0; i < steps; i++) {
                c--;
                if (r >= 0 && r < rows && c >= 0 && c < cols) {
                    ans[index][0] = r;
                    ans[index++][1] = c;
                }
            }
            for (int i = 0; i < steps; i++) {
                r--;
                if (r >= 0 && r < rows && c >= 0 && c < cols) {
                    ans[index][0] = r;
                    ans[index++][1] = c;
                }
            }
            steps++;
        }
        return ans;
    }
}