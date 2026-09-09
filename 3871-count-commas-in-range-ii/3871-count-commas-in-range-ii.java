class Solution {
    public long countCommas(long n) {
        long commas = 0;
        if (n >= 1000) {
            commas += n - 999;
        }
        if (n >= 1000000) {
            commas += n - 999999;
        }
        if (n >= 1000000000) {
            commas += n - 999999999;
        }
        if (n >= 1000000000000L) {
            commas += n - 999999999999L;
        }
        if (n >= 1000000000000000L) {
            commas += n - 999999999999999L;
        }
        return commas;
    }
}