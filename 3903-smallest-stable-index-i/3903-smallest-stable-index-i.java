class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int max_number = Integer.MIN_VALUE;
            int min_number = Integer.MAX_VALUE;
            for (int j = 0; j <= i; j++) {
                max_number = Math.max(max_number, nums[j]);
            }
            for (int j = i; j < nums.length; j++) {
                min_number = Math.min(min_number, nums[j]);
            }
            ans[i] = max_number - min_number;
        }
        for (int i = 0; i < nums.length; i++) {
            if (ans[i] <= k) {
                return i;
            }
        }
        return -1;
    }
}