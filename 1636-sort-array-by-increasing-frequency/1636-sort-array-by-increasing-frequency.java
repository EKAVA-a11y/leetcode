class Solution {
    public static int minfreq(int[] arr) {
        int min = Integer.MAX_VALUE;
        int idx = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0 && arr[i] <= min) {
                min = arr[i];
                idx = i;
            }
        }

        return idx;
    }

    public int[] frequencySort(int[] nums) {
        int[] arr = new int[201];
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            arr[nums[i] + 100]++;
        }

        int k = 0;

        while (k < nums.length) {
            int min = minfreq(arr);

            while (arr[min] != 0) {
                ans[k] = min - 100;
                k++;
                arr[min]--;
            }
        }

        return ans;
    }
}