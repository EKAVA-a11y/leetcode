class Solution {
    public int maxFreqSum(String s) {
        int vowel_max = 0;
        int cons_max = 0;
        int[] letter = new int[26];
        for (int i = 0; i < s.length(); i++) {
            letter[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {
                vowel_max = Math.max(vowel_max, letter[i]);
            } else {
                cons_max = Math.max(cons_max, letter[i]);
            }
        }
        return vowel_max + cons_max;
    }
}