class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] freq = new int[1001];
        for (int i = 0; i < arr1.length; i++) {
            freq[arr1[i]]++;
        }
        int[] ans = new int[arr1.length];
        int k = 0;
        for (int i = 0; i < arr2.length; i++) {
            int x = arr2[i];
            while (freq[x] > 0) {
                ans[k++] = x;
                freq[x]--;
            }
        }
        for (int i = 0; i < freq.length; i++) {
            while (freq[i] > 0) {
                ans[k++] = i;
                freq[i]--;
            }
        }
        return ans;
    }
}