
class Solution {
    public boolean isPalindrome(String s) {
        String k = "";
        for(int i = 0; i < s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));
            if(Character.isLetterOrDigit(ch)) {
                k += ch;
            }
        }
        for(int i = 0, j = k.length() - 1; i <= j; i++, j--) {
            if(k.charAt(i) != k.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
