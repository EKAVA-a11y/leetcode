class Solution {
    public int[][] generateMatrix(int n) {
        int el = n * n;
        int[][] ans = new int[n][n];
        int tr = 0;
        int br = n - 1;
        int fc = 0;
        int lc = n - 1;
        int k = 1;
        while (k <= el && tr <= br && fc <= lc) {
            for (int i = fc; i <= lc; i++) {
                ans[tr][i] = k;
                k++;
            }
            tr++;
            for (int i = tr; i <= br; i++) {
                ans[i][lc] = k;
                k++;
            }
            lc--;
            if (tr <= br) {
                for (int i = lc; i >= fc; i--) {
                    ans[br][i] = k;
                    k++;
                }
                br--;
            }
            if (fc <= lc) {
                for (int i = br; i >= tr; i--) {
                    ans[i][fc] = k;
                    k++;
                }
                fc++;
            }
        }
        return ans;
    }
}