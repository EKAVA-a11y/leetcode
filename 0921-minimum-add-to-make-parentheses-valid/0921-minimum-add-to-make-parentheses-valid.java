class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> obj = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                obj.push('(');
            } 
            else {
                if (!obj.isEmpty() && obj.peek() == '(') {
                    obj.pop();
                } 
                else {
                    obj.push(')');
                }
            }
        }
        return obj.size();
    }
}