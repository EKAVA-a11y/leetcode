class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] even = new int[nums.length / 2];
        int[] odd = new int[nums.length / 2];
        int c = 0;
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0)
                even[c++] = nums[i];
            else
                odd[j++] = nums[i];
        }
        int[] ans = new int[nums.length];
        int e = 0;
        int o = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0)
                ans[i] = even[e++];
            else
                ans[i] = odd[o++];
        }
        return ans;
    }
}