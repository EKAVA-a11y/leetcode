class Solution {
    public static int helper(int mid, int[] nums, int sum) {
        for (int i = 0; i < nums.length; i++) {
            sum += Math.abs(nums[mid] - nums[i]);
        }
        return sum;
    }
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int mid = nums.length / 2;
        int sum = 0;
        return helper(mid, nums, sum);
    }
}