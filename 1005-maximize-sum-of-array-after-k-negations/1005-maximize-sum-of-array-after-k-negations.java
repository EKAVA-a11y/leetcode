class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int i = 0;
        while (i < nums.length && nums[i] < 0 && k > 0) {
            nums[i] = -nums[i];
            i++;
            k--;
        }
        int minIndex = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] < nums[minIndex]) {
                minIndex = j;
            }
        }
        if (k % 2 == 1) {
            nums[minIndex] = -nums[minIndex];
        }
        int sum = 0;
        for (int j = 0; j < nums.length; j++) {
            sum += nums[j];
        }
        return sum;
    }
}