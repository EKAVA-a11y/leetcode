class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> obj = new Stack<>();
        obj.push(0);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                obj.push(0);
            } 
            else {
                int val = obj.pop();
                if (val == 0) {
                    val = 1;
                } 
                else {
                    val = 2 * val;
                }
                int top = obj.pop();
                obj.push(top + val);
            }
        }
        return obj.pop();
    }
}