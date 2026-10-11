class Solution {
    public static String reverse(String s) {
        String ans = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            ans += s.charAt(i);
        }
        return ans;
    }
    public String reverseStr(String s, int k) {
        String ans = "";
        for (int i = 0; i < s.length(); i += 2 * k) {
            String temp = s.substring(i, Math.min(i + k, s.length()));
            ans += reverse(temp);
            if (i + k < s.length()) {
                ans += s.substring(i + k, Math.min(i + 2 * k, s.length()));
            }
        }
        return ans;
    }
}