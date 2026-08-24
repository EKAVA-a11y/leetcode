class Solution {
    public int countPartitions(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            int f_sum = 0;
            int l_sum = 0;
            for (int j = 0; j <= i; j++) {
                f_sum += nums[j];
            }
            for (int k = i + 1; k < nums.length; k++) {
                l_sum += nums[k];
            }
            if ((f_sum - l_sum) % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}